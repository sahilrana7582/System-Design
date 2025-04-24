package Example_3;

public class AuthService {
    private Handler handler;


    public AuthService(){
        UserNameExitHandler userNameExitHandler = new UserNameExitHandler();
        PassHandler passHandler = new PassHandler();
        RoleHandler roleHandler = new RoleHandler();
        userNameExitHandler.setNext(passHandler);
        passHandler.setNext(roleHandler);
        this.handler = userNameExitHandler;
    }

    public void handleRequest(AuthRequest req){
        handler.handleRequest(req);
    }
}
