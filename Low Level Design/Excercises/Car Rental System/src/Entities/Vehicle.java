package Entities;

public class Vehicle {


    private String name;
    private String model;
    private String companyName;
    private VehicleType vehicleType;
    private String numberPlate;
    private int rentalPrice;
    private String kilometerDriven;

    private Vehicle(Builder builder){
        this.name = builder.name;
        this.model = builder.model;
        this.companyName = builder.companyName;
        this.vehicleType = builder.vehicleType;
        this.numberPlate = builder.numberPlate;
        this.rentalPrice = builder.rentalPrice;
        this.kilometerDriven = builder.kilometerDriven;
    }


    public static class Builder{
        private String name;
        private String model;
        private String companyName;
        private VehicleType vehicleType;
        private String numberPlate;
        private int rentalPrice;
        private String kilometerDriven;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public Builder setCompanyName(String companyName){
            this.companyName = companyName;
            return this;
        }

        public Builder setVehicleType(VehicleType vehicleType){
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder setNumberPlate(String numberPlate){
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder setRentalPrice(int rentalPrice){
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Builder setKilometerDriven(String kilometerDriven){
            this.kilometerDriven = kilometerDriven;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

}
