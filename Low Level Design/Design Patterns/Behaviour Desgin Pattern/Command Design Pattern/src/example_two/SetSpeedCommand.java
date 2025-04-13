package example_two;

public class SetSpeedCommand implements ICommand {
    private Fan fan;

    public SetSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.setSpeed(3);
    }
}
