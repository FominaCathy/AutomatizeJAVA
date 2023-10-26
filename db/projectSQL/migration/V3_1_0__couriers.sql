CREATE TABLE courier_info
(
courier_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
phone_number VARCHAR(11) NOT NULL,
delivery_type VARCHAR(10) NOT NULL
);

INSERT INTO courier_info (first_name, last_name, phone_number, delivery_type)
VALUES
("Corier", "Stork",  "+7911000112", "avia"),
("Corier","Tom",  "+7911000113", "car"),
("Corier", "Snail", "+7911000113", "food")
;
