package Payment_Processor;

public class CashProcessor extends PaymentProcessor{


    public CashProcessor(String paymentName) {
        super(paymentName);
    }


    @Override
    public void processRequest(Payment payment) {
        if(payment.getPaymentType() == PaymentType.CASH){
            System.out.println("This Payment is currently processed by: CASH Provider");
            payment.setProcessed(true);
        }else{
            System.out.println("Cash Provider is not able to Process this payment.");
            passToNextHandler(payment);
        }
    }


}
