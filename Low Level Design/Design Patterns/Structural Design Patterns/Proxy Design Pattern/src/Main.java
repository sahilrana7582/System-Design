import Banking.AuthenticateProxy;
import Banking.PerformanceMoinitoring;
import Banking.RealClient;
import Book_Parser_Example.BookParseProxey;
import Book_Parser_Example.BookParser;
import File_Example.ImageProxy;
import File_Example.RealImage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        RealImage realImage = new RealImage("image.jpg");
//        realImage.display();
//
//        ImageProxy imageProxy = new ImageProxy("image.jpg");
//        imageProxy.display();
//
//
//        System.out.println("==========================");
//        System.out.println("Advance Proxy Example");
//        System.out.println("==========================");
//        RealClient realClient = new RealClient();
//        AuthenticateProxy authenticateProxy = new AuthenticateProxy("admin", realClient);
//        PerformanceMoinitoring performanceMoinitoring = new PerformanceMoinitoring(authenticateProxy);
//
//
//        realClient.addBalance(1000);
//        performanceMoinitoring.checkBalance();
//        performanceMoinitoring.deposit(100);
//        performanceMoinitoring.checkBalance();
//        performanceMoinitoring.withdraw(400);
//        performanceMoinitoring.checkBalance();
//        performanceMoinitoring.applyForLoan(500);
//        performanceMoinitoring.checkBalance();
//        performanceMoinitoring.checkCreditScore();
//
//


        System.out.println("==========================");
        System.out.println("Proxy Example");
        System.out.println("==========================");
//        BookParser bookParser = new BookParser("Book 1", "Author 1", 100, 10);
////        BookParser bookParser1 = new BookParser("Book 2", "Author 2", 200, 20);
//        bookParser.getBookName();
//        bookParser.getAuthor();
//        bookParser.getNumberOfPages();
//        bookParser.getNumberOfChapters();

        BookParseProxey bookParseProxey = new BookParseProxey();
        System.out.println("I Don't Need a Book Yet!");
        Thread.sleep(2000);
        System.out.println("I Don't Need a Book Yet!");
        Thread.sleep(2000);
        System.out.println("I Don't Need a Book Yet!");
        Thread.sleep(2000);
        System.out.println("I Need a Book!");
        bookParseProxey.getBookName();
        bookParseProxey.getAuthor();
        bookParseProxey.getNumberOfPages();
        bookParseProxey.getNumberOfChapters();

        System.out.println("I Again Need a Book!");
        Thread.sleep(2000);
        bookParseProxey.getBookName();
        bookParseProxey.getAuthor();
        bookParseProxey.getNumberOfPages();
        bookParseProxey.getNumberOfChapters();
        System.out.println("I Again Need a Book!");
        Thread.sleep(2000);
        bookParseProxey.getBookName();
        bookParseProxey.getAuthor();
        bookParseProxey.getNumberOfPages();
        bookParseProxey.getNumberOfChapters();
        System.out.println("I Again Need a Book!");
        Thread.sleep(2000);
        bookParseProxey.getBookName();
        bookParseProxey.getAuthor();
        bookParseProxey.getNumberOfPages();
        bookParseProxey.getNumberOfChapters();







    }
}