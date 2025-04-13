package example_two;

public class TurnOffFanCommand implements ICommand {
    private Fan fan;

    public TurnOffFanCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOff();
    }
}
