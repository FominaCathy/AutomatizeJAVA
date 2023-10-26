CREATE TABLE products
(
product_id INTEGER PRIMARY KEY NOT NULL,
menu_name VARCHAR(30) NOT NULL,
price FLOAT NOT NULL
);

INSERT INTO products (product_id, menu_name, price) VALUES
(1, "banana", 0.5),
(2, "kivi", 2.0),
(3, "milk", 1.0),
(4, "apple", 0.3)
;

