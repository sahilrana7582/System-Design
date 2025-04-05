// File: Entities/Management.java
package Entities;

import java.util.ArrayList;
import java.util.List;

public class Management {
    private List<Store> stores = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public Store getStoreByLocation(Location location) {
        return stores.stream()
                .filter(store -> store.getLocation().getCity().equals(location.getCity()))
                .findFirst()
                .orElse(null);
    }

    public List<Store> getStores() {
        return stores;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}