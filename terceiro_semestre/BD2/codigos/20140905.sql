--Exercício 1 - Parte 1
CREATE VIEW emp_dep_salarios AS
SELECT n_dep
     , AVG(sal) AS media
     , SUM(sal) AS soma
     , MIN(sal) AS menor
     , MAX(sal) AS maior
FROM emp
GROUP BY n_dep;

--Exercício 1 - Parte 2
SELECT nome_emp
FROM emp
WHERE (n_dep, sal) IN (SELECT n_dep
                            , menor
                       FROM emp_dep_salarios
                      );
--Exercício 1 - Parte 2
SELECT nome_emp
FROM emp              AS e
   , emp_dep_salarios AS v
WHERE e.n_dep = v.n_dep
  AND e.sal   = v.menor;

--Exercício 2
==>Solução 1
CREATE VIEW visao AS
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp)
UNION
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);

==>Solução 2
CREATE VIEW visao AS
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp)
   OR sal = (SELECT MAX(sal) FROM emp);

==>Solução 3
CREATE VIEW visao AS
SELECT *
FROM (SELECT nome_emp
      FROM emp
      WHERE sal = (SELECT MIN(sal) FROM emp)
     ) AS x,
     (SELECT nome_emp
      FROM emp
      WHERE sal = (SELECT MAX(sal) FROM emp)
     ) AS y;              