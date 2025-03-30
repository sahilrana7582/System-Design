package Vehicle;

import Parking_Spot.SpotType;

public class Vehicle  {

    private String vehicleNumber;
    private String vehicleColor;
    private String ownerName;
    private VehicleType vehicleType;


    public Vehicle(String vehicleNumber, String vehicleColor, String ownerName, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


    public boolean canFitInSpot(SpotType spotType){
        return vehicleType.canFitInSpot(spotType);
    };


}
