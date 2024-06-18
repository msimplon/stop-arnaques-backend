/*
 * DML = Data Manipulation Language
 * pour se connecter a cette database saisir cette commande : psql -h localhost -p 5432 -U postgres -d stoparnaques
 *  se connecter à la base : c\ stoparnaques
 * \i data.dml.sql
 * \q
 */

DELETE FROM categories;
DELETE FROM users;
DELETE FROM roles;


INSERT INTO categories (name)
VALUES ('Actualites'), ('Conseils');

INSERT INTO roles
	(code_role, role_name)
	VALUES
    ('ROLE_ADMIN', 'ADMIN'),  ('ROLE_USER', 'USER');
   
   INSERT INTO users
	(first_name, last_name, email, password, role_id, is_enabled)
	VALUES
    ( 'Manal', 'Benallal', 'admin@admin.com', '$2y$10$v.8CVIY09L2BFyg1XXKwYOkXjZ6gn.6DsotJdZwjooesl0nVOaKGi', (SELECT r.id FROM roles r WHERE r.code_role = 'ROLE_ADMIN'), true);



