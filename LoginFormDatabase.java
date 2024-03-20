CREATE DATABASE userlogindb;

USE userlogindb;

CREATE TABLE userlogintable (
    USERNAME VARCHAR(255) PRIMARY KEY,
    PASSWORD VARCHAR(255)
);


INSERT INTO userlogintable (USERNAME, PASSWORD)
VALUES ('admin', '1234');