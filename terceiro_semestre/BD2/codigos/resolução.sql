1)
ALTER TABLE emp ALTER COLUMN com SET NOT NULL;
Erro na execução. Coluna com já tem valores nulos.

2)
SELECT nome_emp
     , sal
     , sal/220
FROM emp;

3)
SELECT nome_emp
     , sal
     , sal + COALESCE(com, 0)
FROM emp;

4)
==> Solução 1
SELECT *
FROM dep
WHERE n_dep NOT IN (SELECT n_dep
                    FROM emp                
                   );
==> Solução 2
SELECT *
FROM dep
WHERE n_dep NOT IN (SELECT n_dep
                    FROM emp
                    GROUP BY n_dep
                   );
==> Solução 3
SELECT nome_dep
FROM dep
WHERE NOT EXISTS (SELECT 1
                  FROM emp
                  WHERE dep.n_dep = emp.n_dep
                 );

5)
SELECT nome_emp
     , cargo
     , com
FROM emp
WHERE cargo = 'Vendedor'
  AND com IS NULL;

6)
==>Exemplo de chave estrangeira para a mesma tabela.
ALTER TABLE emp 
ADD CONSTRAINT fk_chefe 
FOREIGN KEY (chefe)
REFERENCES emp(n_emp);

==>Solução 1
SELECT nome_emp
FROM emp
WHERE n_emp IN (SELECT chefe
                FROM emp
                GROUP BY chefe
               );

==>Solução 2
SELECT nome_emp
FROM emp AS e1
WHERE EXISTS (SELECT chefe
              FROM emp AS e2
              WHERE e1.n_emp = e2.chefe
             );
			 
7)
SELECT func.nome_emp
     , COALESCE(chefe.nome_emp, '----')
FROM      emp func
LEFT JOIN emp chefe
       ON (chefe.n_emp = func.chefe);
	   
8)
==>Solução 1
SELECT func.nome_emp
FROM      emp func
INNER JOIN emp chefe
        ON (chefe.n_emp = func.chefe)
INNER JOIN faixa_sal f
        ON (    chefe.sal BETWEEN f.salmin AND f.salmax
            AND func.sal BETWEEN f.salmin AND f.salmax
           );

==>Solução 2
SELECT func.nome_emp
FROM emp func
   , emp chefe
   , faixa_sal f
WHERE chefe.n_emp = func.chefe
  AND chefe.sal BETWEEN f.salmin AND f.salmax
  AND func.sal BETWEEN f.salmin AND f.salmax;
  
9)
SELECT nome_emp
FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp);

10)
==>Solução 1
SELECT SUM(sal)
FROM emp
WHERE n_dep IN (10, 30);

==>Solução 2
SELECT SUM(sal)
FROM emp
   , dep
WHERE emp.n_dep = dep.n_dep
  AND dep.nome_dep IN ('Admistracao', 'Vendas');
  
11)
SELECT n_dep
     , AVG(sal)
FROM emp
WHERE n_dep <> 30
GROUP BY n_dep;

12)
SELECT faixa
     , AVG(sal)
FROM emp
   , faixa_sal
WHERE emp.sal BETWEEN salmin AND salmax
GROUP BY faixa;

13)
==>Solução 1
UPDATE emp
SET sal = sal * 1.1
WHERE (n_dep, data_adm) IN (SELECT n_dep
                                 , MIN(data_adm)
                            FROM emp
                            GROUP BY n_dep
                           );
						   
==>Solução 2
UPDATE emp
SET sal = sal * 1.1
WHERE (data_adm) = (SELECT MIN(data_adm)
                    FROM emp e2
                    WHERE emp.n_dep = e2.n_dep
                   );

14)
==>Solução 1
UPDATE emp
SET cargo = 'Diretor'
WHERE sal > (SELECT AVG(sal)
             FROM emp e2
             WHERE emp.cargo = e2.cargo
            );

==>Solução 2
UPDATE emp
SET cargo = 'Diretor'
FROM (SELECT cargo
           , AVG(sal) AS avg
      FROM emp
      GROUP BY cargo
     ) x
WHERE emp.cargo = x.cargo
  AND emp.sal   > x.avg;