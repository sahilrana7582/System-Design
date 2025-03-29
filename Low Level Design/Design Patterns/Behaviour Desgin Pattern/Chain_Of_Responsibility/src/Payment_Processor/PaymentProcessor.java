package Payment_Processor;

public class PaymentProcessor implements PaymentHandler {

    private String providerName;
    private PaymentHandler nextHandler;

    public PaymentProcessor(String paymentName) {
        this.providerName = paymentName;
    }

    @Override
    public void setNext(PaymentHandler handler) {
        this.nextHandler = handler;
    }



    @Override
    public void processRequest(Payment payment) {
        if(nextHandler != null){
            System.out.println("This Payment is currently processed by: " + providerName);
            nextHandler.processRequest(payment);
        }else{
            System.out.println("End of the Chain. We cannot process this payment: " + providerName);
        }
    }


    protected void passToNextHandler(Payment payment) {
        if (nextHandler != null) {
            nextHandler.processRequest(payment);
        } else {
            System.out.println("End of chain reached. Payment could not be processed.");
        }
    }
}
