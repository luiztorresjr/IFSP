--TRABALHO FINAL DE BANCO DE DADOS II
--ESQUEMA FISICO
--BRUNO CHRISOSTOMO 	132052-1
--LUIZ TORRES 			132067-X
--PAULO IZUMI 			132076-9
--RENATO BARBOSA 		132078-5

DROP FUNCTION IF EXISTS f_estoq() CASCADE;
DROP TRIGGER IF EXISTS tg_estoq ON venda;
DROP FUNCTION IF EXISTS f_quant() CASCADE;
DROP TRIGGER IF EXISTS tg_quant ON venda;


DROP TABLE IF EXISTS farmacia CASCADE;
DROP TABLE IF EXISTS medicamento CASCADE;
DROP TABLE IF EXISTS funcionario CASCADE;
DROP TABLE IF EXISTS laboratorio CASCADE;
DROP TABLE IF EXISTS venda CASCADE;
DROP TABLE IF EXISTS farmaceutico CASCADE;
DROP TABLE IF EXISTS telefone CASCADE;
DROP TABLE IF EXISTS estoque CASCADE;


DROP INDEX IF EXISTS idx_estoque CASCADE;
DROP INDEX IF EXISTS idx_medicamento CASCADE;

CREATE TABLE farmacia(	
	cod_farmacia INTEGER,
	nome_farmacia VARCHAR(20),
	cep INTEGER,
	telefone INTEGER,
	PRIMARY KEY(cod_farmacia)
);	

CREATE TABLE laboratorio(
	cod_laboratorio INTEGER,
	nome_laboratorio VARCHAR(50),	
	PRIMARY KEY(cod_laboratorio)
);

CREATE TABLE medicamento(
	cod_medicamento INTEGER,
	nome_comercial varchar (30)NOT NULL,
	viaDeAdm varchar (30) NOT NULL,
	cod_laboratorio INTEGER,
	FOREIGN KEY(cod_laboratorio) REFERENCES laboratorio(cod_laboratorio),
	PRIMARY KEY(cod_medicamento)
);

CREATE TABLE estoque(
	cod_farmacia INTEGER,
	cod_medicamento INTEGER,
	quantidade_estoque INTEGER NOT NULL,
	FOREIGN KEY(cod_farmacia) REFERENCES farmacia (cod_farmacia),
	FOREIGN KEY(cod_medicamento) REFERENCES medicamento (cod_medicamento),	
	PRIMARY KEY(cod_farmacia, cod_medicamento),
	CHECK(quantidade_estoque >= 0 )
);

CREATE TABLE funcionario(
	cod_funcionario INTEGER,
	nome_funcionario VARCHAR(50),
	cpf INTEGER UNIQUE,
	cargo VARCHAR(20),
	cod_farmacia INTEGER,
	FOREIGN KEY (cod_farmacia) REFERENCES farmacia (cod_farmacia),
	PRIMARY KEY(cod_funcionario)
);

CREATE TABLE telefone(
	cod_funcionario INTEGER,
	telefone INTEGER,
	FOREIGN KEY (cod_funcionario) REFERENCES funcionario(cod_funcionario), 
	PRIMARY KEY (cod_funcionario, telefone)
	);

CREATE TABLE farmaceutico(
	cod_funcionario INTEGER,
	crf INTEGER,
	FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario),
	PRIMARY KEY (crf)
);

CREATE TABLE venda(
	id_venda INTEGER,
	cod_funcionario INTEGER,
	cod_farmacia INTEGER,
	cod_medicamento INTEGER,
	quantidade_venda INTEGER,
	data_venda DATE,
	hora_venda time,	
	FOREIGN KEY(cod_funcionario) REFERENCES funcionario(cod_funcionario),
	FOREIGN KEY(cod_medicamento, cod_farmacia) REFERENCES estoque(cod_medicamento, cod_farmacia),
	PRIMARY KEY(id_venda)
);

--função para atualizar valor em estoque quando for adicionado ou atualizado na tabela de vendas
CREATE OR REPLACE FUNCTION f_estoq() RETURNS trigger AS $$
--Variaveis para facilitar as comparações
DECLARE aux INTEGER; --essa variavel armazena a quantida da venda
DECLARE	valor INTEGER; --essa variavel armazena a quantia do estoque
DECLARE resultado INTEGER; --essa variavel armazenará a diferença entre valor e aux	
BEGIN
	--variavel aux recebe a quantia do insert da venda
	aux = NEW.quantidade_venda;
	SELECT quantidade_estoque
	INTO valor --variavel valor recebe a quantia do estoque
	FROM estoque
	WHERE cod_medicamento = NEW.cod_medicamento AND cod_farmacia = NEW.cod_farmacia;
	resultado = valor - aux; --variavel resultado recebe a diferença de valor e aux
	IF resultado < 0 THEN	
		RAISE NOTICE 'QUANTIA DE VENDA MAIOR QUE DE ESTOQUE';
		RETURN NULL;
	ELSEIF resultado =  0 THEN			
			--atualiza o estoque 
			UPDATE estoque
			--seta a subtração do estoque 
			SET quantidade_estoque = quantidade_estoque - NEW.quantidade_venda
			WHERE cod_medicamento = NEW.cod_medicamento AND cod_farmacia = NEW.cod_farmacia;
			RAISE NOTICE 'COMPRA COM SUCESSO. ESTOQUE ZERADO ABASTEÇA';
			RETURN NEW;
	ELSE
			--atualiza o estoque 
			UPDATE estoque
			--seta a subtração do estoque 
			SET quantidade_estoque = quantidade_estoque - NEW.quantidade_venda
			WHERE cod_medicamento = NEW.cod_medicamento AND cod_farmacia = NEW.cod_farmacia;
		IF resultado > 10 OR resultado = 10 THEN			
			RAISE NOTICE 'COMPRA COM SUCESSO.';
			RETURN NEW;	
		ELSEIF resultado > 0 AND resultado < 10 THEN 
			RAISE NOTICE 'COMPRA COM SUCESSO. ESTOQUE MENOR QUE 10 ABASTEÇA';
			RETURN NEW;
		END IF;		
	END IF;	
		RAISE NOTICE 'MEDICAMENTO NÃO DISPONÍVEL ESTOQUE IGUAL A 0.';
		RETURN NULL;
END;
$$ LANGUAGE plpgsql;

--trigger para ser ativado antes que seja inserido para confirmar quanto tem no estoque.
CREATE TRIGGER tg_estoq 
BEFORE INSERT
ON venda
FOR EACH ROW
EXECUTE PROCEDURE f_estoq();

--este indice é para otimizar pesquisas no estoque com a tabela medicamento, para calculo 
--e gerar relatorios mais rapidos para o usuario.

CREATE INDEX idx_farmacia ON estoque(cod_farmacia);
CREATE INDEX idx_medicamento ON estoque(cod_medicamento);