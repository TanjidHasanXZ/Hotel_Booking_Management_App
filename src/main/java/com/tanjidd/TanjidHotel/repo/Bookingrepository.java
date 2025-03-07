package com.tanjidd.TanjidHotel.repo;

import com.tanjidd.TanjidHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Bookingrepository extends JpaRepository<Booking, Long> {
    List<Booking> findByRoomID(Long roomId);

    List<Booking> findByBookingConfirmationCode(String bookingConfirmationCode);

    List<Booking> findByUserID(Long userID);
}
