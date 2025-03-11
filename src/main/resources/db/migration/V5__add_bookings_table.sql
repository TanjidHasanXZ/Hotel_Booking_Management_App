CREATE TABLE booking (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         check_in_date DATE NOT NULL,
                         check_out_date DATE NOT NULL,
                         booking_confirmation_code VARCHAR(50) UNIQUE NOT NULL,
                         room_id BIGINT NOT NULL,
                         user_id BIGINT NOT NULL,
                         FOREIGN KEY (room_id) REFERENCES rooms (id) ON DELETE CASCADE,
                         FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
