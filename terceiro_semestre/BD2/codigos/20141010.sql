CREATE TABLE dep_auditoria (
  usuario name,
  operacao varchar(10),
  data_hora timestamp
);

CREATE FUNCTION t_dep_auditoria()
RETURNS trigger AS
$$
BEGIN
  INSERT INTO dep_auditoria
  VALUES (current_user, TG_OP, current_timestamp);

  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tg_dep_auditoria
AFTER INSERT OR UPDATE OR DELETE
ON dep
FOR EACH STATEMENT
EXECUTE PROCEDURE t_dep_auditoria();

INSERT INTO dep VALUES (12345, 'Teste', 'Paulínia');

UPDATE dep
SET nome_dep = 'abcde'
WHERE n_dep = 12345;

DELETE FROM dep
WHERE n_dep = 12345;

SELECT * FROM dep_auditoria;

--
CREATE TABLE dep_log 
AS SELECT * FROM dep WHERE 1 = 2;

ALTER TABLE dep_log ADD COLUMN usuario name;
ALTER TABLE dep_log ADD COLUMN data_hora timestamp;

CREATE FUNCTION t_dep_log()
RETURNS trigger
AS
$$
BEGIN
  INSERT INTO dep_log
  VALUES ( NEW.n_dep     , NEW.nome_dep
         , NEW.local_dep , current_user
         , current_timestamp);
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tg_dep_log
AFTER INSERT
ON dep
FOR EACH ROW
EXECUTE PROCEDURE t_dep_log();

INSERT INTO dep VALUES (54321, 'Blabla', 'X');

SELECT * FROM dep_log;

INSERT INTO dep VALUES (890, 'Novo', 'Y'),
                       (567, 'Novo2', 'Z');

SELECT * FROM dep_log;
SELECT * FROM dep_auditoria;

DROP TRIGGER tg_dep_auditoria ON dep;