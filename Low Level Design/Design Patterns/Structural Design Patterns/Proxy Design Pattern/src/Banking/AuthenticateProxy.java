package Banking;

public class AuthenticateProxy implements Banking_Actions{


    private RealClient realClient;
    private String role;

    public AuthenticateProxy(String role, RealClient realClient) {
        this.realClient = realClient;
        this.role = role;
    }


    @Override
    public void deposit(int amount) {
        if(role.equals("admin")){
            realClient.deposit(amount);
        }else{
            System.out.println("Not Authorized!");
        }
    }

    @Override
    public void checkBalance() {
        if(role.equals("admin")){
            realClient.checkBalance();
        }
    }

    @Override
    public void withdraw(int amount) {
        if(role.equals("admin")){
            realClient.withdraw(amount);
        }
    }

    @Override
    public void applyForLoan(int amount) {
        if(role.equals("admin")){
            realClient.applyForLoan(amount);
        }
    }

    @Override
    public void checkCreditScore() {
        if(role.equals("admin")){
            realClient.checkCreditScore();
        }
    }
}
