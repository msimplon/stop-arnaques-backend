/*
 * DML = Data Manipulation Language
 * pour se connecter a cette database saisir cette commande : psql -h localhost -p 5432 -U postgres -d stoparnaques
 *  se connecter à la base : c\ stoparnaques
 * \i data.dml.sql
 * \q
 */


DELETE FROM categories;
DELETE FROM profiles;
DELETE FROM lawyers;
DELETE FROM litigations;
DELETE FROM requests; 
DELETE FROM articles; 
DELETE FROM conferences; 
DELETE FROM progress_status;
DELETE FROM users;



INSERT INTO categories (name)
VALUES ('Actualites'), ('Conseils');


INSERT INTO profiles (uuid, email)
	VALUES 
	('9ebc1fd9-f72f-46c8-9255-1e29b8f20ab9', 'toto@mail.com'),
	('6c44d264-1a04-49a3-b541-7579ece3e8a1', 'titi@mail.com'),
	('fe48b8f7-fb89-4934-bac5-e616af56df53', 'totota@mail.com'),
	('f41d4ee5-c1ec-4f0d-93ed-c7b58f2d3074', 'simplon@mail.com'),
	('25e0dc24-95e3-466f-a93d-2cee1c4a0169', 'manalben@mail.com');
	
	
INSERT INTO lawyers (lawyer_name, available, profile_id)
	VALUES 
	('Toto', false, (SELECT id FROM profiles WHERE email = 'toto@mail.com')),
	('Titi', true, (SELECT id FROM profiles WHERE email = 'titi@mail.com')),
	('totota', true, (SELECT id FROM profiles WHERE email = 'totota@mail.com')),
	('simplon', true, (SELECT id FROM profiles WHERE email = 'simplon@mail.com'));


INSERT INTO litigations (label)
	VALUES 
	('origine frauduleuse'),
	('publicité mensongère'),
	('fraude bancaire'),
	('non-reception du colis'),
	('Autre');
	
	
INSERT INTO requests (description,created_at,litige_id)
	VALUES
	('lorem ipsum blabla', '2022-05-19', (select l.id FROM litigations l where l.label = 'Autre')), 
	
	('lorem ipsum blabla', '2022-05-21', (select l.id FROM litigations l where l.label = 'origine frauduleuse'));


INSERT INTO articles (title, subtitle, editor, description, introduction, image_url, date_of_publication,created_at, category_id) 
	VALUES
('Ecommerce','Tuto descriptage fiabilité du site marchand','manal','Lorem ipsum','Lorem ipsuddm','assets/IMG/ampoule/conseils1.png','2022-05-19', now(),(select c.id FROM categories c where c.name = 'Actualités')),
('Les réseaux sociaux','contrefacon','thomas','Lorem ipsum blabla', 'Lorem ipsuddm','assets/IMG/ampoule/conseils1.png','2022-03-29', now(),(select c.id FROM categories c where c.name = 'Actualités')),
('Influenceur et justice', 'Des influenceurs dans le collimateur de la justice!','eva','Lorem ipsum balbla.', 'Lorem ipsuddm','assets/IMG/ampoule/conseils1.png','2022-03-13', now(),(select c.id FROM categories c where c.name = 'Actualités')),
('Nos conseils à  suivre', 'Nos 10 conseils','Massy','Lorem ipsum','Lorem ipsuddm','assets/IMG/ampoule/conseils1.png','2022-01-13', now(),(select c.id FROM categories c where c.name = 'Conseils')),
('Notre lettre de reclamation', 'Lettre marchandise non conforme','laurine','Lorem ipsum balbla','Lorem ipsuddm','assets/IMG/ampoule/conseils1.png','2022-03-13', now(),(select c.id FROM categories c where c.name = 'Conseils')),
('Sept ans de prison pour un ex-influenceur','Detournement de fonds publics', 'lisa','Lorem ipsum balbla', 'assets/IMG/ampoule/conseils1.png','2022-03-13', now(),(select c.id FROM categories c where c.name = 'Actualités')),
('Obtenez répératation','Lettre non livraison','maroua','Lorem ipsum','assets/IMG/ampoule/conseils1.png','2022-10-13',now(),(select c.id FROM categories c where c.name = 'Conseils'));




INSERT INTO progress_status (status)
	VALUES 
	('En_attente'),
	('En_cours'),
	('traitée');
	
	
INSERT INTO email_templates
	(template_identifier, template_subject, template_body)
	VALUES
	('CUSTOMER', 'Welcome onboard ${customer_name}', 'Dear ${contact_firstname} \n\nYour API key is: ${api_key} \n\nEnjoy using our services!\nMailSenderAPI team\n\nThis is an automatic mail, please to not reply.'),
	('FREE_MAIL', '[MailSenderAPI] - ${client_subject}', '${client_body} \n\n*****************************\n\nThis is a free limited and anonymous mail\nMailSenderAPI team\n\nThis is an automatic mail, please to not reply.');

	
INSERT INTO users (first_name, last_name,username, password)
	VALUES
    ('manal','benallal','user@mail.com', '$2a$12$vrT8/vYBdK5ze/vo6s7LXer5q0mBWQk3tJVsR0iLgEe4OIsdhuc1u' );
	
	/* créer l'utilisateur admin = 1 seul role admin mais ajout de plusieurs roles dans un future proche*
	 * mot de passe est différent du token, le token est un jeton unique pr un utilisateur qui lui permet...  */
    
INSERT INTO roles (name) 
	values ('ROLE_ADMIN');

	/* créer utilisateur admin test */
	 
INSERT INTO users (first_name, last_name, username, password, role_id) VALUES ('manal','benallal','admin30@domain.com', '$2a$11$/vyCZOWfj./Guf8aOHpeM.hav5htEfXhbckQMWdjwsTuZfP2o6sn2', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));