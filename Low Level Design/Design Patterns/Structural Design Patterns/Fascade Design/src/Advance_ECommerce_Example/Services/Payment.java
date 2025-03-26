package Advance_ECommerce_Example.Services;

public class Payment {

    private Integer amount;
    private String cardHolder;
    private String cardType;
    private String cardNumber;
    private String cvv;
    private Boolean paymentSuccess;
    private Thread thread = new Thread(()->this.paymentSuccess = true);


    private Payment(Builder builder) {
        this.amount = builder.amount;
        this.cardHolder = builder.cardHolder;
        this.cardType = builder.cardType;
        this.cardNumber = builder.cardNumber;
        this.cvv = builder.cvv;

    }

    public static class Builder {
        private Integer amount;
        private String cardHolder;
        private String cardType;
        private String cardNumber;
        private String cvv;

        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        public Builder cardHolder(String cardHolder) {
            this.cardHolder = cardHolder;
            return this;
        }

        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder cvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }

    }


    public void makePayment() throws InterruptedException {
        System.out.println("Payment Processing...");
        Thread.sleep(5000);
        System.out.println("Payment Done");
        String msg = String.format("Payment of %s %s %s %s %s is successful", amount, cardHolder, cardType, cardNumber, cvv);
        System.out.println(msg);
    }



}
