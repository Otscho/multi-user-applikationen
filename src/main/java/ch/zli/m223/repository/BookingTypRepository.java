package ch.zli.m223.repository;

import ch.zli.m223.model.BookingTyp;
import ch.zli.m223.model.impl.BookingTypImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingTypRepository extends JpaRepository<BookingTypImpl, Long> {

    public default void addBookingTyp (String bookingTyp, Float price){
        save(new BookingTypImpl(bookingTyp, price));
    }

    Optional<BookingTyp> findBookingTypByBookingType(String bookingTyp);
}
