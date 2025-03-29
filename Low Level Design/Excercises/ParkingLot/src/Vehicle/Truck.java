package Vehicle;

public class Truck extends Vehicle implements VehicleType {

    public Truck(VehicleType vehicleType, int vehicleNumber, String vehicleName) {
        super(vehicleType, vehicleNumber, vehicleName);
    }


    @Override
    public void vehicleType() {
        System.out.println("Truck");
    }
}
