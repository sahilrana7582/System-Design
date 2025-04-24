package Example_3;

import java.util.List;
import java.util.logging.Logger;

public class RoleHandler implements Handler {
    private Handler nextHandler;
    private final Logger LOG = Logger.getLogger(RoleHandler.class.getName());


    @Override
    public void handleRequest(AuthRequest req) {
        if(req.getRole() != null && List.of("admin", "user").contains(req.getRole())){
            LOG.info("Role " + req.getRole() + " is authenticated");
            LOG.info("User " + req.getUsername() + " is authorized");

            if(nextHandler != null){
                nextHandler.handleRequest(req);
            }
        }
        else {
            LOG.info("Role " + req.getRole() + " is not authenticated");
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
}
