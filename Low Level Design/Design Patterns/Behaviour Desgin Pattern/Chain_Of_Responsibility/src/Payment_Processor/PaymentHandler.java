package Payment_Processor;

public interface PaymentHandler {

    void setNext(PaymentHandler handler);

    void processRequest(Payment payment);

}
