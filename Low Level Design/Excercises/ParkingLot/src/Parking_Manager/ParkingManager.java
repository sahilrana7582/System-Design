package Parking_Manager;

import Parking_Spot.ParkingSpot;
import Parking_Spot.SpotType;
import Vehicle.Vehicle;
import Ticket.Ticket;

import java.util.*;

public class ParkingManager {

    private HashMap<SpotType, List<ParkingSpot>> parkingSpots = new HashMap<>();
    private HashMap<String, Ticket> activeTickets = new HashMap<>();
    private int totalSpots = 0;
    private int availableSpots = 0;
    private static final double RATE_PER_MINUTE = 0.5;
    private static ParkingManager parkingManager;

    private ParkingManager() {}

    public static ParkingManager getInstance() {
        if (parkingManager == null) {
            parkingManager = new ParkingManager();
        }
        return parkingManager;
    }

    public void addNewSpot(SpotType spotType, int count) {
        System.out.println("Adding New Spot: " + spotType);
        List<ParkingSpot> list = parkingSpots.getOrDefault(spotType, new ArrayList<>());
        addSpot(spotType, count, list);
        parkingSpots.put(spotType, list);
        totalSpots += count;
        availableSpots += count;
    }

    public void assignSpot(Vehicle vehicle, SpotType spotType) {
        List<ParkingSpot> list = parkingSpots.get(spotType);
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("No spots available for " + spotType);
        }

        for (ParkingSpot spot : list) {
            if (!spot.isOccupied()) {
                spot.assignVehicle(vehicle);
                availableSpots--;

                // Generate ticket and store it
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId, vehicle, spot);
                activeTickets.put(vehicle.getVehicleNumber(), ticket);

                System.out.println("Assigned Vehicle " + vehicle.getVehicleNumber() + " to Spot " + spot.getSpotId());
                System.out.println("Generated Ticket ID: " + ticketId);
                return;
            }
        }
        throw new IllegalStateException("No available spot found.");
    }

    public void releaseSpot(String vehicleNumber) {
        Ticket ticket = activeTickets.get(vehicleNumber);
        if (ticket == null) {
            throw new IllegalArgumentException("No active ticket found for vehicle: " + vehicleNumber);
        }

        ParkingSpot spot = ticket.getParkingSpot();
        spot.releaseSpot();
        availableSpots++;

        ticket.closeTicket();
        double fee = ticket.calculateFee(RATE_PER_MINUTE);

        System.out.println("Vehicle " + vehicleNumber + " is leaving. Total Fee: $" + fee);
        System.out.println("Ticket Details: " + ticket);

        activeTickets.remove(vehicleNumber);
    }

    private void addSpot(SpotType spotType, int count, List<ParkingSpot> list) {
        for (int i = 0; i < count; i++) {
            list.add(new ParkingSpot(String.valueOf(i), spotType));
        }
    }

    public Ticket getTicket(String vehicleNumber) {
        return activeTickets.get(vehicleNumber);
    }
}
