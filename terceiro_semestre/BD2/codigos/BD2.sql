--Apaga as tabelas
DROP TABLE emp;
DROP TABLE dep;
DROP TABLE faixa_sal;

--Tabela dep
CREATE TABLE dep (
    n_dep integer,
    nome_dep varchar(20),
    local_dep varchar(30),
    PRIMARY KEY (n_dep)
);
----------------------------------------------------------------------------------------------------
INSERT INTO dep VALUES (10, 'Administracao', 'Campinas');
INSERT INTO dep VALUES (20, 'Pesquisa', 'Campinas');
INSERT INTO dep VALUES (30, 'Vendas', 'Sao Paulo');
INSERT INTO dep VALUES (40, 'Producao', 'Sao Paulo');
------------------------------------------------------------------------------------------------------
--Tabela emp
CREATE TABLE emp (
    n_emp integer,
    nome_emp varchar(30) NOT NULL,
    cargo varchar(10) NOT NULL,
    chefe integer,
    data_adm date,
    sal numeric(10,2) NOT NULL,
    com numeric(10,2),
    n_dep integer,
    PRIMARY KEY (n_emp),
    FOREIGN KEY(n_dep) REFERENCES dep(n_dep),
    CHECK (sal > 0)
);
--------------------------------------------------------------------------------------------------------
INSERT INTO emp VALUES (103, 'Silvia', 'Analista', 110, '2003-03-17', 150000.00, NULL, 20);
INSERT INTO emp VALUES (110, 'Ubaldo', 'Diretor', 175, '2003-03-27', 300000.00, NULL, 20);
INSERT INTO emp VALUES (175, 'Pedro', 'Presidente', NULL, '2003-02-23', 500000.00, NULL, 10);
INSERT INTO emp VALUES (189, 'Rosa', 'Diretor', 175, '2003-12-21', 330000.00, 5000.00, 30);
INSERT INTO emp VALUES (201, 'Eduardo', 'Vendedor', 189, '2003-04-11', 200000.00, 3000.00, 30);
INSERT INTO emp VALUES (208, 'Sergio', 'Vendedor', 189, '2003-10-30', 150000.00, 9000.00, 30);
INSERT INTO emp VALUES (230, 'Augusta', 'Secretaria', 175, '2003-06-10', 120000.00, NULL, 10);
INSERT INTO emp VALUES (276, 'Ronaldo', 'Analista', 110, '2003-04-17', 100000.00, NULL, 20);
------------------------------------------------------------------------------------------------------------
--Tabela faixa_sal
CREATE TABLE faixa_sal (
    faixa character(1) NOT NULL,
    salmin numeric(10,2) NOT NULL,
    salmax numeric(10,2) NOT NULL,
    PRIMARY KEY(faixa)
);
----------------------------------------------------------------------------------------------------------
INSERT INTO faixa_sal VALUES ('A', 1.00, 99999.00);
INSERT INTO faixa_sal VALUES ('B', 100000.00, 149999.00);
INSERT INTO faixa_sal VALUES ('C', 150000.00, 199999.00);
INSERT INTO faixa_sal VALUES ('D', 200000.00, 399999.00);
INSERT INTO faixa_sal VALUES ('E', 400000.00, 800000.00);
-----------------------------------------------------------------------------------------------------------
SELECT * FROM emp;
-----------------------------------------------------------------------------------------------------------
--ALTER ALTERA A COLUNA DA OU  A TABELA ADD ADICIONA REMOVE RETIRA.
ALTER TABLE emp ADD FOREIGN KEY (chefe) REFERENCES emp(n_emp);
----------------------------------------------------------------------------------------------------------
--APRESENTA O NOME DO FUNCIONARIO E O SEU DEPARTAMENTO
SELECT 		emp.nome_emp
		,dep.local_dep
		,emp.n_dep
		,dep.n_dep
FROM	emp
INNER JOIN dep
		ON(emp.n_dep = dep.n_dep)
----------------------------------------------------------------------------------------------------------
--APRESENTA TODOS OS DEPARTAMENTOS MESMO O QUE NAO TEM FUNCIONARIO
SELECT 		emp.nome_emp
		,dep.local_dep
		,emp.n_dep
		,dep.n_dep
FROM	emp
RIGHT JOIN dep
		ON(emp.n_dep = dep.n_dep)
----------------------------------------------------------------------------------------------------------
--ENCONTRA A FAIXA SALARIA E O NOME DO FUNCIONARIO
SELECT nome_emp
		,sal
		,faixa
FROM emp
	,faixa_sal
WHERE sal BETWEEN salmin AND salmax;
----------------------------------------------------------------------------------------------------------
--OUTRA FORMA 
SELECT nome_emp
		,sal
		,faixa
FROM emp
	,faixa_sal
WHERE sal >=salmax
	AND sal<=salmax;
