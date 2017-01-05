--Apaga as tabelas
DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS dep;
DROP TABLE IF EXISTS faixa_sal;

--Tabela dep
CREATE TABLE dep (
    n_dep integer,
    nome_dep varchar(20),
    local_dep varchar(30),
    PRIMARY KEY (n_dep)
);

INSERT INTO dep VALUES (10, 'Administracao', 'Campinas');
INSERT INTO dep VALUES (20, 'Pesquisa', 'Campinas');
INSERT INTO dep VALUES (30, 'Vendas', 'Sao Paulo');
INSERT INTO dep VALUES (40, 'Producao', 'Sao Paulo');

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

INSERT INTO emp VALUES (103, 'Silvia', 'Analista', 110, '2003-03-17', 150000.00, NULL, 20);
INSERT INTO emp VALUES (110, 'Ubaldo', 'Diretor', 175, '2003-03-27', 300000.00, NULL, 20);
INSERT INTO emp VALUES (175, 'Pedro', 'Presidente', NULL, '2003-02-23', 500000.00, NULL, 10);
INSERT INTO emp VALUES (189, 'Rosa', 'Diretor', 175, '2003-12-21', 330000.00, 5000.00, 30);
INSERT INTO emp VALUES (201, 'Eduardo', 'Vendedor', 189, '2003-04-11', 200000.00, 3000.00, 30);
INSERT INTO emp VALUES (208, 'Sergio', 'Vendedor', 189, '2003-10-30', 150000.00, 9000.00, 30);
INSERT INTO emp VALUES (230, 'Augusta', 'Secretaria', 175, '2003-06-10', 120000.00, NULL, 10);
INSERT INTO emp VALUES (276, 'Ronaldo', 'Analista', 110, '2003-04-17', 100000.00, NULL, 20);

--Tabela faixa_sal
CREATE TABLE faixa_sal (
    faixa character(1) NOT NULL,
    salmin numeric(10,2) NOT NULL,
    salmax numeric(10,2) NOT NULL,
    PRIMARY KEY(faixa)
);

INSERT INTO faixa_sal VALUES ('A', 1.00, 99999.00);
INSERT INTO faixa_sal VALUES ('B', 100000.00, 149999.00);
INSERT INTO faixa_sal VALUES ('C', 150000.00, 199999.00);
INSERT INTO faixa_sal VALUES ('D', 200000.00, 399999.00);
INSERT INTO faixa_sal VALUES ('E', 400000.00, 800000.00);


CREATE TABLE tabelas_verifi
AS SELECT * FROM dep WHERE 1 = 2;

CREATE FUNCTION t_comissao()
RETURNS trigger
AS
$$
BEGIN
  INSERT INTO tabelas_verifi
  VALUES ( NEW.n_emp     , NEW.nome_emp
         , NEW.cargo , , NEW.chefe, NEW.data_adm, NEW.sal, NEW.com,NEW.n_dep, current_user
         , current_timestamp);
  if(com > sal*0.1)
  RETURN NEW;
  END
  RETURN "Não pode cadastrar cabaço"
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tg_comissao BEFORE INSERT OR UPDATE
ON emp

