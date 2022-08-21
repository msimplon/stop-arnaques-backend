/*
 * DDL = Data Definition Language
 * psql -h localhost -p 5432 -U postgres -d stoparnaques
 * \i schema.ddl.sql
 * \q
 */


DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS articles;
DROP TABLE IF EXISTS categories;


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

CREATE TABLE users (
	id SERIAL PRIMARY KEY,   
	username varchar(255) UNIQUE NOT NULL,
	password varchar(60) NOT NULL
);


