import Parking_Manager.ParkingManager;


import Parking_Spot.SpotType;
import Vehicle.*;
import entry.EntryGate;
import exit.ExitGate;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingManager parkingManager = ParkingManager.getInstance();
        parkingManager.addNewSpot(SpotType.FOUR_WHEELER, 5);

        EntryGate entranceGate = new EntryGate("E1");
        ExitGate exitGate = new ExitGate("X1");



        Vehicle car1 = new Vehicle("KA-01-AB-1234", "Red", "John Doe", VehicleType.CAR);
        Vehicle car2 = new Vehicle("KA-02-A3-1334", "Red", "John Doe", VehicleType.CAR);

        entranceGate.enterParking(car1, SpotType.FOUR_WHEELER);
        entranceGate.enterParking(car2, SpotType.FOUR_WHEELER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        exitGate.exitParking(car1.getVehicleNumber());

        Thread.sleep(5000);
        exitGate.exitParking(car2.getVehicleNumber());
    }
}
