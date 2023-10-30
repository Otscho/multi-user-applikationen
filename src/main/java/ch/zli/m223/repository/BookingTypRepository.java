package ch.zli.m223.repository;

import ch.zli.m223.model.BookingTyp;
import ch.zli.m223.model.impl.BookingTypeImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingTypRepository extends JpaRepository<BookingTypeImpl, Long> {

    public default void addBookingTyp (String bookingTyp, Float price){
        save(new BookingTypeImpl(bookingTyp, price));
    }

    Optional<BookingTyp> findBookingTypByBookingType(String bookingTyp);
}
