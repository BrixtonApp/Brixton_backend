package com.arkam.Brixton.service.interfac;

import com.arkam.Brixton.dto.Response;
import com.arkam.Brixton.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
