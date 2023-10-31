package ch.zli.m223.controller.subscription.dto;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.AppUserSubscription;
import ch.zli.m223.model.Rebate;
import ch.zli.m223.model.Subscription;

public class SubscriptionDto {
    public  Long id;
    public String startDate;
    public String endDate;

    public AppUser appUser;

    public Subscription subscription;

    public Rebate rebate;

    public SubscriptionDto(AppUserSubscription appUserSubscription) {
        id = appUserSubscription.getId();
        startDate = appUserSubscription.getStartDate();
        endDate = appUserSubscription.getEndDate();
        appUser = appUserSubscription.getAppUser();
        subscription = appUserSubscription.getSubscription();
        rebate = appUserSubscription.getRebate();
    }
}
