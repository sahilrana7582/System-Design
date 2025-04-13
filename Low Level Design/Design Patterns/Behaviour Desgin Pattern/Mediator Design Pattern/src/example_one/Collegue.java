package example_one;

public abstract class Collegue{
    protected Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public abstract void receive(String message);
}
