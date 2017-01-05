--RANK em relação ao salario
SELECT	nome_emp
		,sal
		,n_dep
		,rank()	OVER (ORDER BY sal DESC)
FROM	emp;
--RANK em relação ao salario por departamento
SELECT	nome_emp
		,sal
		,n_dep
		,rank()	OVER (PARTITION BY n_dep ORDER BY sal DESC)
FROM	emp;
-- sub-consulta no FROM
SELECT	*
FROM 	(SELECT	nome_emp
		,sal
		,n_dep
		,rank()	OVER (PARTITION BY n_dep ORDER BY sal DESC) AS RANK
		FROM	emp;
		) x
WHERE x.RANK = 2;
--SLIDE 6 RESPOSTAS
--1. Crie uma visão com a soma, média salarial e os menores e maiores salários de cada departamento.
--– Utilizando a visão liste os funcionários que ganham o menor salário de cada departamento.

DROP VIEW emp_sal

CREATE VIEW emp_sal AS
SELECT 	nome_emp
		,sal
		,n_dep
		,SUM(sal)	OVER(PARTITION BY n_dep)
		,AVG(sal)	OVER(PARTITION BY n_dep)
		,MIN(sal)	OVER(PARTITION BY n_dep)
		,MAX(sal)	OVER(PARTITION BY n_dep)
FROM emp;

SELECT	*
FROM	emp_sal
WHERE	(sal , n_dep) IN (SELECT MIN(sal)OVER(PARTITION BY n_dep) , n_dep  FROM emp_sal);

--2. Crie uma visão contendo os funcionários que ganham o maior e menor salário.
CREATE VIEW emp_sal_min_max AS
SELECT	nome_emp
		,sal
FROM emp
WHERE sal IN (SELECT MAX(sal) FROM emp)
UNION
SELECT	nome_emp
		,sal
FROM emp
WHERE sal IN (SELECT MIN(sal) FROM emp);

SELECT *
FROM emp_sal_min_max;

--3. Crie uma visão com o nome e departamento dos funcionários, adicione uma coluna que indique qual é a posição do salário desse
--funcionário em relação ao cargo que ocupa. Exemplo: Rosa tem o maior salário dos Diretores, portanto sua ordem é 1, já o Ubaldo
--tem o segundo maior salário, portanto sua ordem é 2.

CREATE VIEW emp_dep_rank AS
SELECT	nome_emp
	,sal
	,cargo
	,n_dep
	,rank()	OVER(PARTITION BY cargo ORDER BY sal DESC)
FROM	emp
ORDER BY cargo;