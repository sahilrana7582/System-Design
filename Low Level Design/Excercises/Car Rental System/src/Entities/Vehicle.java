// File: Entities/Vehicle.java
package Entities;

public class Vehicle {
    private final String companyName;
    private final String model;
    private final VehicleType vehicleType;
    private final String numberPlate;
    private final int rentalPrice;

    private Vehicle(Builder builder) {
        this.companyName = builder.companyName;
        this.model = builder.model;
        this.vehicleType = builder.vehicleType;
        this.numberPlate = builder.numberPlate;
        this.rentalPrice = builder.rentalPrice;
    }

    // Getters
    public String getCompanyName() { return companyName; }
    public String getModel() { return model; }
    public VehicleType getVehicleType() { return vehicleType; }
    public String getNumberPlate() { return numberPlate; }
    public int getRentalPrice() { return rentalPrice; }

    public static class Builder {
        private String companyName;
        private String model;
        private VehicleType vehicleType;
        private String numberPlate;
        private int rentalPrice;

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setVehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder setNumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder setRentalPrice(int rentalPrice) {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}