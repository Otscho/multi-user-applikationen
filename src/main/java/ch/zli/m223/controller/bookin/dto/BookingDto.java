package ch.zli.m223.controller.bookin.dto;

import ch.zli.m223.model.*;

public class BookingDto {
    public Long id;
    public String date;
    public AppUser appUser;

    public BookingTyp bookingTyp;

    public BookingDto(Booking booking) {
        id = booking.getId();
        date = booking.getDate();
        appUser = booking.getAppUser();
        bookingTyp = booking.getBookingTyp();
    }
}
