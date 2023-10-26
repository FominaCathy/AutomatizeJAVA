CREATE TABLE IF NOT EXISTS breeds
(
id integer PRIMARY_KEY,
breed text NOT NULL,
color text NOT NULL,
max_weight integer NOT NULL
);

INSERT INTO breeds (id, breed, color, max_weight) VALUES (1, "Pers", "cream", 7);
INSERT INTO breeds (id, breed, color, max_weight) VALUES (2, "Siam", "colorpoint", 5);
INSERT INTO breeds (id, breed, color, max_weight) VALUES (3, "Maine Coon", "black", 15);
INSERT INTO breeds (id, breed, color, max_weight) VALUES (34, "Maine Coon", "white", 15);
