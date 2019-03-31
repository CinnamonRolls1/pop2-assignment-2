CREATE DATABASE POP;
USE POP;

CREATE TABLE array (ind INT NOT NULL auto_increment , number INT, PRIMARY KEY (ind));
INSERT INTO array (number) VALUE (5);
INSERT INTO array (number) VALUE (3);
INSERT INTO array (number) VALUE (7);
INSERT INTO array (number) VALUE (9);
INSERT INTO array (number) VALUE (1);
INSERT INTO array (number) VALUE (8);
INSERT INTO array (number) VALUE (6);
SELECT * FROM array WHERE number=6;

