package example_two;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan("Fan1");
        FanRemoteInvoker invoker = new FanRemoteInvoker();
        invoker.setCommand("turnOn", new TurnOnFanCommand(fan));
        invoker.setCommand("turnOff", new TurnOffFanCommand(fan));
        invoker.setCommand("setSpeed", new SetSpeedCommand(fan));
        invoker.executeCommand("turnOn");
        invoker.executeCommand("setSpeed");
        invoker.executeCommand("turnOff");

    }
}
