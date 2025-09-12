CREATE TABLE item(
	item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    item_group_id INT NOT NULL,
    color VARCHAR(100) NOT NULL,
    
    CONSTRAINT fk_item_item_group
		FOREIGN KEY (item_group_id) REFERENCES item_group(item_group_id)
);

CREATE TABLE size(
	size_id INT AUTO_INCREMENT PRIMARY KEY,
	size_name VARCHAR(10) NOT NULL,
    GENDER ENUM('male', 'female') NOT NULL,
    size_desc VARCHAR(255)
);

CREATE TABLE item_detail(
	item_id INT AUTO_INCREMENT PRIMARY KEY,
    size_id INT NOT NULL,
    sales_price DECIMAL(10,2) DEFAULT 0,
    amount INT NOT NULL DEFAULT 1,
    
    CONSTRAINT fk_item_detail_size 
		FOREIGN KEY (size_id) REFERENCES size(size_id)
);

CREATE TABLE warehouse_receipt(
	whreceipt_id INT AUTO_INCREMENT PRIMARY KEY,
    whreceipt_time DATE NOT NULL,
    employee_id INT NOT NULL,
    
    CONSTRAINT fk_warehouse_receipt_employee
		FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE provider(
	provider_id INT AUTO_INCREMENT PRIMARY KEY,
    provider_name VARCHAR(100) NOT NULL,
    provider_tax DECIMAL(10,2) DEFAULT 0
);

CREATE TABLE item_group(
	item_group_id INT AUTO_INCREMENT PRIMARY KEY,
    item_group_name VARCHAR(100) NOT NULL,
    item_status TINYINT(1) DEFAULT 1
);

CREATE TABLE gallery(
	image_path VARCHAR(255) NOT NULL,
	item_id INT NOT NULL,
    
    CONSTRAINT fk_gallery_item
		FOREIGN KEY (item_id) REFERENCES item(item_id)
);

CREATE TABLE orders(
	orders_id INT AUTO_INCREMENT PRIMARY KEY,
    orders_time DATETIME NOT NULL,
    payment_method_id INT NOT NULL,
    customer_id INT NOT NULL,
    delivery_address_id INT NOT NULL,
    employee_id INT NOT NULL,
    
    CONSTRAINT fk_orders_payment_method 
        FOREIGN KEY (payment_method_id) REFERENCES payment_method(payment_method_id),

    CONSTRAINT fk_orders_customer 
        FOREIGN KEY (customer_id) REFERENCES customer(customer_id),

    CONSTRAINT fk_orders_delivery_address 
        FOREIGN KEY (delivery_address_id) REFERENCES delivery_address(delivery_address_id),

    CONSTRAINT fk_orders_employee 
        FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE bill (
    bill_id         INT AUTO_INCREMENT PRIMARY KEY,
    orders_id        INT NOT NULL,
    delivery_fee    DECIMAL(10,2) DEFAULT 0,
    voucher_id      INT,
    total_of_money  DECIMAL(12,2) NOT NULL, 

    CONSTRAINT fk_bill_order 
        FOREIGN KEY (orders_id) REFERENCES orders(orders_id),

    CONSTRAINT fk_bill_voucher 
        FOREIGN KEY (voucher_id) REFERENCES voucher(voucher_id)
);

CREATE TABLE payment_method (
    payment_method_id   INT AUTO_INCREMENT PRIMARY KEY,
    payment_method_name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE order_detail (
    orders_id   INT NOT NULL,
    item_id    INT NOT NULL,
    amount     INT NOT NULL DEFAULT 1,

    PRIMARY KEY (orders_id, item_id),

    CONSTRAINT fk_order_detail_orders
        FOREIGN KEY (orders_id) REFERENCES orders(orders_id),

    CONSTRAINT fk_order_detail_item 
        FOREIGN KEY (item_id) REFERENCES item(item_id)
);

CREATE TABLE order_status (
    order_status_id   INT AUTO_INCREMENT PRIMARY KEY,
    order_status_desc VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE order_status_detail (
    orders_id        INT NOT NULL,
    order_status_id INT NOT NULL,
    employee_id     INT NOT NULL,
    last_updated    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (orders_id, order_status_id, employee_id, last_updated),

    CONSTRAINT fk_osd_order 
        FOREIGN KEY (orders_id) REFERENCES orders(orders_id),

    CONSTRAINT fk_osd_status 
        FOREIGN KEY (order_status_id) REFERENCES order_status(order_status_id),

    CONSTRAINT fk_osd_employee 
        FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE customer (
    customer_id       INT AUTO_INCREMENT PRIMARY KEY,
    customer_name     VARCHAR(100) NOT NULL,
    customer_email    VARCHAR(100) NOT NULL UNIQUE,
    customer_address  VARCHAR(255),
    customer_phone    VARCHAR(20) NOT NULL UNIQUE,
    customer_password VARCHAR(255) NOT NULL, 
    gmail_token       VARCHAR(255)
);

CREATE TABLE employee (
    employee_id       INT AUTO_INCREMENT PRIMARY KEY,
    employee_name     VARCHAR(100) NOT NULL,
    employee_email    VARCHAR(100) NOT NULL UNIQUE,
    employee_address  VARCHAR(255),
    employee_phone    VARCHAR(20) NOT NULL UNIQUE,
    employee_password VARCHAR(255) NOT NULL,  
    gmail_token       VARCHAR(255),   
    department_id     INT NOT NULL,
    
    CONSTRAINT fk_employee_department 
        FOREIGN KEY (department_id) REFERENCES department(department_id)
);

CREATE TABLE department(
	department_id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

CREATE TABLE delivery_address(
	delivery_address_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    receiver_name VARCHAR(100) NOT NULL,
    receiver_phone VARCHAR(20) NOT NULL,
    address VARCHAR(100) NOT NULL,
    
    CONSTRAINT fk_delivery_address_customer
		FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE voucher(
	voucher_id INT AUTO_INCREMENT PRIMARY KEY,
    reducing_mooney DECIMAL(10,2) DEFAULT 0,
    reducing_in_percent DECIMAL(5,2) DEFAULT 0,
    date_start DATE NOT NULL,
    date_end DATE NOT NULL,
    voucher_status TINYINT(1) DEFAULT 1
);

CREATE TABLE role(
	role_id INT AUTO_INCREMENT PRIMARY KEY,
    role VARCHAR(100) NOT NULL
);

CREATE TABLE role_detail(
	role_detail_id INT AUTO_INCREMENT PRIMARY KEY,
	employee_id INT NOT NULL,
    role_id INT NOT NULL,
    
    CONSTRAINT fk_role_detail_employee
		FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
	CONSTRAINT fk_role_detail_role
		FOREIGN KEY (role_id) REFERENCES role(role_id)
);

CREATE TABLE tax(
	tax_id INT AUTO_INCREMENT PRIMARY KEY,
    tax_in_percent DECIMAL(5,2) DEFAULT 0,
    total_of_money DECIMAL(10,2) DEFAULT 0,
    date_submit DATE NOT NULL,
    date_from DATE NOT NULL,
    date_until DATE NOT NULL
);

CREATE TABLE shopping_cart(
	shopping_card_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    item_id INT NOT NULL,
    amount INT NOT NULL DEFAULT 1,
    date_adding DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_removing DATETIME NULL,
    
    CONSTRAINT fk_cart_customer
		FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
	CONSTRAINT fk_cart_item
		FOREIGN KEY (item_id) REFERENCES item(item_id),
	CONSTRAINT uq_cart UNIQUE (customer_id, item_id)
);

