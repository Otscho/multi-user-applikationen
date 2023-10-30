package ch.zli.m223.repository;

import ch.zli.m223.model.Subscription;
import ch.zli.m223.model.impl.SubscriptionImpl;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository <SubscriptionImpl, Long> {

    public default void addSubscription (String subscriptionTyp, Float price){
        save(new SubscriptionImpl(subscriptionTyp, price));
    }

}
