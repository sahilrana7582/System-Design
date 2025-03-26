package Advance_ECommerce_Example.Services;

public class OrderProcessFascade {

    private Payment payment;
    private Shhipping shipping;
    private Inventory inventory;

    public OrderProcessFascade(Payment payment, Shhipping shipping, Inventory inventory) {
        this.payment = payment;
        this.shipping = shipping;
        this.inventory = inventory;
    }

    public Boolean processOrder(String product, int quantity, String cardHolder, String cardType, String cardNumber, String cvv, String shippingAddress) throws InterruptedException {
        if (!inventory.checkEnoughStocks(product, quantity)) {
            System.out.println("Not enough stocks");
            return false;
        }

        if (!inventory.isAvailable(product)) {
            System.out.println("Product is not available");
            return false;
        }

        payment.makePayment();
        String address = shipping.getShippingAddress();

        String msg = String.format("Order of %s %s %s %s %s %s %s is placed", product, quantity, cardHolder, cardType, cardNumber, cvv, shippingAddress);
        System.out.println(msg);

        return true;
    }

}
