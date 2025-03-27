package Banking;

public class RealClient implements Banking_Actions {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String password;
    private String accountNumber;
    private String accountType;
    private double balance;
    private Integer creditScore = 800;


    @Override
    public void deposit(int amount) {
        if(amount > 0){
            balance += amount;
        }
        System.out.println("Deposited " + amount + " into " + accountNumber);
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: " + balance + " For " + accountNumber);
    }

    @Override
    public void withdraw(int amount) {
        if(amount > balance){
            System.out.println("Insufficient Balance." + " Current Balance: " + balance);
        }else{
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountNumber + " Current Balance: " + balance);
        }
    }

    @Override
    public void applyForLoan(int amount) {
        if(creditScore < 760){
            System.out.println("Insufficient Credit Score. Current Credit Score: " + creditScore);
        }else{
            balance += amount;
            System.out.println("Loan Approved. Amount: " + amount + " Current Balance: " + balance);
        }
    }

    @Override
    public void checkCreditScore() {
        System.out.println("Credit Score: " + creditScore + " For " + accountNumber);
    }

    public void addBalance(int amount){
        this.balance += amount;
    }
}
