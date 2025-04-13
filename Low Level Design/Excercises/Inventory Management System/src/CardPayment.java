public class CardPayment implements PaymentStratergy {

    @Override
    public void pay(Order order) {
        System.out.println("Payment by Card");
        order.setStatus("Paid");
        order.setPaymentMethod("Card");
    }
}
