
BEGIN;
--teste da tabela farmacia corretos
INSERT INTO farmacia (cod_farmacia, nome_farmacia, cep, telefone) 
VALUES (1,'teste1',1,1), (2,'teste2',2,2), (3,'teste3',3,3), (4,'teste4',4,4);

--teste da tabela 
INSERT INTO laboratorio (nome_laboratorio, cod_laboratorio)
VALUES ('teste1',1), ('teste2',2), ('teste3',3);

--teste da tabela medicamento
INSERT INTO medicamento (cod_medicamento, nome_comercial, viaDeAdm) 
VALUES (1,'teste1','teste1'), (2,'teste2','teste2'), (3,'teste2','teste3'), (4,'teste2','teste4');

--teste da tabela farmacia
INSERT INTO funcionario (nome_funcionario, cargo, cod_funcionario, cpf, cod_farmacia)
VALUES ('teste1','teste1',1,1,1), ('teste2','teste2',2,2,2), ('teste2','teste2',3,3,3);

--teste da tabela estoque
INSERT INTO estoque (cod_farmacia, cod_medicamento, quantidade_estoque)
VALUES(1,1,5), (2,2,10), (3,3,100),(1,2,20), (4,2,30), (2,3,25);

COMMIT;

BEGIN;
--teste da tabela venda corretos
INSERT INTO venda (id_venda, cod_funcionario, cod_farmacia,  cod_medicamento, quantidade_venda, data_venda, hora_venda)
VALUES --(1,1,1,1,1,'2014-10-10','23:00:00'), 
(2,1,1,1,4,'2014-10-10','23:00:00');

ROLLBACK;


SELECT * FROM farmacia;
SELECT * FROM medicamento;
SELECT * FROM funcionario;
SELECT * FROM laboratorio;
SELECT * FROM telefone;
SELECT * FROM farmaceutico;
SELECT * FROM venda;
SELECT * FROM estoque;
