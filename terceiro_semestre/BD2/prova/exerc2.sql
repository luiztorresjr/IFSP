--REsposta no final
--Luiz Torres Junior
--132067-x
--18-09-2014

DROP TABLE IF EXISTS aluno_excursao;
DROP TABLE IF EXISTS aluno;
DROP TABLE IF EXISTS excursao;
DROP TABLE IF EXISTS local;
DROP TABLE IF EXISTS cep;

CREATE TABLE aluno(
  cod_aluno int,
  prontuario varchar(20),
  nome varchar(20),
  data_nascimento date,
  data_ingresso date,
  sexo char(1),
  PRIMARY KEY(cod_aluno)
);

INSERT INTO aluno VALUES (1, '123X', 'Marcos', '1998-01-02', '2013-01-01', 'M');
INSERT INTO aluno VALUES (2, '145Z', 'Laura', '1997-03-20', '2013-01-01', 'F');
INSERT INTO aluno VALUES (3, '335U', 'Camila', '1990-01-01', '2012-01-01', 'F');
INSERT INTO aluno VALUES (4, '389Z', 'Carlos', '1975-10-15', '2010-01-01', 'M');
INSERT INTO aluno VALUES (5, '885X', 'Mário', '1991-01-01', '2014-07-01', 'M');
INSERT INTO aluno VALUES (6, '885P', 'Rebeca', '1997-12-31', '2013-07-01', 'F');
INSERT INTO aluno VALUES (7, '889Y', 'Marcos', '1996-11-30', '2012-07-01', 'M');
INSERT INTO aluno VALUES (8, '099H', 'Melinda', '1995-05-30', '2011-01-01', 'F');

CREATE TABLE cep(
  cod_cep int,
  cidade varchar(20),
  estado char(2),
  pais varchar(20)
);

INSERT INTO cep VALUES (1, 'São Paulo', 'SP', 'Brasil');
INSERT INTO cep VALUES (2, 'Foz do Iguaçu', 'PR', 'Brasil');
INSERT INTO cep VALUES (3, 'Rio de Janeiro', 'RJ', 'Brasil');
INSERT INTO cep VALUES (4, 'Paris', NULL, 'França');
INSERT INTO cep VALUES (5, 'Roma', NULL, 'Itália');

CREATE TABLE local(
  cod_local int,
  descricao varchar(20),
  cod_cep int
);

INSERT INTO local VALUES (1, 'MASP', 1);
INSERT INTO local VALUES (2, 'FILE', 1);
INSERT INTO local VALUES (3, 'Itaipú', 2);
INSERT INTO local VALUES (4, 'Pão de Açúcar', 3);
INSERT INTO local VALUES (5, 'Torre Eiffel', 3);

CREATE TABLE excursao(
  cod_excursao int,
  data_ida date,
  date_retorno date,
  preco numeric,
  cod_local int,
  PRIMARY KEY(cod_excursao)
);

INSERT INTO excursao VALUES (1, '2014-03-03', '2014-03-03', 100, 1);
INSERT INTO excursao VALUES (2, '2014-04-03', '2014-04-03', 80, 2);
INSERT INTO excursao VALUES (3, '2014-05-10', '2014-05-15', 800, 3);
INSERT INTO excursao VALUES (4, '2014-10-11', '2014-10-20', 2000, 4);
INSERT INTO excursao VALUES (5, '2014-12-11', '2014-11-15', 500, 3);
INSERT INTO excursao VALUES (6, '2015-01-01', '2015-01-20', 5000, 4);

CREATE TABLE aluno_excursao(
  cod_aluno int,
  cod_excursao int,
  FOREIGN KEY(cod_aluno) REFERENCES aluno(cod_aluno),
  FOREIGN KEY(cod_excursao) REFERENCES excursao(cod_excursao)
);

INSERT INTO aluno_excursao VALUES (1, 5);
INSERT INTO aluno_excursao VALUES (1, 3);
INSERT INTO aluno_excursao VALUES (2, 3);
INSERT INTO aluno_excursao VALUES (2, 4);
INSERT INTO aluno_excursao VALUES (5, 1);
INSERT INTO aluno_excursao VALUES (5, 2);
INSERT INTO aluno_excursao VALUES (5, 3);
INSERT INTO aluno_excursao VALUES (5, 4);
INSERT INTO aluno_excursao VALUES (7, 5);
INSERT INTO aluno_excursao VALUES (8, 5);