----------------------------------------------------------------------------------------------------------
--ORDER BY ORDENA DA FORMA SOLICITADA
SELECT *
FROM emp
ORDER BY nome_emp;
----------------------------------------------------------------------------------------------------------
--ORDENA O SALARIO DO MAIOR PARA O MENOR
SELECT nome_dep, sal
FROM emp
ORDER BY sal DESC;
----------------------------------------------------------------------------------------------------------
--APRESENTA SO O MAIOR SALARIO
SELECT MAX(sal)
FROM emp;
----------------------------------------------------------------------------------------------------------
--APRESENTA A MEDIA DE UM NUMERO NO CASO O SALARIO
SELECT AVG (sal)
FROM emp;
----------------------------------------------------------------------------------------------------------
SELECT AVG(sal)
FROM emp
	,dep
WHERE local_dep = 'Campinas'
	AND emp.n_dep = dep.n_dep;
----------------------------------------------------------------------------------------------------------	
SELECT AVG(sal)
FROM emp	
INNER JOIN dep
	ON(local_dep = 'Campinas'
	AND emp.n_dep = dep.n_dep);
----------------------------------------------------------------------------------------------------------	
--SOMA DE VALORES

SELECT SUM(sal)
FROM emp;
 ---------------------------------------------------------------------------------------------------------
--FUNÇÕES DE AGREGAÇÕES
SELECT SUM(sal), AVG(sal)
FROM emp;
----------------------------------------------------------------------------------------------------------
--CONTA QUANTO ITENS TEM A COLUNA SELECIONADA NAO CONTANDO NULO, MAS ZERO E CONTADO E NEGATIVO
SELECT COUNT (n_dep)
FROM emp
----------------------------------------------------------------------------------------------------------
SELECT COUNT (*)
FROM emp
WHERE n_dep = 30
	OR n_dep = 10;
----------------------------------------------------------------------------------------------------------
SELECT n_dep
	, COUNT(*)
	, MAX(sal)
FROM emp
GROUP BY n_dep
ORDER BY n_dep ASC;
----------------------------------------------------------------------------------------------------------
SELECT  MAX(sal)
FROM emp
----------------------------------------------------------------------------------------------------------
--Apresenta o funcionario com maior salario
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp WHERE n_dep = 30);
----------------------------------------------------------------------------------------------------------
SELECT	nome_emp	
FROM	emp
WHERE n_dep IN (SELECT n_dep FROM dep WHERE local_dep = 'Campinas')
----------------------------------------------------------------------------------------------------------
SELECT	nome_emp	
FROM	emp
WHERE n_dep NOT IN (SELECT n_dep FROM dep WHERE local_dep = 'Sao Paulo')
----------------------------------------------------------------------------------------------------------
--SLIDE 4
--ordena os departamentos por ordem

SELECT *
FROM dep
ORDER by nome_dep; 
-----------------------------------------------------------------------------------------------------------
--lista os funcionario em releacao ao sua comissao do maior para o menor
----------------------------------------------------------------------------------------------------------
SELECT *
FROM emp
ORDER by com;
----------------------------------------------------------------------------------------------------------
--listar o empregado mais velho
SELECT nome_emp
FROM emp
WHERE data_adm = (SELECT MIN(data_adm) FROM emp);
----------------------------------------------------------------------------------------------------------
--apagar o funcionario mais novo
DELETE FROM emp
WHERE data_adm = (SELECT MAX(data_adm) FROM emp);
----------------------------------------------------------------------------------------------------------
--lista o funcionario com maior salario do departamento 30
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp WHERE n_dep = 30);
----------------------------------------------------------------------------------------------------------
SELECT	n_dep
		,MAX(sal)
FROM	emp
----------------------------------------------------------------------------------------------------------
SELECT MAX(sal)
FROM emp
----------------------------------------------------------------------------------------------------------
SELECT	nome_emp
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);
----------------------------------------------------------------------------------------------------------
SELECT nome_emp
FROM emp
WHERE	n_dep IN (SELECT n_dep
					FROM dep
					WHERE local_dep = 'Sao Paulo');
----------------------------------------------------------------------------------------------------------					
SELECT *
FROM (SELECT * FROM emp WHERE n_dep = 30) AS x
----------------------------------------------------------------------------------------------------------
SELECT * FROM dep
WHERE EXISTS (SELECT 'x' FROM emp
				WHERE emp.n_dep = dep.n_dep);
----------------------------------------------------------------------------------------------------------
SELECT 	nome_emp
		,sal
		,n_dep
FROM emp
ORDER BY n_dep, sal DESC
----------------------------------------------------------------------------------------------------------
SELECT 	n_dep
		,MAX(sal)
FROM emp
GROUP BY n_dep;
----------------------------------------------------------------------------------------------------------
SELECT 	nome_emp
		,n_dep
FROM emp
WHERE (n_dep, sal) IN (SELECT 	n_dep
								,MAX(sal)
						FROM emp
						GROUP BY n_dep)
----------------------------------------------------------------------------------------------------------
SELECT	n_dep
		,COUNT(*)
FROM emp
GROUP BY n_dep
HAVING COUNT(*) >= 3;
----------------------------------------------------------------------------------------------------------
SELECT 	n_dep
		,COUNT(*)
FROM (SELECT	n_dep
				,COUNT(*) AS count
	  FROM emp
	  GROUP BY n_dep) AS x
WHERE x.count >=3; 
----------------------------------------------------------------------------------------------------------
SELECT	*
FROM	emp 
WHERE (n_emp) IN (SELECT chefe FROM emp)
		