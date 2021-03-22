USE adlister_db;
DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS ads_categories;
CREATE TABLE users (
                       id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(240) NOT NULL UNIQUE,
                       email VARCHAR(240) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       PRIMARY KEY (id)
);
CREATE TABLE ads (
                     id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
                     user_id INT UNSIGNED NOT NULL,
                     title VARCHAR(240) NOT NULL,
                     description TEXT NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users(id)
                         ON DELETE CASCADE
);
CREATE TABLE categories (
                            id BIGINT unsigned NOT NULL AUTO_INCREMENT,
                            name VARCHAR(255) NOT NULL,
                            PRIMARY KEY (id)
);
CREATE TABLE ads_categories (
                                ad_id BIGINT unsigned NOT NULL,
                                category_id BIGINT unsigned NOT NULL,
                                FOREIGN KEY (ad_id) REFERENCES ads(id),
                                FOREIGN KEY (category_id) REFERENCES categories(id)
);
INSERT INTO categories(name) VALUES
('Free'),
('Cars'),
('Furniture'),
('Animals'),
('Electronics'),
('Help Wanted'),
('Bikes'),
('For Rent'),
('For Sale'),
('Tools');