package ch.zli.m223.model.impl;

import ch.zli.m223.model.BookingTyp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="BookingTyp")
public class BookingTypImpl implements BookingTyp {

    @Id
    @GeneratedValue
    private Long id;

    private String bookingType;

    private Float price;

    public BookingTypImpl(String bookingType, Float price) {
        this.bookingType = bookingType;
        this.price = price;
    }

    protected BookingTypImpl() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getBookingType() {
        return bookingType;
    }

    @Override
    public Float getPrice() {
        return price;
    }
}