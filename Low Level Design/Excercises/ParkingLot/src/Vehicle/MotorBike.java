package Vehicle;

public class MotorBike extends Vehicle implements VehicleType {


    public MotorBike(VehicleType vehicleType, int vehicleNumber, String vehicleName) {
        super(vehicleType, vehicleNumber, vehicleName);
    }

    @Override
    public void vehicleType() {
        System.out.println("MotorBike");
    }
}
