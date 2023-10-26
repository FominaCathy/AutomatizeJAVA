CREATE TABLE orders
(
order_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
customer_id INT NOT NULL,
date_get  TIMESTAMP NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
);

INSERT INTO orders (customer_id, date_get) VALUES
(1, date('now')),
(2, date('now')),
(3, date('now'));