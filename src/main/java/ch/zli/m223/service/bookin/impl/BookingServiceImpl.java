package ch.zli.m223.service.bookin.impl;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.Booking;
import ch.zli.m223.model.BookingTyp;
import ch.zli.m223.service.bookin.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    @Override
    public List<Booking> getBooking() {
        return null;
    }

    @Override
    public Booking getBooking(Long id) {
        return null;
    }

    @Override
    public Booking addBooking(String date, AppUser appUser, BookingTyp bookingTyp) {
        return null;
    }

    @Override
    public Booking updateBooking(Long id, String date, String appUser, String bookingTyp) {
        return null;
    }

    @Override
    public List<Booking> getBookingList() {
        return null;
    }

    @Override
    public void deleteBooking(Long id) {

    }

    @Override
    public Booking setBookingTyp(Long id, String bookingTyp) {
        return null;
    }
}
