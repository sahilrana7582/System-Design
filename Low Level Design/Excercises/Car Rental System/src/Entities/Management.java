package Entities;

import java.util.List;

public class Management {

    List<Store> stores;
    List<Vehicle> Vehicles;


    public void setVehicles(List<Vehicle> vehicles) {
        Vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        this.Vehicles.add(vehicle);
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public void addStore(Store store){
        this.stores.add(store);
    }

    public Store getStoreByLocation(Location location){
        for(Store store : stores){
            if(store.getLocation().getCity().equals(location.getCity())){
                return store;
            }
        }

        return null;
    }

    public List<Vehicle> getVehicles(){
        return this.Vehicles;
    }




}
