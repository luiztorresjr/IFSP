
--função para atualizar valor em estoque quando for adicionado ou atualizado na tabela de vendas
CREATE OR REPLACE FUNCTION f_estoq() RETURNS trigger AS $$
BEGIN
	SELECT quantidade_produto_estoque
	INTO v_quantidade_produto_estoque
	FROM estoque;
	
	IF(v_quantidade_produto_estoque < NEW.quantidade_pedido) THEN
		RETURN NULL;
		RAISE NOTICE ('Valor de venda maior que de estoque');
	END IF;
	--atualiza o estoque 
	UPDATE estoque
	--seta a subtração do estoque 
	SET quantidade_produto_estoque = estoque.quantidade_produto_estoque - vendas.quantidade_pedido
	From (select vendas.quantidade_pedido from vendas) as vendas;
	RETURN NEW;
	
END;
$$ LANGUAGE plpgsql;

--trigger para ser ativado antes que seja inserido ou atualiza para confirmar quanto tem no estoque.
CREATE TRIGGER tg_estoq 
BEFORE UPDATE OR INSERT
ON vendas
FOR EACH ROW
EXECUTE PROCEDURE f_estoq();


--Função para analisar quantia de remedios inseridos(novo)
-- ou atualizado(remoção ou compra) do estoque
CREATE FUNCTION f_quant() RETURNS trigger AS $$
Declare 
--variavel para facilitar a comparação para o uso do if
	aux integer;
BEGIN
		--conta quantos produtos do cod selecionado tem em estoque
		SELECT COUNT(quantidade_produto_estoque)
		INTO aux
		FROM estoque
		WHERE  cod_produto = NEW.cod_produto;
		--se tiver menos de 10 ou 10 produtos entrará neste if que avisa que 
		--esta em pouca quantidade o produto atualizado ou inserido
		IF(aux < 10 OR aux = 10) THEN
		RAISE EXCEPTION 'Produto com quantidade baixa compre mais. ', aux;
		RETURN NEW;
		End IF;
		RETURN NEW;
END;
$$ Language plpgsql;	
--o trigger será ativado a cada comando de update ou insert para calculo em tempo real
--sempre antes do comando para mensagem ser mais precisa
CREATE TRIGGER tg_quant 
BEFORE INSERT OR UPDATE
ON vendas
FOR EACH ROW
EXECUTE PROCEDURE f_quant();


--este indice é para otimizar pesquisas no estoque com a tabela produto, para calculo 
--e gerar relatorios mais rapidos para o usuario.

CREATE INDEX idx_cod_produto ON estoque(cod_produto);

-- Schema: public

-- DROP SCHEMA public;

CREATE SCHEMA public
  AUTHORIZATION postgres;

GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;
COMMENT ON SCHEMA public
  IS 'standard public schema';
