package ch.zli.m223.model;

import ch.zli.m223.model.impl.AppUserImpl;
import ch.zli.m223.model.impl.RebateImpl;
import ch.zli.m223.model.impl.SubscriptionImpl;

import java.util.Date;

public interface AppUserSubscription {
    Long getId();

    Date getStartDate();

    Date getEndDate();

    AppUserImpl getAppUser();

    SubscriptionImpl getSubscription();

    RebateImpl getRebate();
}
