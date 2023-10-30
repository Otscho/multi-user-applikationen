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

    private Integer price;

    public SubscriptionImpl(String subscriptionType, Integer price) {
        SubscriptionType = subscriptionType;
        this.price = price;
    }
}