--2.  (7,5) Crie o banco de dados com o conteúdo do arquivo prova_p1.sql e execute os comandos a seguir:
--a.  (2,50) Com base no esquema conceitual:
--i.  (0,50) Adicionar as restrições de chave primária e estrangeira;
ALTER TABLE cep ADD PRIMARY KEY (cod_cep);
ALTER TABLE local ADD PRIMARY KEY(cod_local),;
ALTER TABLE local FOREIGN KEY (cod_cep) REFERENCES cep(cod_cep);
ALTER TABLE excursao ADD FOREIGN KEY (cod_cep) REFERENCES cep(cod_cep);


--ii.  (0,50) Tornar obrigatório que o usuário forneça a descrição de um local;
ALTER TABLE local COLUMN descricao SET NOT NULL;

--iii.  (0,50) Restringir para que só seja possível cadastrar uma excursão com valor superior a zero;
ALTER TABLE excursao ADD CHECK(preco > 0);

 --iv.  (0,50) Restringir para que dois alunos não possam ter o mesmo prontuário;
 ALTER TABLE aluno COLUMN prontuario SET UNIQUE;
 
 --v.  (0,25) Restringir para que um aluno não possa fazer a mesma excursão duas vezes;
	ALTER TABLE aluno_excursao ADD PRIMARY KEY(cod_aluno, cod_excursao);
	
--vi.  (0,25) Restringir o domínio do sexo do aluno para M ou F apenas.
ALTER TABLE aluno ADD CHECK (sexo ='M') OR ADD CHECK (sexo ='F');

--b.  (5,00) Forneça o SQL para os itens abaixo:
--i.  (0,50) O local da Torre Eiffel está errado. Altere para que fique em Paris, na França;

UPDATE local
SET cod_local = 4
WHERE descricao = 'Torre Eiffel';
SELECT * FROM local;

--ii.  (1,00) Listar o nome do aluno juntamente com o nome do local da excursão. As excursões sem alunos também devem aparecer na lista;
SELECT 	nome,
	descricao
FROM 	aluno,
	local
WHERE  cod_aluno IN(SELECT cod_aluno FROM aluno_excursao)
	AND cod_local IN(SELECT cod_local FROM excursao			
			WHERE cod_excursao IN(SELECT cod_excursao FROM aluno_excursao
						GROUP BY cod_excursao)
			GROUP BY cod_local)
ORDER BY nome,descricao

--iii.  (1,00) Apresente a consulta para realizar a soma de quanto foi gasto no total das excursões por local;

SELECT 	cod_local,
	SUM(ex.preco) OVER (PARTITION BY cod_local)
FROM	excursao as ex
	RIGHT JOIN(SELECT  cod_excursao,
				COUNT(*)
		FROM aluno_excursao
		GROUP BY cod_excursao) as qtd
		
	ON ex.cod_excursao=qtd.cod_excursao;
	
--iv.  (0,50) Liste os alunos que não fizeram excursão;

SELECT *
FROM aluno
WHERE  cod_aluno NOT IN(SELECT cod_aluno FROM aluno_excursao);

--v.  (0,50) Liste apenas os locais que tiveram excursão;

SELECT * 
FROM local
WHERE cod_local IN (SELECT e.cod_local FROM excursao as e,
		aluno_excursao as ae
		WHERE e.cod_excursao = ae.cod_excursao
		GROUP BY cod_local);
		
--vi.  (0,50) Inserir um novo local: Orlando, Estados Unidos;

INSERT INTO cep VALUES (6, 'Orlando', NULL, 'Estados Unidos');

--vii.  (0,50) Alterar o preço em 20% para os destinos internacionais;
UPDATE excursao
SET preco = preco*1.2;

SELECT * FROM cep;
--viii.  (0,50) Apagar os ceps que não têm destino. 
DELETE FROM cep
WHERE cod_cep IN (SELECT cod_cep FROM cep
	WHERE cod_cep NOT IN (SELECT cod_cep FROM local))


--Exercicio 1
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
	