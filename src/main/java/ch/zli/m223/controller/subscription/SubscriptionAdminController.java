package ch.zli.m223.controller.subscription;

import ch.zli.m223.controller.subscription.dto.SubscriptionDto;
import ch.zli.m223.controller.subscription.dto.SubscriptionTypDto;
import ch.zli.m223.controller.subscription.dto.SubscriptionUpdateDto;
import ch.zli.m223.service.subscription.AppUserSubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/admin/subscription")
@RequiredArgsConstructor
public class SubscriptionAdminController {

    private final AppUserSubscriptionService appUserSubscriptionService;

    /**
     * Get list of all existing subscriptions
     *
     * @return al list of subscription & HttpStatus.OK
     */
    @GetMapping()
    List<SubscriptionDto> getSubscriptionList() {
        return appUserSubscriptionService.getSubscriptionList().stream()
                .map( subscription -> new SubscriptionDto(subscription))
                .collect(Collectors.toList());
    }

    /**
     * Get a subscription by its Id
     *
     * @param id the Subscription id
     * @return (HttpStatus.OK & the Subscription as SubscriptionDto) or HttpStatus.BAD_REQUEST if Subscription not found
     */
    @GetMapping("/{id}")
    SubscriptionDto getSubscription(@PathVariable("id") Long id) {
        return new SubscriptionDto(appUserSubscriptionService.getAppUserSubscription(id));
    }

    /**
     * Update a subscription given by its Id
     *
     * @param id the subscription id
     * @param data everything you want to be changed in the subscription object
     * @return (HttpStatus.OK & the subscription as SubscriptionDto) or HttpStatus.CONFLICT or HttpStatus.BAD_REQUEST  if subscription not found
     */
    @PatchMapping("/{id}")
    SubscriptionDto updateSubscription(
            @PathVariable("id") Long id,
            @RequestBody SubscriptionUpdateDto data
    ) {
        return new SubscriptionDto(appUserSubscriptionService.updateSubscription(
                id,
                data.startDate, data.endDate,
                data.appUser, data.subscriptionTyp, data.rebate
        ));
    }

    /**
     * Delete a subscription by Id from the server
     *
     * @param id the subscription id
     * @return HttpStatus.OK
     */
    @DeleteMapping("/{id}")
    void deleteSubscription(@PathVariable("id") Long id) {
        appUserSubscriptionService.deleteAppUserSubscription(id);
    }

    /**
     * Change subscription role by id
     * @param id the subscription id
     * @param subscriptionTyp any subscription typ you wish, no chech if its a valid role inside the application
     * @return (HttpStatus.OK & the subscription as SubscriptionDto) or HttpStatus.BAD_REQUEST if subscription not found
     */
    @PutMapping("/{id}/subscription_typ")
    SubscriptionDto setSubscriptionTyp(@PathVariable("id") Long id, @RequestBody SubscriptionTypDto subscriptionTyp) {
        return new SubscriptionDto(appUserSubscriptionService.setSubscriptionTyp(id, subscriptionTyp.subscriptionTyp));
    }
}
