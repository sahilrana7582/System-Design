package Entities;
public class Bill {

    private String billId;
    private double amount;
    private String status;

    public Bill(Reservation reservation){
        this.amount = reservation.calculateBill();
        this.status = "Pending";
        this.billId = Math.random() * 1000 + "";
    }

    public String getBillId() {
        return billId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
