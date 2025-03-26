package Advance_ECommerce_Example;

import Advance_ECommerce_Example.Services.Inventory;
import Advance_ECommerce_Example.Services.OrderProcessFascade;
import Advance_ECommerce_Example.Services.Payment;
import Advance_ECommerce_Example.Services.Shhipping;

public class ECommerce {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Payment payment = new Payment.Builder()
                .amount(100)
                .cardHolder("John Doe")
                .cardType("Visa")
                .cardNumber("1234-1234-1234-1234")
                .cvv("123")
                .build();

        Shhipping shipping = new Shhipping("123 Main Street");

        try {
            OrderProcessFascade orderProcessFascade = new OrderProcessFascade(payment, shipping, inventory);
            Boolean result = orderProcessFascade.processOrder("Laptop", 1, "John Doe", "Visa", "1234-1234-1234-1234", "123", "123 Main Street");
            System.out.println("Order Processed: " + result);


            OrderProcessFascade orderProcessFascade1 = new OrderProcessFascade(payment, shipping, inventory);
            Boolean result1 = orderProcessFascade1.processOrder("Mobile", 1, "John Doe", "Visa", "1234-1234-1234-1234", "123", "123 Main Street");
            System.out.println("Order Processed: " + result1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
