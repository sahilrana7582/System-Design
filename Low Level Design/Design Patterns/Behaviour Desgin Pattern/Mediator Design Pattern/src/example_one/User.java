package example_one;

public class User extends Collegue{
    private String name;
    private String email;
    private String phone;
    private Mediator mediator;

    public User(Mediator mediator, String name, String email, String phone) {
        super(mediator);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}
