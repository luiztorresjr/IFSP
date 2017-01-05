DROP table IF Exists dep_auditoria CASCADE;
CREATE TABLE dep_auditoria(
	usuario name,
	operacao varchar(10),
	data_hora timestamp
);

DROP FUNCTION IF EXISTS t_dep_auditoria() CASCADE;
CREATE FUNCTION t_dep_auditoria() RETURNS trigger AS $$
BEGIN
	INSERT INTO dep_auditoria
	VALUES(CURRENT_USER, TG_OP, current_timestamp);
	
	RETURN NEW;
END;	
$$ LANGUAGE plpgsql;


CREATE TRIGGER tg_dep_auditoria
AFTER INSERT OR UPDATE OR DELETE
ON dep
FOR EACH STATEMENT 
EXECUTE PROCEDURE t_dep_auditoria();


INSERT INTO dep VALUES(12345, 'Teste', 'Paulinia');

UPDATE dep
SET nome_dep='abcde'
WHERE n_dep=12345;

DELETE FROM dep
WHERE n_dep=12345;


select * FROM dep_auditoria;


CREATE TABLE dep_log AS SELECT * FROM dep WHERE 1 = 2;

ALTER TABLE dep_log ADD COLUMN usuario name;
ALTER TABLE dep_log ADD COLUMN data_hora timestamp;

select * from dep_log;

DROP FUNCTION IF EXISTS t_dep_log() CASCADE;
CREATE FUNCTION t_dep_log() RETURNS TRIGGER AS $$
BEGIN
	INSERT INTO dep_log
	VALUES (NEW.n_dep, NEW.nome_dep, NEW.local_dep, current_user, current_timestamp);

	return NEW;
end;
$$ language plpgsql;

DROP TRIGGER tg_dep_log ON dep;
CREATE TRIGGER tg_dep_log
AFTER INSERT 
ON dep
FOR EACH ROW
EXECUTE PROCEDURE t_dep_log();

Begin;

INSERT INTO dep VALUES (54321, 'Blabla', 'X');
INSERT INTO dep VALUES (890, 'Novo', 'Y'),
			(567, 'Novo2', 'Z');
rollback;

select * from dep_log; 


