-- users

-- !Ups

CREATE TABLE users
(
    id   BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    info VARCHAR(255) NULL DEFAULT NULL
);

-- !Downs

DROP TABLE users;