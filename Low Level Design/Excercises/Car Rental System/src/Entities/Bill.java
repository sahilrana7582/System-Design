// File: Entities/Bill.java
package Entities;

public class Bill {
    private final String billId;
    private final double amount;
    private String status;

    public Bill(Reservation reservation) {
        this.billId = "BILL-" + System.currentTimeMillis();
        this.amount = 100.00; // Fixed amount for simplicity
        this.status = "PENDING";
    }

    // Getters
    public String getBillId() { return billId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}