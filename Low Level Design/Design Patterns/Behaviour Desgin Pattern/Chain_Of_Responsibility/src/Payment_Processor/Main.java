package Payment_Processor;

public class Main {
    public static void main(String[] args) {
        Payment cash = new Payment.Builder()
                .paymentType(PaymentType.CASH)
                .amount(100)
                .build();

        Payment card = new Payment.Builder()
                .paymentType(PaymentType.DEBIT)
                .amount(100)
                .build();

        PaymentProcessor cashProcessor = new CashProcessor("Cash Provider");
        PaymentProcessor cardProcessor = new CardProcessor("Card Provider");
        cashProcessor.setNext(cardProcessor);
        cashProcessor.processRequest(card);
    }
}
