--TRABALHO FINAL DE BANCO DE DADOS II
--BRUNO CHRISOSTOMO 	132052-1
--LUIZ TORRES 			132067-X
--PAULO IZUMI 			132076-9
--RENATO BARBOSA 		132078-5

DROP TABLE IF EXISTS funcionario CASCADE;
DROP TABLE IF EXISTS medicamento CASCADE;
DROP TABLE IF EXISTS farmacia CASCADE;
DROP TABLE IF EXISTS estoque CASCADE;
DROP TABLE IF EXISTS vendas CASCADE;
DROP FUNCTION IF EXISTS f_estoq() CASCADE;
DROP FUNCTION IF EXISTS f_quant() CASCADE;

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

CREATE TABLE medicamento(
cod_medicamento integer PRIMARY KEY,
nome_medicamento varchar (30)NOT NULL,
principio_ativo varchar (30) NOT NULL,
nome_laboratorio varchar (30) NOT NULL,
posologia varchar (50) NOT NULL,
id_medicamento_controlado integer NOT NULL
);

CREATE TABLE estoque(
cod_estoque integer PRIMARY KEY,
local_estoque varchar (30)NOT NULL,
quantidade_medicamento_estoque integer NOT NULL,
cod_medicamento integer,
status varchar(20),
FOREIGN KEY(cod_medicamento) REFERENCES medicamento(cod_medicamento)
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
cod_medicamento integer, 
cod_funcionario integer, 
FOREIGN KEY(cod_medicamento) REFERENCES medicamento(cod_medicamento),
FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario)
);


--função para atualizar valor em estoque quando for adicionado ou atualizado na tabela de vendas
CREATE OR REPLACE FUNCTION f_estoq() RETURNS trigger AS $$
BEGIN

	SELECT COUNT(quantidade_medicamento_estoque)
	INTO aux
	FROM estoque
	WHERE cod_medicamento = NEW.cod_medicamento;
	
	IF(aux < NEW.quantidade_pedido) THEN
		RETURN NULL;
		RAISE NOTICE 'Quantia de venda maior que de estoque';
	END IF;
	--atualiza o estoque 
	UPDATE estoque
--seta a subtração do estoque 
	SET quantidade_medicamento_estoque = estoque.quantidade_medicamento_estoque - NEW.quantidade_pedido
	WHERE cod_medicamento = NEW.cod_medicamento;
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
		--conta quantos medicamentos do cod selecionado tem em estoque
		SELECT COUNT(quantidade_medicamento_estoque)
		INTO aux
		FROM estoque
		WHERE NEW.cod_medicamento = NEW.cod_medicamento;
		--se tiver menos de 10 ou 10 medicamentos entrará neste if que avisa que 
		--esta em pouca quantidade o medicamento atualizado ou inserido
		IF(aux >10 ) THEN
			UPDATE estoque
			SET status = 'Estoque maior que 10.';	
			RETURN NEW;
		End IF;
		IF(aux < 10)THEN
			UPDATE estoque
			SET status = ' Estoque menor que 10.';
			RETURN NEW;
		END IF;
		UPDATE estoque
		SET status = 'Estoque igual a 10.';
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


--este indice é para otimizar pesquisas no estoque com a tabela medicamento, para calculo 
--e gerar relatorios mais rapidos para o usuario.

CREATE INDEX idx_estoque ON estoque(cod_medicamento);
CREATE INDEX idx_medicamento ON medicamento(cod_medicamento);

