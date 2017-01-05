--Ex1
CREATE TABLE instituicao(
  codigo int,
  nome varchar(100),
  PRIMARY KEY (codigo)
);

CREATE TABLE autor(
  codigo int,
  nome varchar(100),
  cpf varchar(20),
  cod_instituicao int,
  PRIMARY KEY (codigo),
  FOREIGN KEY(cod_instituicao) 
    REFERENCES instituicao(codigo)
);

CREATE TABLE area(
  codigo int,
  descricao varchar(100),
  PRIMARY KEY(codigo)
);

CREATE TABLE artigo(
  codigo int,
  titulo varchar(100),
  codigo_area int,
  PRIMARY KEY (codigo),
  FOREIGN KEY (codigo_area) REFERENCES area(codigo)
);

CREATE TABLE autor_artigo(
  codigo_autor int,
  codigo_artigo int,
  FOREIGN KEY (codigo_autor) REFERENCES autor(codigo),
  FOREIGN KEY (codigo_artigo) REFERENCES artigo(codigo),
  PRIMARY KEY (codigo_autor, codigo_artigo)
);

--Ex2
--i
ALTER TABLE cep ADD PRIMARY KEY (cod_cep);
ALTER TABLE local ADD PRIMARY KEY (cod_local);
ALTER TABLE aluno_excursao 
  ADD PRIMARY KEY(cod_aluno, cod_excursao);

ALTER TABLE local
  ADD FOREIGN KEY(cod_cep) REFERENCES cep(cod_cep);

ALTER TABLE excursao
  ADD FOREIGN KEY(cod_local) REFERENCES local(cod_local);

--ii
ALTER TABLE local ALTER COLUMN descricao SET NOT NULL;

--iii
ALTER TABLE excursao ADD CHECK (preco > 0);

--iv
ALTER TABLE aluno ADD UNIQUE(prontuario);

--v
ALTER TABLE aluno_excursao 
  ADD PRIMARY KEY(cod_aluno, cod_excursao);

--vi
ALTER TABLE aluno ADD CHECK (sexo IN ('M', 'F'));

ALTER TABLE aluno ADD CHECK (sexo = 'M' OR sexo = 'F');

--b

--i
UPDATE local
SET cod_cep = 4
WHERE cod_local = 5;

UPDATE local
SET cod_cep = 4
WHERE descricao = 'Torre Eiffel';

--ii
SELECT d.cod_aluno
     , d.nome
     , c.descricao
FROM aluno_excursao a
   , excursao       b
   , local          c
   , aluno          d
WHERE a.cod_aluno    = d.cod_aluno
  AND a.cod_excursao = b.cod_excursao
  AND b.cod_local    = c.cod_local;

--essa é a resposta
SELECT d.cod_aluno
     , d.nome
     , c.descricao
     , a.cod_excursao
FROM      excursao       a
LEFT JOIN aluno_excursao b
       ON (a.cod_excursao = b.cod_excursao)
LEFT JOIN local c
       ON (a.cod_local = c.cod_local)
LEFT JOIN aluno d
       ON (b.cod_aluno = d.cod_aluno);

--iii
SELECT c.descricao
     , SUM(b.preco)
FROM aluno_excursao a
   , excursao       b
   , local          c
WHERE a.cod_excursao = b.cod_excursao
  AND b.cod_local    = c.cod_local
GROUP BY c.descricao;

--iv
SELECT cod_aluno
     , nome
FROM aluno
WHERE cod_aluno NOT IN ( SELECT cod_aluno 
                         FROM aluno_excursao
                       );

SELECT cod_aluno
     , nome
FROM aluno a
WHERE NOT EXISTS ( SELECT 1
                   FROM aluno_excursao b
                   WHERE b.cod_aluno = a.cod_aluno
                 );

--v
SELECT *
FROM local
WHERE cod_local IN ( SELECT cod_local
                     FROM aluno_excursao a
                        , excursao       b
                     WHERE a.cod_excursao = b.cod_excursao
                   );

--vi
INSERT INTO cep VALUES (6, 'Orlando', NULL, 'EUA');

--vii
UPDATE excursao
SET preco = preco * 1.2
WHERE cod_local IN ( SELECT a.cod_local
                     FROM local a
                        , cep   b
                     WHERE a.cod_cep = b.cod_cep
                       AND b.pais   <> 'Brasil'
                   );

--viii
DELETE FROM cep
WHERE cod_cep NOT IN ( SELECT c.cod_cep
                       FROM excursao a
                            , local    b
                            , cep      c
                       WHERE a.cod_local = b.cod_local
                         AND c.cod_cep   = b.cod_cep
                     );

--Desafios
--1
CREATE VIEW excursoes_2014 AS
SELECT d.*
     , b.preco
FROM aluno_excursao a
   , excursao       b
   , local          c
   , cep            d
WHERE a.cod_excursao = b.cod_excursao
  AND b.cod_local    = c.cod_local
  AND c.cod_cep      = d.cod_cep
  AND b.data_ida BETWEEN '2014-01-01' AND '2014-12-31';

--2
