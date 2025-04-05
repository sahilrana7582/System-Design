// File: Entities/CashPayment.java
package Entities;

public class CashPayment implements Payment {
    @Override
    public void payBill(Bill bill) {
        bill.setStatus("PAID");
    }
}