package Example_3;

public class Main {
    public static void main(String[] args) {
        AuthRequest request = new AuthRequest("sahil", "1234");
        request.setRole("admin");
        AuthRequest request1 = new AuthRequest("shubham", "abcd");
//        request1.setRole("user");// Not Authenticated

        AuthService authService = new AuthService();
        authService.handleRequest(request);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        authService.handleRequest(request1);
    }
}
