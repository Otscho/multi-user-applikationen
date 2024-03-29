package ch.zli.m223.model.impl;

import ch.zli.m223.model.Subscription;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity (name = "Subscription")
public class SubscriptionImpl implements Subscription {

    @GeneratedValue
    @Id
    private Long id;

    private String SubscriptionType;

    private Float price;

    public SubscriptionImpl(String subscriptionType, Float price) {
        SubscriptionType = subscriptionType;
        this.price = price;
    }

    protected SubscriptionImpl() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getSubscriptionType() {
        return SubscriptionType;
    }

    @Override
    public Float getPrice() {
        return price;
    }
}
