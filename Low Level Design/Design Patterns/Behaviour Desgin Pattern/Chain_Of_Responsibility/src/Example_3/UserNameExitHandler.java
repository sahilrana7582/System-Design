package Example_3;

import java.util.List;
import java.util.logging.Logger;

public class UserNameExitHandler implements Handler {
    private Handler nextHandler;
    private final Logger LOG = Logger.getLogger(UserNameExitHandler.class.getName());

    public void handleRequest(AuthRequest req) {
        if(List.of("sahil", "shubham", "raja", "king").contains(req.getUsername())){
            LOG.info("User " + req.getUsername() + " is Correct Username");
            nextHandler.handleRequest(req);
        }else{
            LOG.info("User " + req.getUsername() + " is not authenticated");
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

}
