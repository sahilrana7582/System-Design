package Example_3;

public interface Handler {

    public void handleRequest(AuthRequest req);
    public void setNext(Handler handler);

}
