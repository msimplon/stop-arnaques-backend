/*
 * DDL = Data Definition Language
 * psql -h localhost -p 5432 -U postgres -d stoparnaques
 * \i schema.ddl.sql
 * \q
 */


DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS lawyers;
DROP TABLE IF EXISTS conferences;
DROP TABLE IF EXISTS articles;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS progress_status;
DROP TABLE IF EXISTS requests;
DROP TABLE IF EXISTS litigations;
DROP TABLE IF EXISTS profiles;

 --script de création de tables



CREATE TABLE categories (  
	id SERIAL PRIMARY KEY,
	name varchar(200) UNIQUE NOT NULL
);

CREATE TABLE articles (  
	id SERIAL PRIMARY KEY,  
	title varchar(200)  UNIQUE NOT NULL,
	subtitle varchar (200)  NOT NULL,
	description text NOT NULL,
	image_url VARCHAR(255) NOT NULL,
	date_of_publication date NOT NULL,
	category_id integer NOT NULL,
	CONSTRAINT fk_category_id
    	FOREIGN KEY (category_id)
    	REFERENCES categories(id)
);

CREATE TABLE requests (  
	id SERIAL PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	description VARCHAR(255) NOT NULL,
    litige_id integer NOT NULL,
    CONSTRAINT fk_litige_id 
	    FOREIGN KEY (litige_id)
	    REFERENCES litigation(id);
	);


CREATE TABLE conferences (
    id SERIAL PRIMARY KEY,
    cover BOOLEAN NOT NULL
   
);


CREATE TABLE users (
	id SERIAL PRIMARY KEY,   
	username varchar(255) UNIQUE NOT NULL,
	password varchar(60) NOT NULL
);


CREATE TABLE profiles (
	id SERIAL PRIMARY KEY,
    uuid UUID UNIQUE NOT NULL,
	email VARCHAR(255) UNIQUE NOT NULL
--    first_name VARCHAR(30),
--    last_name VARCHAR(50)
);


CREATE TABLE lawyers (  
	id SERIAL PRIMARY KEY,
	lawyer_name VARCHAR(50) UNIQUE NOT NULL,
	available BOOLEAN NOT NULL,
    	profile_id INTEGER
    	CONSTRAINT fk_lawyers_profile 
    		FOREIGN KEY (profile_id)
    		REFERENCES profiles(id)
);


CREATE TABLE litigations (  
	id SERIAL PRIMARY KEY,
	label VARCHAR(20) NOT NULL
);


CREATE TABLE progress_status (  
	id SERIAL PRIMARY KEY,
	status VARCHAR(12) NOT NULL
);






--Ajout des contraintes de clefs étrangères


