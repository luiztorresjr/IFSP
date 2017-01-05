--número dos departamentos
--com mais de três empregados
--com having
SELECT n_dep
     , COUNT(*)
FROM emp
GROUP BY n_dep
HAVING COUNT(*) >= 3;

--número dos departamentos
--com mais de três empregados
--com subconsulta
SELECT *
FROM
	(SELECT n_dep
	      , COUNT(*) AS count
	 FROM emp
	 GROUP BY n_dep) AS x
WHERE x.count >= 3;