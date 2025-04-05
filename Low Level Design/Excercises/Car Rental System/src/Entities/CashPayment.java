package Entities;

public class CashPayment implements Payment {
    @Override
    public void payBill(Bill bill) {
        System.out.println("Paid by cash");
        bill.setStatus("Paid");
    }
}
