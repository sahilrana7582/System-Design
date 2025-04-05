import Entities.*;
import java.util.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static Management rentalSystem = new Management();
    private static User currentUser;

    public static void main(String[] args) {
        initializeSystem();
        showMainMenu();
    }

    private static void initializeSystem() {
        rentalSystem.setStores(addStore());
        rentalSystem.getStores().forEach(store -> {
            store.setVehicles(addVehicle());
            store.getVehicles().forEach(v -> v.setStatus(VehicleStatus.AVAILABLE));
        });
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1. Register New User");
            System.out.println("2. Login");
            System.out.println("3. Browse Vehicles");
            System.out.println("4. Make Reservation");
            System.out.println("5. View My Reservations");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> login();
                case 3 -> browseVehicles();
                case 4 -> makeReservation();
                case 5 -> viewReservations();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void registerUser() {
        System.out.println("\n=== User Registration ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // Add validation for all fields
        User newUser = new User.Builder()
                .setName(name)
                .setEmail(email)
                .build();

        currentUser = newUser;
        System.out.println("Registration successful!");
    }

    private static void login() {
        System.out.println("\n=== User Login ===");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // Add actual authentication logic
        currentUser = new User.Builder().setEmail(email).build();
        System.out.println("Logged in as: " + email);
    }

    private static void browseVehicles() {
        System.out.println("\n=== Available Vehicles ===");
        rentalSystem.getStores().forEach(store -> {
            System.out.println("\nStore: " + store.getStoreName() + " (" + store.getLocation().getCity() + ")");
            store.getVehicles().stream()
                    .filter(v -> v.getStatus() == VehicleStatus.AVAILABLE)
                    .forEach(v -> System.out.printf(
                            "- %s %s (%s) $%d/day%n",
                            v.getCompanyName(),
                            v.getModel(),
                            v.getVehicleType(),
                            v.getRentalPrice()
                    ));
        });
    }

    private static void makeReservation() {
        if (currentUser == null) {
            System.out.println("Please login first!");
            return;
        }

        System.out.println("\n=== New Reservation ===");
        Location location = getLocationFromUser();
        Store store = rentalSystem.getStoreByLocation(location);

        if (store == null) {
            System.out.println("No stores found in this location");
            return;
        }

        List<Vehicle> availableVehicles = store.getVehicles().stream()
                .filter(v -> v.getStatus() == VehicleStatus.AVAILABLE)
                .toList();

        if (availableVehicles.isEmpty()) {
            System.out.println("No vehicles available at this location");
            return;
        }

        System.out.println("Available vehicles:");
        availableVehicles.forEach(v ->
                System.out.printf("[%d] %s %s - $%d/day%n",
                        availableVehicles.indexOf(v),
                        v.getCompanyName(),
                        v.getModel(),
                        v.getRentalPrice()));

        System.out.print("Select vehicle number: ");
        int vehicleChoice = scanner.nextInt();
        Vehicle selectedVehicle = availableVehicles.get(vehicleChoice);

        System.out.print("Enter rental days: ");
        int rentalDays = scanner.nextInt();

        Date startDate = new Date();
        Date endDate = Date.from(Instant.now().plus(rentalDays, ChronoUnit.DAYS));

        Reservation reservation = store.createReservation(
                selectedVehicle,
                currentUser,
                startDate,
                endDate
        );

        processPayment(reservation);
    }

    private static Location getLocationFromUser() {
        System.out.println("Enter location details:");
        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Postal Code: ");
        String postalCode = scanner.nextLine();

        return new Location.Builder()
                .setCity(city)
                .setPinCode(postalCode)
                .build();
    }

    private static void processPayment(Reservation reservation) {
        System.out.println("\n=== Payment ===");
        System.out.printf("Total amount: $%.2f%n", reservation.calculateBill());

        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.print("Select option: ");

        int choice = scanner.nextInt();
        Payment payment = (choice == 1) ? new CardPayment() : new CashPayment();
        payment.payBill(new Bill(reservation));

        System.out.println("Payment successful! Reservation confirmed.");
    }

    private static void viewReservations() {
        if (currentUser == null) {
            System.out.println("Please login first!");
            return;
        }

        System.out.println("\n=== Your Reservations ===");
        rentalSystem.getStores().stream()
                .flatMap(store -> store.getReservations().stream())
                .filter(r -> r.getUser().equals(currentUser))
                .forEach(r -> System.out.printf(
                        "Reservation %s: %s %s from %s to %s%n",
                        r.getReservationId(),
                        r.getVehicle().getCompanyName(),
                        r.getVehicle().getModel(),
                        r.getReservationDate(),
                        r.getReturnDate()
                ));
    }

    // Initialization methods (similar to original but enhanced)
    private static List<Store> addStore() {
        List<Store> stores = new ArrayList<>();

        stores.add(new Store.Builder()
                .setStoreId("TOR-1")
                .setStoreName("Toronto Downtown")
                .setLocation(new Location.Builder()
                        .setCity("Toronto")
                        .setState("Ontario")
                        .setPinCode("M5H 2N2")
                        .build())
                .build());

        stores.add(new Store.Builder()
                .setStoreId("WAT-1")
                .setStoreName("Waterloo Central")
                .setLocation(new Location.Builder()
                        .setCity("Waterloo")
                        .setState("Ontario")
                        .setPinCode("N2L 3C3")
                        .build())
                .build());

        return stores;
    }

    private static List<Vehicle> addVehicle() {
        return List.of(
                new Vehicle.Builder()
                        .setCompanyName("Tesla")
                        .setModel("Model 3")
                        .setVehicleType(VehicleType.CAR)
                        .setRentalPrice(150)
                        .build(),
                new Vehicle.Builder()
                        .setCompanyName("Ford")
                        .setModel("Transit")
                        .setVehicleType(VehicleType.VAN)
                        .setRentalPrice(200)
                        .build()
        );
    }
}