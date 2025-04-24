package Example_3;

import java.util.List;
import java.util.logging.Logger;

public class PassHandler implements Handler {
    private Handler nextHandler;
    private final Logger LOG = Logger.getLogger(PassHandler.class.getName());

    @Override
    public void handleRequest(AuthRequest req) {
        if(List.of("1234", "abcd", "xyz").contains(req.getPassword())){
            LOG.info("Password " + req.getPassword() + " is authenticated");
            nextHandler.handleRequest(req);
        }else {
            LOG.info("Password " + req.getPassword() + " is not authenticated");
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
}
