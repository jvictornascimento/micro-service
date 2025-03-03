INSERT INTO tb_users (name,email, password) VALUES ('Nina Brown','nina@gmail.com','$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG60UwTAcZqP9Flqu');
INSERT INTO tb_users (name,email, password) VALUES ('Leila Red','leila@gmail.com','$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG60UwTAcZqP9Flqu');

INSERT INTO tb_roles (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_roles (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,2);
