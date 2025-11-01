INSERT INTO tb_profiles(id, name)
VALUES(gen_random_uuid(), 'Operator');

SELECT id, name FROM tb_profiles;