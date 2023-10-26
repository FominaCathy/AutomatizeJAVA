CREATE TABLE IF NOT EXISTS cats
(
id INTEGER PRIMARY KEY  NOT NULL,
name VARCHAR(20) NOT NULL,
year_b integer NOT NULL,
breed_id INTEGER,
FOREIGN KEY (breed_id) REFERENCES breeds(id)
);

INSERT INTO cats (id, name, year_b, breed_id) VALUES (1, "Chuk", 2010, 3);
INSERT INTO cats (id, name, year_b, breed_id) VALUES (2, "Gek", 2010, 3);
INSERT INTO cats (id, name, year_b, breed_id) VALUES (3, "Murka", 2015, 2);
INSERT INTO cats (id, name, year_b, breed_id) VALUES (4, "Barsik", 2000, 1);
