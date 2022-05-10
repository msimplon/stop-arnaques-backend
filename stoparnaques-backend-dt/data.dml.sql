/*
 * DML = Data Manipulation Language
 * Command lines from 'stop-arnaques-db' folder:
 * psql -h localhost -p 5432 -U postgres -d stop-arnaques
 * \i data.dml.sql
 * \q
 */

INSERT INTO articles (title, subtitle, description, dateOfPulication) VALUES
