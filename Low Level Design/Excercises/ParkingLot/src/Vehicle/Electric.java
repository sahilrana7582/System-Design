package Vehicle;

public class Electric extends Vehicle implements VehicleType {


    public Electric(VehicleType vehicleType, int vehicleNumber, String vehicleName) {
        super(vehicleType, vehicleNumber, vehicleName);
    }

    @Override
    public void vehicleType() {
        System.out.println("Electric");
    }
}
