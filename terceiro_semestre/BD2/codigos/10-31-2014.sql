SELECT * FROM pg_indexes where tablename = 'dep';

SELECT * FROM dep;

INSERT INTO dep VALUES(-2, 'RH', 'SP');

CLUSTER dep_pkey ON dep;