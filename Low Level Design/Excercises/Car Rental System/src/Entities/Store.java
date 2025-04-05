// File: Entities/Store.java
package Entities;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final String storeId;
    private final String storeName;
    private final Location location;
    private final Management management;
    private final List<Reservation> reservations;

    public Store(Builder builder) {
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
        this.location = builder.location;
        this.management = new Management();
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation.Builder()
                .setReservationId("RES-" + System.currentTimeMillis())
                .setUser(user)
                .setVehicle(vehicle)
                .setStore(this)
                .build();

        reservations.add(reservation);
        return reservation;
    }

    // Getters
    public String getStoreId() { return storeId; }
    public String getStoreName() { return storeName; }
    public Location getLocation() { return location; }
    public List<Vehicle> getVehicles() { return management.getVehicles(); }
    public List<Reservation> getReservations() { return reservations; }

    public void setVehicles(List<Vehicle> vehicles) {
        management.setVehicles(vehicles);
    }

    public void completeReservation(Reservation reservation) {
        reservation.setStatus("COMPLETED");
    }

    public static class Builder {
        private String storeId;
        private String storeName;
        private Location location;

        public Builder setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Store build() {
            return new Store(this);
        }
    }
}