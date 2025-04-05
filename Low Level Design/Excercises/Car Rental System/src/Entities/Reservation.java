package Entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reservation {

    private String reservationId;
    private User user;
    private Vehicle vehicle;
    private Store store;
    private Date reservationDate;
    private Date returnDate;
    private String status;

    private Reservation(Builder builder) {
        this.reservationId = builder.reservationId;
        this.user = builder.user;
        this.vehicle = builder.vehicle;
        this.store = builder.store;
        this.reservationDate = builder.reservationDate;
        this.returnDate = builder.returnDate;
        this.status = builder.status;
    }

    public static class Builder {
        private String reservationId;
        private User user;
        private Vehicle vehicle;
        private Store store;
        private Date reservationDate;
        private Date returnDate;
        private String status;

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

        public Builder setReservationDate(Date reservationDate) {
            this.reservationDate = reservationDate;
            return this;
        }

        public Builder setReturnDate(Date returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }

    public double calculateBill() {
        return 100.00;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
