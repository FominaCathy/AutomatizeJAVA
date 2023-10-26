CREATE TABLE customers
(
customer_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
phone_number VARCHAR(11) NOT NULL,
district VARCHAR(40) NOT NULL,
street VARCHAR(40) NOT NULL,
house VARCHAR(6) NOT NULL,
apartment VARCHAR(4) NOT NULL

);

INSERT INTO customers (first_name, last_name, phone_number, district, street, house, apartment) VALUES
("Bear", "White", +7123400089, "North", "Ice", "15", "135"),
("Penguin", "Black", +7123400088, "North", "Ice", "02", "15A"),
("Giraffe", "Orange", +7123400087, "South", "Desert", "02", "1D"),
("Tiger", "Orange", +7123400087, "South", "Savanna", "33", "13");