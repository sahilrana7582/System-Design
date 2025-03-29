package Ticket;

import java.time.Duration;
import java.time.LocalDateTime;
import Vehicle.Vehicle;
import Parking_Spot.ParkingSpot;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private boolean isActive;

    // Constructor: ticket is generated at the time of entry
    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
        this.isActive = true;
    }

    // Getters
    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public boolean isActive() {
        return isActive;
    }

    // Close the ticket: set exit time and mark ticket as inactive
    public void closeTicket() {
        this.exitTime = LocalDateTime.now();
        this.isActive = false;
    }

    // Calculate parking duration in minutes
    public long getParkingDurationInMinutes() {
        LocalDateTime endTime = (exitTime != null) ? exitTime : LocalDateTime.now();
        return Duration.between(entryTime, endTime).toMinutes();
    }

    // Optional: calculate fee based on duration and a rate per minute
    public double calculateFee(double ratePerMinute) {
        return getParkingDurationInMinutes() * ratePerMinute;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", isActive=" + isActive +
                '}';
    }
}
