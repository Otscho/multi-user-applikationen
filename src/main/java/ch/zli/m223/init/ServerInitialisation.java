package ch.zli.m223.init;

import ch.zli.m223.Rebates.SubcriptionRebates;
import ch.zli.m223.Subscription.Subscription;
import ch.zli.m223.bookingTyps.BookingTyps;
import ch.zli.m223.repository.BookingTypRepository;
import ch.zli.m223.repository.RebateRepository;
import ch.zli.m223.repository.SubscriptionRepository;
import ch.zli.m223.service.bookin.BookingService;
import ch.zli.m223.service.subscription.AppUserSubscriptionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.zli.m223.repository.RoleRepository;
import ch.zli.m223.roles.UserRoles;
import ch.zli.m223.service.user.UserService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ServerInitialisation implements ApplicationRunner {

    private final UserService userService;
    private final RoleRepository roleRepository;
    private final BookingTypRepository bookingTypRepository;
    private final RebateRepository rebateRepository;
    private final BookingService bookingService;
    private final AppUserSubscriptionService appUserSubscriptionService;
    private final SubscriptionRepository subscription;

    @Value("${test.data.create.user:false}")
    private boolean createTestDataForUser;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (createTestDataForUser) {
            roleRepository.addRole(UserRoles.member);
            roleRepository.addRole(UserRoles.admin);

            bookingTypRepository.addBookingTyp(BookingTyps.fullDay, BookingTyps.fullDayPrice);
            bookingTypRepository.addBookingTyp(BookingTyps.morning, BookingTyps.halfDayPrice);
            bookingTypRepository.addBookingTyp(BookingTyps.afternoon, BookingTyps.halfDayPrice);

            subscription.addSubscription(Subscription.yearSubscription, Subscription.yearSubscriptionPrice);
            subscription.addSubscription(Subscription.monthSubscription, Subscription.monthSubscriptionPrice);

            rebateRepository.addRebate(SubcriptionRebates.smallRebate);
            rebateRepository.addRebate(SubcriptionRebates.bigRebate);

            userService.addUser("admin", "admin", "admin@admin.com", "admin");
            userService.addUser("Max", "Werner", "max@werner.com", "maxwerner");
            userService.addUser("Mini", "Max", "mini@max.com", "minimax");
            userService.addUser("Lady", "Gaga", "lady@gaga.com", "ladygaga");

            bookingService.addBooking("23.11.2023", userService.getUser(2L), bookingTypRepository.getReferenceById(1L));
            bookingService.addBooking("10.11.2023", userService.getUser(3L), bookingTypRepository.getReferenceById(2L));

            appUserSubscriptionService.addAppUserSubscription("31.10.2023", "30.10.2024", userService.getUser(2L), subscription.getReferenceById(2L), rebateRepository.getReferenceById(1L));
        }
    }
}
