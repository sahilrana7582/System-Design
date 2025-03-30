package entry;

import Parking_Manager.ParkingManager;
import Parking_Spot.SpotType;
import Ticket.Ticket;
import Vehicle.Vehicle;

public class EntryGate {

    private String gateId;
    private ParkingManager parkingManager;

    public EntryGate(String gateId) {
        this.gateId = gateId;
        this.parkingManager = ParkingManager.getInstance();
    }

    public Ticket enterParking(Vehicle vehicle, SpotType spotType) {
        System.out.println("🚗 Vehicle " + vehicle.getVehicleNumber() + " is entering via Gate " + gateId);

        try {
            parkingManager.assignSpot(vehicle, spotType);
            Ticket ticket = parkingManager.getTicket(vehicle.getVehicleNumber());
            System.out.println("🎫 Ticket Issued: " + ticket);
            return ticket;
        } catch (Exception e) {
            System.out.println("❌ Entry Failed: " + e.getMessage());
            return null;
        }
    }
}
