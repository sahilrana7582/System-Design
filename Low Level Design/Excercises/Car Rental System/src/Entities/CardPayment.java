package Entities;

public class CardPayment implements Payment{

    @Override
    public void payBill(Bill bill) {
        System.out.println("Paid by card");
        bill.setStatus("Paid");
    }

}
