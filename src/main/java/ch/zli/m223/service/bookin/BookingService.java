package ch.zli.m223.service.bookin;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.Booking;
import ch.zli.m223.model.BookingTyp;
import ch.zli.m223.service.user.exception.InvalidIdException;

import java.text.DateFormat;
import java.util.List;

public interface BookingService {
    /**
     * @return a possibly empty list of AppUserSubscription
     */
    List<Booking> getBooking();

    /**
     * Get a single Booking by id
     * @param id the Booking id (required)
     * @return the Booking
     * @throws InvalidIdException, BookingNotFoundException
     */
    Booking getBooking(Long id);

    /**
     * Add a new Booking
     *
     * @param date (required)
     * @param appUser (required)
     * @param bookingTyp (required)
     * @return the newly made Booking
     */
    Booking addBooking(
            String date,
            AppUser appUser,
            BookingTyp bookingTyp
            );
}
