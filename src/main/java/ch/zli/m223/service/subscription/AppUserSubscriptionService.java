package ch.zli.m223.service.subscription;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.AppUserSubscription;
import ch.zli.m223.model.Rebate;
import ch.zli.m223.model.Subscription;
import ch.zli.m223.service.user.exception.InvalidIdException;

import java.util.Date;
import java.util.List;

public interface AppUserSubscriptionService {
    /**
     * @return a possibly empty list of AppUserSubscription
     */
    List<AppUserSubscription> getAppUserSubscription();

    /**
     * Get a single AppUserSubscription by id
     * @param id the AppUserSubscription id (required)
     * @return the AppUserSubscription
     * @throws InvalidIdException, AppUserSubscriptionNotFoundException
     */
    AppUserSubscription getAppUserSubscription(Long id);

    /**
     * Add a new AppUserSubscriptions
     *
     * @param startDate start Date (required)
     * @param endDate end Date (required)
     * @param appUser (required)
     * @param subscription (required)
     * @param rebate ()
     * @return the newly made userSubscriptions
     */
    AppUserSubscription addAppUserSubscription(
            String startDate,
            String  endDate,
            AppUser appUser,
            Subscription subscription,
            Rebate rebate
    );

    AppUserSubscription addAppUserSubscription(String startDate, String endDate);

    /**
     * Delete a AppUserSubscription
     * @param id the AppUserSubscription id (required)
     * @throws InvalidIdException
     */
    void deleteAppUserSubscription(Long id);

    /**
     * Update a AppUserSubscription
     *
     * @param id the AppUserSubscription id (required)
     * @param startDate  start Date (required)
     * @param endDate end Date (required)
     * @return the changed AppUserSubscription
     * @throws InvalidIdException, UserNotFoundException, UserAllredyExistsException
     */
    AppUserSubscription updateAppUserSubscription(
            Long id,
            Date startDate, Date endDate
    );
}
