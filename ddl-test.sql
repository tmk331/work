create database IF NOT EXISTS training;

CREATE TABLE IF NOT EXISTS training.account (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT
);

INSERT INTO training.account (id, name, age) VALUES
(1, 'John Doe', 25),
(2, 'Jane Smith', 30),
(3, 'Bob Johnson', 22);