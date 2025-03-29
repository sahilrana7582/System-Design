package Vehicle;

public class Car extends Vehicle implements VehicleType {

    public Car(VehicleType vehicleType, int vehicleNumber, String vehicleName) {
        super(vehicleType, vehicleNumber, vehicleName);
    }

    @Override
    public void vehicleType() {
        System.out.println("Car");
    }
}
