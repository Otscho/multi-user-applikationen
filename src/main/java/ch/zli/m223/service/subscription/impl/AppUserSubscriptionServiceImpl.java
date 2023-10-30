package ch.zli.m223.service.subscription.impl;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.AppUserSubscription;
import ch.zli.m223.model.Rebate;
import ch.zli.m223.model.Subscription;
import ch.zli.m223.service.subscription.AppUserSubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppUserSubscriptionServiceImpl implements AppUserSubscriptionService {

    @Override
    public List<AppUserSubscription> getAppUserSubscription() {
        return null;
    }

    @Override
    public AppUserSubscription getAppUserSubscription(Long id) {
        return null;
    }
    @Override
    public AppUserSubscription addAppUserSubscription(String startDate, String endDate, AppUser appUser, Subscription subscription, Rebate rebate) {
        return null;
    }
    @Override
    public AppUserSubscription addAppUserSubscription(String startDate, String endDate) {
        return null;
    }

    @Override
    public void deleteAppUserSubscription(Long id) {

    }

    @Override
    public AppUserSubscription updateAppUserSubscription(Long id, Date startDate, Date endDate) {
        return null;
    }
}
