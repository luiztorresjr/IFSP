CREATE FUNCTION lista_dep() 
RETURNS SETOF dep
AS $$
DECLARE
  v_dep dep%ROWTYPE;
BEGIN

  FOR v_dep IN SELECT * FROM dep
  LOOP
    RETURN NEXT v_dep;
  END LOOP;

  RETURN;
END;
$$ LANGUAGE plpgsql;

CREATE TYPE telefone AS (tel varchar(20));

ALTER TABLE emp ADD COLUMN tel telefone;

ALTER TYPE telefone ALTER ATTRIBUTE tel TYPE varchar(30);
ALTER TABLE emp ADD COLUMN tel2 varchar(30);
UPDATE emp
SET tel2 = tel;
ALTER TABLE emp DROP COLUMN tel;

ALTER TYPE telefone ALTER ATTRIBUTE tel TYPE varchar(30);
ALTER TABLE emp ADD COLUMN tel telefone;
UPDATE emp
SET tel = CAST(tel2 AS telefone);
ALTER TABLE emp DROP COLUMN tel2;

ALTER TABLE dep ADD COLUMN tel telefone;


SELECT nome_emp
     , nome_dep 
FROM dep
   , emp
WHERE dep.n_dep = emp.n_dep
  AND dep.n_dep = 10
