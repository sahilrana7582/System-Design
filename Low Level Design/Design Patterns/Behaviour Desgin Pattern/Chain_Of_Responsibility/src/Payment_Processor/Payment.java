package Payment_Processor;

public class Payment {

    private PaymentType paymentType;
    private double amount;
    private Boolean processed;

    private Payment(Builder builder){
        this.paymentType = builder.paymentType;
        this.amount = builder.amount;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Boolean getProcessed() {
        return this.processed;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public static class Builder{
        private PaymentType paymentType;
        private double amount;

        public Builder paymentType(PaymentType paymentType){
            this.paymentType = paymentType;
            return this;
        }

        public Builder amount(double amount){
            this.amount = amount;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}
