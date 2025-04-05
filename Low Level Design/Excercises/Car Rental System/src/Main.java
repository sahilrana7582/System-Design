// File: Main.java
import Entities.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Vehicle Rental Simulation...\n");

        // Initialize system with test data
        List<User> users = addUser();
        List<Vehicle> vehicles = addVehicle();
        List<Store> stores = addStore();
        Management rentalSystem = new Management();
        rentalSystem.setStores(stores);

        // Simulation Step 1: User Creation
        System.out.println("=== Step 1: Creating Test User ===");
        Thread.sleep(5000);
        User user = users.get(0);
        System.out.println("Created user: " + user.getName());
        System.out.println("Email: " + user.getEmail() + "\n");

        // Simulation Step 2: Store Setup


        System.out.println("=== Step 2: Initializing Stores ===");
        Thread.sleep(5000);
        Store store = stores.get(0);
        System.out.println("Initialized store: " + store.getStoreName());
        System.out.println("Location: " + store.getLocation().getCity() + "\n");

        // Simulation Step 3: Add Vehicles to Store
        System.out.println("=== Step 3: Adding Vehicles to Store ===");
        Thread.sleep(5000);
        store.setVehicles(vehicles);
        System.out.println("Added " + store.getVehicles().size() + " vehicles to store\n");

        // Simulation Step 4: Create Reservation
        System.out.println("=== Step 4: Creating Reservation ===");
        Thread.sleep(5000);
        Vehicle vehicle = store.getVehicles().get(0);
        Reservation reservation = store.createReservation(vehicle, user);
        System.out.println("Created reservation ID: " + reservation.getReservationId());
        System.out.println("Vehicle: " + vehicle.getCompanyName() + " " + vehicle.getModel() + "\n");

        // Simulation Step 5: Process Payment
        System.out.println("=== Step 5: Processing Payment ===");
        Thread.sleep(5000);

        Bill bill = new Bill(reservation);
        Payment payment = new CashPayment();
        payment.payBill(bill);
        System.out.println("Payment status: " + bill.getStatus() + "\n");

        // Simulation Step 6: Complete Reservation
        System.out.println("=== Step 6: Completing Reservation ===");
        Thread.sleep(5000);

        store.completeReservation(reservation);
        System.out.println("Reservation status: " + reservation.getStatus() + "\n");


        System.out.println("Simulation completed successfully!");
        Thread.sleep(5000);


    }

    public static List<User> addUser() {
        return Collections.singletonList(
                new User.Builder()
                        .setName("John Doe")
                        .setEmail("john@example.com")
                        .setLicenseNumber("DL-123456")
                        .setPhoneNumber("555-0100")
                        .build()
        );
    }

    public static List<Vehicle> addVehicle() {
        return Arrays.asList(
                new Vehicle.Builder()
                        .setCompanyName("Toyota")
                        .setModel("Camry")
                        .setVehicleType(VehicleType.CAR)
                        .setNumberPlate("ABC-123")
                        .setRentalPrice(50)
                        .build(),
                new Vehicle.Builder()
                        .setCompanyName("Ford")
                        .setModel("Transit")
                        .setVehicleType(VehicleType.VAN)
                        .setNumberPlate("XYZ-789")
                        .setRentalPrice(75)
                        .build()
        );
    }

    public static List<Store> addStore() {
        return Collections.singletonList(
                new Store.Builder()
                        .setStoreId("STORE-001")
                        .setStoreName("Downtown Rental")
                        .setLocation(new Location.Builder()
                                .setCity("Metropolis")
                                .setState("State")
                                .setAddress("123 Main St")
                                .setPinCode("12345")
                                .build())
                        .build()
        );
    }
}