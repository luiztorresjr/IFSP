CREATE TABLE funcionario(
cod_funcionario integer PRIMARY KEY,
nome varchar (30)NOT NULL,
registro_Crf integer UNIQUE NOT NULL,
matricula integer NOT NULL,
cpf  integer UNIQUE NOT NULL,
telefone1 integer,
telefone2 integer,
cargo varchar (30)NOT NULL,
endereco varchar(50)NOT NULL,
sal numeric(10,2) NOT NULL
);

CREATE TABLE produto(
cod_produto integer PRIMARY KEY,
nome_produto varchar (30)NOT NULL,
principio_ativo varchar (30) NOT NULL,
nome_laboratorio varchar (30) NOT NULL,
posologia varchar (50) NOT NULL,
id_produto_controlado integer NOT NULL
);

CREATE TABLE estoque(
cod_estoque integer PRIMARY KEY,
local_estoque varchar (30)NOT NULL,
quantidade_produto_estoque integer NOT NULL,
cod_produto integer,
FOREIGN KEY(cod_produto) REFERENCES produto(cod_produto)
);

CREATE TABLE farmacia(
codigo integer PRIMARY KEY,
nome varchar (30)NOT NULL,
cep  integer NOT NULL,
telefone integer NOT NULL,
cidade varchar(30) NOT NULL,
registro_Crf integer,
cod_estoque integer,
cod_funcionario integer,
FOREIGN KEY(registro_Crf) REFERENCES funcionario(registro_Crf),
FOREIGN KEY(cod_estoque) REFERENCES estoque(cod_estoque),
FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario)
);

CREATE TABLE vendas(
num_pedido integer PRIMARY KEY,
dat_horario timestamp,
quantidade_pedido integer NOT NULL,
cod_produto integer, 
cod_funcionario integer, 
FOREIGN KEY(cod_produto) REFERENCES produto(cod_produto),
FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario)
);


--função para atualizar valor em estoque quando for adicionado ou atualizado na tabela de vendas
CREATE OR REPLACE FUNCTION f_estoq() RETURNS trigger AS $$
BEGIN
--atualiza o estoque 
	UPDATE estoque
--seta a subtração do estoque 
	SET quantidade_produto_estoque = estoque.quantidade_produto_estoque - vendas.quantidade_pedido
	From (select vendas.quantidade_pedido from vendas) as vendas;
	IF(quantidade_produto_estoque < vendas.quantidade_pedido) THEN
		RETURN 0;
		RAISE EXCEPTION 'Valor de venda maior que de estoque';
	END IF;
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
		WHERE NEW.cod_produto = cod_produto;
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
