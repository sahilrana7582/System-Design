package example_one;

public class Command implements ICommand {
    private String name;
    private String description;
    private Runnable receiver;

    public Command(String name, String description, Runnable receiver) {
        this.name = name;
        this.description = description;
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.run();
    }

}
