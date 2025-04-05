package Entities;

public class Location {

    private String address;
    private String pinCode;
    private String city;
    private String state;


    private Location(Builder builder){
        this.address = builder.address;
        this.pinCode = builder.pinCode;
        this.city = builder.city;
        this.state = builder.state;
    }



    public static class Builder{
        private String address;
        private String pinCode;
        private String city;
        private String state;

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setPinCode(String pinCode){
            this.pinCode = pinCode;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Builder setState(String state){
            this.state = state;
            return this;
        }

        public Location build(){
            return new Location(this);
        }
    }

    public String getCity() {
        return city;
    }

}
