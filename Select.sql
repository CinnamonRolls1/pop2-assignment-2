CREATE DATABASE school;
USE school;

CREATE TABLE students (rollno INT, name VARCHAR(20), sex VARCHAR(6), class CHAR(3), marks INTEGER);
INSERT INTO students VALUES (1,'Diane','female','12B',95);
INSERT INTO students VALUES (2,'Joseph','male','12A',93);
INSERT INTO students VALUES (3,'David','male','12B',97);
INSERT INTO students VALUES (4,'Cris','female','12C',91);


SELECT * FROM students WHERE name='Cris';

