package ch.zli.m223.model.impl;

import ch.zli.m223.model.BookingTyp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="BookingTyp")
public class BookingTypeImpl implements BookingTyp {

    @Id
    @GeneratedValue
    private Long id;

    private String bookingType;

    private double price;

    public BookingTypeImpl(String bookingType, double price) {
        this.bookingType = bookingType;
        this.price = price;
    }

    protected BookingTypeImpl() {
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
    public Double getPrice() {
        return price;
    }
}
