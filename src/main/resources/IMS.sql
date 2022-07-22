use ims_database;

create table IF NOT EXISTS orders(
id int primary key auto_increment,
fk_customer_id int NOT NULL,
order_value decimal (10, 2),
FOREIGN KEY (fk_customer_id) REFERENCES customer(id)
);

create table IF NOT EXISTS orders_items(
id int primary key auto_increment,
fk_items_id int NOT NULL,
fk_orders_id int NOT NULL,
FOREIGN KEY (fk_items_id) REFERENCES items(id),
FOREIGN KEY (fk_orders_id) REFERENCES orders(id)
);
create table IF NOT EXISTS customer (
id int primary key auto_increment,
first_name varchar (30),
surname varchar (30)
);

create table IF NOT EXISTS items(
id int primary key auto_increment,
item_name varchar (30),
item_value decimal (1000, 2)
);

ALTER TABLE orders_items
ADD order_item_value decimal(1000,2);