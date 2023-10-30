package ch.zli.m223.model.impl;

import ch.zli.m223.model.Booking;
import jakarta.persistence.*;

@Entity(name="Booking")
public class BookingImpl implements Booking {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String date;

    @ManyToOne
    private AppUserImpl appUser;

    @ManyToOne
    private BookingTypeImpl bookingType;

    public BookingImpl(String date, AppUserImpl appUser, BookingTypeImpl bookingType) {
        this.date = date;
        this.appUser = appUser;
        this.bookingType = bookingType;
    }

    protected BookingImpl() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAppUser(AppUserImpl appUser) {
        this.appUser = appUser;
    }

    public void setBookingType(BookingTypeImpl bookingType) {
        this.bookingType = bookingType;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public AppUserImpl getAppUser() {
        return appUser;
    }

    @Override
    public BookingTypeImpl getBookingType() {
        return bookingType;
    }
}
