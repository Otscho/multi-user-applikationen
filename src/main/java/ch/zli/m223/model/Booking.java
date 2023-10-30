package ch.zli.m223.model;

import ch.zli.m223.model.impl.AppUserImpl;
import ch.zli.m223.model.impl.BookingTypeImpl;

import java.util.Date;

public interface Booking {
    Long getId();

    Date getDate();

    AppUserImpl getAppUser();

    BookingTypeImpl getBookingType();
}
