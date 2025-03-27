import Banking.AuthenticateProxy;
import Banking.PerformanceMoinitoring;
import Banking.RealClient;
import File_Example.ImageProxy;
import File_Example.RealImage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("image.jpg");
        realImage.display();

        ImageProxy imageProxy = new ImageProxy("image.jpg");
        imageProxy.display();


        System.out.println("==========================");
        System.out.println("Advance Proxy Example");
        System.out.println("==========================");
        RealClient realClient = new RealClient();
        AuthenticateProxy authenticateProxy = new AuthenticateProxy("admin", realClient);
        PerformanceMoinitoring performanceMoinitoring = new PerformanceMoinitoring(authenticateProxy);


        realClient.addBalance(1000);
        performanceMoinitoring.checkBalance();
        performanceMoinitoring.deposit(100);
        performanceMoinitoring.checkBalance();
        performanceMoinitoring.withdraw(400);
        performanceMoinitoring.checkBalance();
        performanceMoinitoring.applyForLoan(500);
        performanceMoinitoring.checkBalance();
        performanceMoinitoring.checkCreditScore();




    }
}