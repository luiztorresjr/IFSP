CREATE OR REPLACE FUNCTION f1(v_n_dep integer)
  RETURNS numeric AS
$BODY$
DECLARE
  v_max_sal emp.sal%TYPE;
BEGIN
  SELECT MAX(sal)
  INTO v_max_sal
  FROM emp
  WHERE n_dep = v_n_dep;

  RETURN v_max_sal;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE;

CREATE OR REPLACE FUNCTION f2(v_cargo varchar)
  RETURNS numeric AS
$BODY$
DECLARE
  v_min_sal emp.sal%TYPE;
BEGIN
  SELECT MIN(sal)
  INTO v_min_sal
  FROM emp
  WHERE cargo = v_cargo;

  RETURN v_min_sal;
END;
$BODY$
  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION f3(v_n_emp int)
RETURNS varchar AS
$$
DECLARE
  v_nome_chefe emp.nome_emp%TYPE;
BEGIN
  SELECT nome_emp
  INTO v_nome_chefe
  FROM emp
  WHERE n_emp = (SELECT chefe
                 FROM emp
                 WHERE n_emp = v_n_emp
                );
  RETURN v_nome_chefe;
END;
$$
  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION f3_alternativa(v_n_emp int)
RETURNS varchar AS
$$
DECLARE
  v_nome_chefe emp.nome_emp%TYPE;
  v_n_emp_chefe emp.n_emp%TYPE;
BEGIN
  SELECT chefe
  INTO v_n_emp_chefe
  FROM emp
  WHERE n_emp = v_n_emp;

  SELECT nome_emp
  INTO v_nome_chefe
  FROM emp
  WHERE n_emp = v_n_emp_chefe;

  RETURN v_nome_chefe;
END;
$$
  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION f4(v_n_dep int)
RETURNS int AS
$$
DECLARE
  v_count_func int;
BEGIN
  SELECT COUNT(*) 
  INTO v_count_func
  FROM emp
  WHERE n_dep = v_n_dep;

  RETURN v_count_func;
END;
$$
  LANGUAGE plpgsql;