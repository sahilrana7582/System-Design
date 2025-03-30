package exit;


import Parking_Manager.ParkingManager;
import Ticket.Ticket;

public class ExitGate {
    private String gateId;
    private ParkingManager parkingManager;

    public ExitGate(String gateId) {
        this.gateId = gateId;
        this.parkingManager = ParkingManager.getInstance();
    }

    public void exitParking(String vehicleNumber) {
        System.out.println("🚗 Vehicle " + vehicleNumber + " is exiting via Gate " + gateId);
        try {
            Ticket ticket = parkingManager.getTicket(vehicleNumber);
            if (ticket == null) {
                System.out.println("❌ No active ticket found for Vehicle: " + vehicleNumber);
                return;
            }

            parkingManager.releaseSpot(vehicleNumber);
            System.out.println("✅ Vehicle " + vehicleNumber + " has exited. Ticket Closed.");
        } catch (Exception e) {
            System.out.println("❌ Exit Failed: " + e.getMessage());
        }
    }
}