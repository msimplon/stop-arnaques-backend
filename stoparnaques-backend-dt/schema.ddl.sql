/*
 * DDL = Data Definition Language
 * psql -h localhost -p 5432 -U postgres -d stoparnaques
 * \i schema.ddl.sql
 * \q
 */


--DROP TABLE IF EXISTS lawyers;

DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS articles;
DROP TABLE IF EXISTS litigations;
DROP TABLE IF EXISTS requests;
DROP TABLE IF EXISTS conferences;
--DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS progress_status;

--DROP TABLE IF EXISTS profiles;

 --script de création de tables


-- créer table users voir moha 


CREATE TABLE categories (  
	id SERIAL PRIMARY KEY,
	name varchar(200) UNIQUE NOT NULL
);

CREATE TABLE articles (  
	id SERIAL PRIMARY KEY,  --c'est la PK, id technique 
	title varchar(200)  UNIQUE NOT NULL, --NN et unique mais ca coute en performances, répétion des RG dans les couches de l'app
	subtitle varchar(200)  NOT NULL,
	editor varchar(60) NOT NULL,
	description text NOT NULL,
	introduction text NOT NULL,
	image_url VARCHAR(255) NOT NULL,
	created_at TIMESTAMP NOT NULL,
	date_of_publication date,
	category_id integer NOT NULL,
	CONSTRAINT fk_category_id
    	FOREIGN KEY (category_id)
    	REFERENCES categories(id)
);


CREATE TABLE litigations (    
	id SERIAL PRIMARY KEY,
	label VARCHAR(150) NOT NULL
);


CREATE TABLE requests (  
	id SERIAL PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	description VARCHAR(255) NOT NULL,
    litige_id integer NOT NULL,
    CONSTRAINT fk_litigation_id 
	    FOREIGN KEY (litige_id)
	    REFERENCES litigations(id)
	);


CREATE TABLE conferences (
    id SERIAL PRIMARY KEY,
    file_name VARCHAR(255) UNIQUE NOT NULL,
    cover BOOLEAN NOT NULL
   
);

CREATE TABLE roles (
	id SERIAL PRIMARY KEY,	
	name varchar(20) UNIQUE NOT NULL
);

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(300) NOT NULL,
	last_name VARCHAR(300) NOT NULL,
	username varchar(255) UNIQUE NOT NULL,
	password varchar(60) NOT NULL,
	role_id INTEGER, 
CONSTRAINT fk_role_id
  	FOREIGN KEY (role_id)
	REFERENCES roles(id)
);



--CREATE TABLE profiles (
--	id SERIAL PRIMARY KEY,
--    uuid UUID UNIQUE NOT NULL,
--	email VARCHAR(255) UNIQUE NOT NULL
--    first_name VARCHAR(30),
--    last_name VARCHAR(50)
--);
--
--
--CREATE TABLE lawyers (  
--	id SERIAL PRIMARY KEY,
--	lawyer_name VARCHAR(50) UNIQUE NOT NULL,
--	available BOOLEAN NOT NULL,
--    	profile_id INTEGER
--    	CONSTRAINT fk_lawyers_profile 
--    		FOREIGN KEY (profile_id)
--    		REFERENCES profiles(id)
--);


CREATE TABLE progress_status (  
	id SERIAL PRIMARY KEY,
	status VARCHAR(12) NOT NULL
);






--Ajout des contraintes de clefs étrangères


