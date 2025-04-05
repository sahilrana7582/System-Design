package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {

    private String storeId;
    private String storeName;
    private Location location;
    private Management management;
    private List<Reservation> reservations;

    public Store(Builder builder){
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
        this.location = builder.location;
        this.management = new Management();
        this.reservations = new ArrayList<>();
    }

    public static class Builder{

        private String storeId;
        private String storeName;
        private Location location;

        public Builder setStoreId(String storeId){
            this.storeId = storeId;
            return this;
        }
        public Builder setStoreName(String storeName){
            this.storeName = storeName;
            return this;
        }
        public Builder setLocation(Location location){
            this.location = location;
            return this;
        }

        public Store build(){
            return new Store(this);
        }
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation.Builder()
                .setReservationId(Math.random() + "")
                .setReservationDate(new Date())
                .setStatus("Pending")
                .setStore(this)
                .setVehicle(vehicle)
                .setUser(user)
                .build();

        this.reservations.add(reservation);
        System.out.println("Reservation Created Sucessfully...!!!");

        return reservation;
    }

    public void addVehicle(Vehicle vehicle){
        this.management.addVehicle(vehicle);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.management.setVehicles(vehicles);
    }

    public Location getLocation() {
        return location;
    }

    public List<Vehicle> getVehicles(){
        return this.management.getVehicles();
    }

    public void completeReservation(Reservation reservation){
        reservation.setStatus("Completed");
    }

}
