package ch.zli.m223.model.impl;

import ch.zli.m223.model.AppUserSubscription;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity (name = "AppUserSubscription")
public class AppUserSubscriptionImpl implements AppUserSubscription {

    @Id
    @GeneratedValue
    private Long id;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    private AppUserImpl appUser;

    @ManyToOne
    private SubscriptionImpl subscription;

    @ManyToOne
    private RebateImpl rebate;

    public AppUserSubscriptionImpl(Date startDate, Date endDate, AppUserImpl appUser, SubscriptionImpl subscription, RebateImpl rebate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.appUser = appUser;
        this.subscription = subscription;
        this.rebate = rebate;
    }

    protected AppUserSubscriptionImpl() {}

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setAppUser(AppUserImpl appUser) {
        this.appUser = appUser;
    }

    public void setSubscription(SubscriptionImpl subscription) {
        this.subscription = subscription;
    }

    public void setRebate(RebateImpl rebate) {
        this.rebate = rebate;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Date getStartDate() {
        return startDate;
    }

    @Override
    public Date getEndDate() {
        return endDate;
    }

    @Override
    public AppUserImpl getAppUser() {
        return appUser;
    }

    @Override
    public SubscriptionImpl getSubscription() {
        return subscription;
    }

    @Override
    public RebateImpl getRebate() {
        return rebate;
    }
}
