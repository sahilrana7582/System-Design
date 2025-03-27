package Banking;

public class PerformanceMoinitoring implements Banking_Actions{
    private AuthenticateProxy authenticateProxy;
    private Long timeStamp;

    public PerformanceMoinitoring(AuthenticateProxy authenticateProxy) {
        this.authenticateProxy = authenticateProxy;
    }

    @Override
    public void deposit(int amount) {
        Long startTime = System.currentTimeMillis();
        authenticateProxy.deposit(amount);
        Long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));
    }

    @Override
    public void checkBalance() {
        Long startTime = System.currentTimeMillis();
        authenticateProxy.checkBalance();
        Long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));
    }

    @Override
    public void withdraw(int amount) {
        Long startTime = System.currentTimeMillis();
        authenticateProxy.withdraw(amount);
        Long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));
    }

    @Override
    public void applyForLoan(int amount) {
        Long startTime = System.currentTimeMillis();
        authenticateProxy.applyForLoan(amount);
        Long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));
    }

    @Override
    public void checkCreditScore() {
        Long startTime = System.currentTimeMillis();
        authenticateProxy.checkCreditScore();
        Long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: " + (endTime - startTime));
    }
}
