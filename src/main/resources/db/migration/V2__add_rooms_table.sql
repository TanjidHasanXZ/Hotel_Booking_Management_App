CREATE TABLE rooms (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       room_type VARCHAR(255) NOT NULL,
                       room_price DECIMAL(10,2) NOT NULL,
                       room_photo_url VARCHAR(255),
                       room_description TEXT
);
