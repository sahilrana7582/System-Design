import java.util.*;
import java.time.LocalDateTime;

public class BookingFlow {

    public static Booking createBooking(User user, Movie movie, Screen screen, LocalDateTime showTime) {
        Scanner sc = new Scanner(System.in);
        List<Seat> availableSeats = screen.getSeats().stream()
                .filter(seat -> seat.getSeatStatus().equalsIgnoreCase("Available"))
                .toList();

        if (availableSeats.isEmpty()) {
            System.out.println("❌ No available seats for this show.");
            return null;
        }

        System.out.println("\nAvailable Seats:");
        availableSeats.forEach(seat ->
                System.out.println(seat.getSeatId() + " | Type: " + seat.getSeatType() + " | ₹" + seat.getSeatCost())
        );

        System.out.println("\nEnter number of seats to book:");
        int count = Integer.parseInt(sc.nextLine());

        List<Seat> selectedSeats = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter Seat ID #" + (i + 1) + ": ");
            String seatId = sc.nextLine();

            Optional<Seat> matched = availableSeats.stream()
                    .filter(seat -> seat.getSeatId().equalsIgnoreCase(seatId))
                    .findFirst();

            if (matched.isPresent()) {
                Seat seat = matched.get();
                seat.setSeatStatus("Booked");
                selectedSeats.add(seat);
            } else {
                System.out.println("❌ Invalid or already booked seat. Try again.");
                i--;
            }
        }

        double total = selectedSeats.stream().mapToDouble(s -> Double.parseDouble(s.getSeatCost())).sum();

        System.out.println("\nTotal Amount to Pay: ₹" + total);
        System.out.println("Proceed with payment? (yes/no)");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            return null;
        }

        boolean paymentDone = Payment.processPayment(user, total);
        if (paymentDone) {
            String bookingId = UUID.randomUUID().toString();
            Booking booking = new Booking(bookingId, movie.getMovieName(), screen.getScreenName(), showTime, user.getName(), selectedSeats.size());
            System.out.println(booking);
            return booking;
        }

        return null;
    }
}
