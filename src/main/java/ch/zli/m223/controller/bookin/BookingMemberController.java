package ch.zli.m223.controller.bookin;

import ch.zli.m223.controller.bookin.dto.BookingDto;
import ch.zli.m223.controller.bookin.dto.BookingTypDto;
import ch.zli.m223.controller.bookin.dto.BookingUpdateDto;
import ch.zli.m223.controller.user.dto.UserDto;
import ch.zli.m223.controller.user.dto.UserUpdateDto;
import ch.zli.m223.service.bookin.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Access point for members to their own data
 */
@RestController
@RequestMapping("/api/v1/member/bookings")
@RequiredArgsConstructor
public class BookingMemberController {
    private final BookingService bookingService;

    /**
     * Get a booking by its id
     *
     * @param id the booking id
     * @return (HttpStatus.OK & the booking as bookingDto) or HttpStatus.BAD_REQUEST if booking not found
     */
    @GetMapping("/{id}")
    BookingDto getBooking(@PathVariable("id") Long id) {
        return new BookingDto(bookingService.getBooking(id));
    }

    /**
     * Update a booking given by its id
     *
     * @param id   the booking id
     * @param data everything you want to be changed in the booking object
     * @return (HttpStatus.OK & the booking as BookingDto) or HttpStatus.CONFLICT or HttpStatus.BAD_REQUEST  if booking not found
     */
    @PatchMapping("/{id}")
    BookingDto updateBooking(
            @PathVariable("id") Long id,
            @RequestBody BookingUpdateDto data
    ) {
        return new BookingDto(bookingService.updateBooking(
                id,
                data.date, data.appUser,
                data.bookingTyp
        ));
    }

    /**
     * Delete a booking by id from the server
     *
     * @param id the booking id
     * @return HttpStatus.OK
     */
    @DeleteMapping("/{id}")
    void deleteBooking(@PathVariable("id") Long id) {
        bookingService.deleteBooking(id);
    }

    /**
     * Change bookings typ by id
     *
     * @param id         the bookings id
     * @param bookingTyp any booking you wish, no chech if its a valid bookingType inside the application
     * @return (HttpStatus.OK & the booking as bookingDto) or HttpStatus.BAD_REQUEST if booking not found
     */
    @PutMapping("/{id}/bookingTyp")
    BookingDto setBookingTyp(@PathVariable("id") Long id, @RequestBody BookingTypDto bookingTyp) {
        return new BookingDto(bookingService.setBookingTyp(id, bookingTyp.bookingTyp));
    }
}