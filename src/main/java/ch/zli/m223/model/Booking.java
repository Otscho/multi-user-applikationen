package ch.zli.m223.model;

public interface Booking {
    Long getId();
    String getDate();
    AppUser getAppUser();
    BookingTyp getBookingTyp();
}
