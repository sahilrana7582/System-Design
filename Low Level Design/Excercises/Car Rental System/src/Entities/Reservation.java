// File: Entities/Reservation.java
package Entities;

import java.util.Date;

public class Reservation {
    private final String reservationId;
    private final User user;
    private final Vehicle vehicle;
    private final Store store;
    private String status;

    private Reservation(Builder builder) {
        this.reservationId = builder.reservationId;
        this.user = builder.user;
        this.vehicle = builder.vehicle;
        this.store = builder.store;
        this.status = "PENDING";
    }

    // Getters
    public String getReservationId() { return reservationId; }
    public User getUser() { return user; }
    public Vehicle getVehicle() { return vehicle; }
    public Store getStore() { return store; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder {
        private String reservationId;
        private User user;
        private Vehicle vehicle;
        private Store store;

        public Builder setReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setStore(Store store) {
            this.store = store;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }
}