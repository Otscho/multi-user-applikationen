package ch.zli.m223.model.impl;

import ch.zli.m223.model.Booking;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity(name="Booking")
public class BookingImpl implements Booking {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    private AppUserImpl appUser;

    @ManyToOne
    private BookingTypeImpl bookingType;

    public BookingImpl(Date date, AppUserImpl appUser, BookingTypeImpl bookingType) {
        this.date = date;
        this.appUser = appUser;
        this.bookingType = bookingType;
    }
}
