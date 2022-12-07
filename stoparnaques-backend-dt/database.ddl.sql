/*
 * DDL = Data Definition Language
 * Command lines from 'stop-arnaques-db' folder:
 * psql -h localhost -p 5432 -U postgres
 * \i database.ddl.sql
 * \q
 */


--Création de la base de donnée

CREATE DATABASE stoparnaques WITH OWNER 'postgres' ENCODING 'UTF8';
