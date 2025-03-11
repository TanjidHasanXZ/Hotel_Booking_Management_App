package com.tanjidd.TanjidHotel.service.interfac;


import com.tanjidd.TanjidHotel.dto.Response;
import com.tanjidd.TanjidHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}