package ch.zli.m223.model;

import ch.zli.m223.model.impl.AppUserImpl;
import ch.zli.m223.model.impl.BookingTypeImpl;

import java.text.DateFormat;

public interface Booking {
    Long getId();

    String getDate();

    AppUserImpl getAppUser();

    BookingTypeImpl getBookingType();
}
