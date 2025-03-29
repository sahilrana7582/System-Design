package Payment_Processor;

public class CardProcessor extends PaymentProcessor{
    public CardProcessor(String paymentName) {
        super(paymentName);
    }


    @Override
    public void processRequest(Payment payment) {
        if(payment.getPaymentType() == PaymentType.CREDIT || payment.getPaymentType() == PaymentType.DEBIT){
            System.out.println("This Payment is currently processed by: Card Provider");
            payment.setProcessed(true);
        }else{
            System.out.println("Cash Provider is not able to Process Card Provider.");
            passToNextHandler(payment);
        }
    }
}
