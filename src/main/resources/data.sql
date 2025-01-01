CREATE TABLE IF NOT EXISTS food (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL
);


INSERT INTO menu_item (name, description, price, category, availability) VALUES
('Pasta', 'Delicious creamy pasta', 250.00, 'Main Course', TRUE),
('Caesar Salad', 'Fresh lettuce and croutons', 150.00, 'Salad', TRUE),
('Tiramisu', 'Classic Italian dessert', 200.00, 'Dessert', TRUE);
