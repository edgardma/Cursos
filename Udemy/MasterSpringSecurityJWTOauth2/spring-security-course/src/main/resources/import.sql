-- USUARIOS
INSERT INTO "user" (username, name, password, role) VALUES ('lmarquez', 'luis márquez', '$2a$10$yjEdH56JdiyFMtmGXTH3aOFCnQki3yMWlKyYtZRv0EUzkWNg9OGAC', 'ROLE_CUSTOMER');
INSERT INTO "user" (username, name, password, role) VALUES ('fperez', 'fulano pérez', '$2a$10$1/.3Mmutk0F2HVBtBD6NIuNQJmCYkg8VPkm8P..zRAbywgwIOvnfC', 'ROLE_ASSISTANT_ADMINISTRATOR');
INSERT INTO "user" (username, name, password, role) VALUES ('mhernandez', 'mengano hernández', '$2a$10$8dUQnl8pPbrNWZoXD8hUD.1ZgsnEvh7lhk7vBCub7vco3vdfvM2VW', 'ROLE_ADMINISTRATOR');

-- CREACIÓN DE CATEGORIAS
INSERT INTO category (name, status) VALUES ('Electrónica', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Ropa', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Deportes', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Hogar', 'ENABLED');

-- CREACIÓN DE PRODUCTOS
INSERT INTO product (name, price, status, category_id) VALUES ('Smartphone', 500.00, 'ENABLED', 1);
INSERT INTO product (name, price, status, category_id) VALUES ('Auriculares Bluetooth', 50.00, 'DISABLED', 1);
INSERT INTO product (name, price, status, category_id) VALUES ('Tablet', 300.00, 'ENABLED', 1);

INSERT INTO product (name, price, status, category_id) VALUES ('Camiseta', 25.00, 'ENABLED', 2);
INSERT INTO product (name, price, status, category_id) VALUES ('Pantalones', 35.00, 'ENABLED', 2);
INSERT INTO product (name, price, status, category_id) VALUES ('Zapatos', 45.00, 'ENABLED', 2);

INSERT INTO product (name, price, status, category_id) VALUES ('Balón de Fútbol', 20.00, 'ENABLED', 3);
INSERT INTO product (name, price, status, category_id) VALUES ('Raqueta de Tenis', 80.00, 'DISABLED', 3);

INSERT INTO product (name, price, status, category_id) VALUES ('Aspiradora', 120.00, 'ENABLED', 4);
INSERT INTO product (name, price, status, category_id) VALUES ('Licuadora', 50.00, 'ENABLED', 4);