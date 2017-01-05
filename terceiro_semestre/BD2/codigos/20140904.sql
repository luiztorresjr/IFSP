--funções de janela
SELECT nome_emp
     , sal
     , AVG(sal) OVER (PARTITION BY n_dep)
FROM emp;

SELECT nome_emp
     , sal
     , x.media
FROM emp
   , (SELECT n_dep
           , AVG(sal) AS media
      FROM emp
      GROUP BY n_dep
     ) AS x
WHERE emp.n_dep = x.n_dep;

--rank salarial
SELECT nome_emp
     , sal
     , rank() OVER (ORDER BY sal DESC)
FROM emp;

--rank dos salários por departamento
SELECT nome_emp
     , sal
     , n_dep
     , rank() OVER (PARTITION BY n_dep ORDER BY sal DESC)
FROM emp;

SELECT *
FROM (SELECT nome_emp
           , sal
           , rank() OVER (ORDER BY sal DESC) AS rank
      FROM emp
     ) AS x
WHERE x.rank = 3;

--view com função de janela
CREATE VIEW emp_rank AS
SELECT nome_emp
     , sal
     , rank() OVER (ORDER BY sal DESC) AS rank
FROM emp;

SELECT * 
FROM emp_rank 
WHERE rank = 2;

--criando sequence
CREATE SEQUENCE testando;

--usando função sem tabela
SELECT ROUND(100.2);

--"rodando" a sequence
SELECT nextval('testando');

--recuperar o último valor da sequence
SELECT currval('testando');

--alterar o valor da sequence
SELECT setval('testando', 1);

--obter informações da sequence
SELECT * FROM testando;

--alterando a sequence
ALTER SEQUENCE testando INCREMENT 2;
SELECT nextval('testando');

--apagando a sequence
DROP SEQUENCE testando;
CREATE SEQUENCE testando;

--usando a sequence no insert
INSERT INTO dep VALUES ( nextval('testando')
                       , 'RH'
                       , 'Hortolândia'
                       );

--inserir um novo funcionário
--no cargo de analista
--que ele ganhe o menor salário dos analistas
INSERT INTO emp VALUES ( 900
                       , 'José'
                       , 'Analista'
                       , 175
                       , '2014-09-04'
                       , (SELECT MIN(sal) FROM emp WHERE cargo = 'Analista')
                       , NULL
                       , 20
                       );

--que o funcionário analista 
--ganhe a média salarial dos analistas
INSERT INTO emp VALUES ( 800
                       , UPPER('José')
                       , 'Analista'
                       , 175
                       , '2014-09-04'
                       , (SELECT ROUND(AVG(sal)) FROM emp WHERE cargo = 'Analista')
                       , NULL
                       , 20
                       );

--default
--se não for informado um valor
--para a coluna, então o valor do default é utilizado
CREATE TABLE teste_default(
  id int DEFAULT 0,
  descricao varchar(20)
);

INSERT INTO teste_default(descricao) VALUES ('teste');
SELECT * FROM teste_default;

INSERT INTO teste_default VALUES (100, 'teste');
SELECT * FROM teste_default;

INSERT INTO teste_default VALUES (NULL, 'teste');
SELECT * FROM teste_default;

--"tipo" serial
CREATE TABLE teste_serial(
  id serial,
  nome varchar(20),
  PRIMARY KEY (id)
);

INSERT INTO teste_serial(nome) VALUES ('teste');
SELECT * FROM teste_serial;

INSERT INTO teste_serial(nome) VALUES ('teste');
SELECT * FROM teste_serial;

--vai dar erro, porque já tem 2 em id
INSERT INTO teste_serial VALUES (2, 'teste');
SELECT * FROM teste_serial;

--rodando o default explicitamente
INSERT INTO teste_serial VALUES (DEFAULT, 'teste');
SELECT * FROM teste_serial;

--visões / views
CREATE VIEW emps_30 AS
SELECT *
FROM emp
WHERE n_dep = 30;

SELECT * FROM emps_30;

--equivalente subconsulta
SELECT * FROM (SELECT *
               FROM emp
               WHERE n_dep = 30) AS emps_30;

--posso tratra a view como uma tabela
SELECT * 
FROM emps_30
WHERE cargo = 'Diretor';

--criando view 2
CREATE VIEW emps_30_sem_sal AS
SELECT nome_emp
     , cargo
     , com
FROM emp
WHERE n_dep = 30;

--erro, coluna não existe na views
SELECT * 
FROM emps_30_sem_sal
WHERE sal > 1000;

CREATE VIEW emps_com_gasto AS
SELECT emp.*
     , emp.sal + COALESCE(emp.com, 0) AS gasto
FROM emp;

SELECT nome_emp
     , gasto 
FROM emps_com_gasto;

SELECT SUM(gasto)
FROM emps_com_gasto;


--escrita nas views
CREATE VIEW emps_deps AS
SELECT emp.*
     , dep.n_dep AS dep_n_dep
     , dep.nome_dep
     , dep.local_dep
FROM emp
   , dep
WHERE emp.n_dep = dep.n_dep;

select * from emps_deps

--erro
--view tem 2 tabelas no from
INSERT INTO emps_deps VALUES ( 1000
                             , 'João'
                             , 'Analista'
                             , NULL
                             , '2014-9-04'
                             , 1000
                             , NULL
                             , 30
                             , 90
                             , 'XYZ'
                             , 'HTO'
                             );

--DISTINCT
SELECT n_dep
FROM emp
GROUP BY n_dep;

SELECT DISTINCT n_dep
FROM emp;

--LIMIT e OFFSET
SELECT *
FROM emp
ORDER BY sal DESC
LIMIT 4;

SELECT *
FROM emp
LIMIT 4 OFFSET 2;

--não pode fazer INSERT/UPDATE/DELETE
--pq tem função de agregação e group by 
CREATE VIEW media_salarial AS
SELECT n_dep
     , AVG(sal)
FROM emp
GROUP BY n_dep;




