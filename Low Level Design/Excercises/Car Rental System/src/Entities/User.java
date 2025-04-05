// File: Entities/User.java
package Entities;

public class User {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String licenseNumber;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.licenseNumber = builder.licenseNumber;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getLicenseNumber() { return licenseNumber; }

    public static class Builder {
        private String name;
        private String email;
        private String phoneNumber;
        private String licenseNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}