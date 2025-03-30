package Parking_Spot;


import Vehicle.Vehicle;

public class ParkingSpot {


    private String spotId;
    private SpotType spotType;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String spotId, SpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    private void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    public void assignVehicle(Vehicle vehicle) {
        if(isOccupied){
            throw new IllegalStateException("Spot is already occupied");
        }

        if(!vehicle.canFitInSpot(spotType)){
            throw new IllegalStateException("Vehicle cannot fit in the spot");
        }
        this.vehicle = vehicle;
        this.setOccupied(true);
    }

    public void releaseSpot() {
        if(!isOccupied){
            throw new IllegalStateException("Spot is already empty");
        }
        this.vehicle = null;
        this.setOccupied(false);
    }

}
