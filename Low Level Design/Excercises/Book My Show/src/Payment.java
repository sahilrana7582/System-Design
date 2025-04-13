public class Payment {

    public static boolean processPayment(User user, double amount) {
        System.out.println("\nProcessing payment of ₹" + amount + " for user: " + user.getName());
        try {
            Thread.sleep(1500); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("✅ Payment successful!");
        return true;
    }
}
