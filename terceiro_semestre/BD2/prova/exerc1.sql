--1.  (2,5) Crie um esquema de banco de dados para a publicação de artigos:
--a.  Cada autor possui um código, nome, cpf;
--b.  É feito o cadastro das instituições e ensino, que possui um nome e um código;
--c.  Cada autor está ligado a uma instituição de ensino. Uma instituição de ensino pode ter vários 
--autores;
--d.  O artigo possui um código, um título e está ligado em uma área (biológicas, humanas ou exatas);
--e.  Um artigo pode ser escrito por vários autores.
--1.  (2,5) Crie um esquema de banco de dados para a publicação de artigos:
--a.  Cada autor possui um código, nome, cpf;
--b.  É feito o cadastro das instituições e ensino, que possui um nome e um código;
--c.  Cada autor está ligado a uma instituição de ensino. Uma instituição de ensino pode ter vários 
--autores;
--d.  O artigo possui um código, um título e está ligado em uma área (biológicas, humanas ou exatas);
--e.  Um artigo pode ser escrito por vários autores.

DROP TABLE IF EXISTS artigo;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS inst_ensino;
DROP TABLE IF EXISTS escrever_artigo;

CREATE TABLE inst_ensino(
	cod_inst INTEGER,
	nome_inst VARCHAR(50),
	PRIMARY KEY (cod_inst)
);


CREATE TABLE autor(
	cod_autor INTEGER,
	nome_autor VARCHAR(50),
	cpf VARCHAR(15),
	cod_inst INTEGER,
	PRIMARY KEY(cod_autor),
	FOREIGN KEY (cod_inst) REFERENCES inst_ensino(cod_inst)	
);

CREATE TABLE artigo(
	cod_artigo INTEGER,
	titulo VARCHAR(20),
	area VARCHAR(20),
	cod_autor INTEGER,
	PRIMARY KEY(cod_artigo)	
);

CREATE TABLE escrever_artigo(
	cod_artigo INTEGER,
	cod_autor INTEGER,
	PRIMARY KEY(cod_artigo, cod_autor),
	FOREIGN KEY(cod_artigo) REFERENCES artigo(cod_artigo),
	FOREIGN KEY(cod_autor) REFERENCES autor(cod_autor)
);

SELECT * FROM escrever_artigo;
SELECT * FROM autor;
SELECT * FROM artigo;
SELECT * FROM inst_ensino;
	