/*
 * DDL = Data Definition Language
 * Command lines from 'teams-db' folder:
 * psql -h localhost -p 5432 -U postgres -d stoparnaques
 * \i schema.ddl.sql
 * \q
 */

/*EN ATTENTE DE CONFIRMATION DE FRANK */
/*CREATE TABLE category (  
	id SERIAL PRIMARY KEY,  
	zip_code varchar(10) UNIQUE NOT NULL,  
	nom varchar(200) NOT NULL
);

CREATE TABLE items (  
	id SERIAL PRIMARY KEY,  
	title varchar(200) NOT NULL,
	subtitle varchar (200) NOT NULL,
	description varchar(250) NOTE NULL,
	date_of_publication varchar NOT NULL,
	CONSTRAINT fk_categories_items_id
    	FOREIGN KEY (categorie_id)
    	REFERENCES categorie(id)
);

CREATE TABLE users (  
	id SERIAL PRIMARY KEY,   
	username varchar(255) UNIQUE NOT NULL,
	password varchar(60) NOT NULL
);
*/


