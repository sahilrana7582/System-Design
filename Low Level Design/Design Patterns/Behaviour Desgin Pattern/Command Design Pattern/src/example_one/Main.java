package example_one;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LigthReceiver receiver = new LigthReceiver();
        RemoteInvoker invoker = new RemoteInvoker();

        Command turnOnCommand = new Command("Turn on", "Turn on ligth", receiver::on);
        Command turnOffCommand = new Command("Turn off", "Turn off ligth", receiver::off);

        invoker.setCommand(turnOnCommand);
        invoker.executeCommand();
        invoker.setCommand(turnOffCommand);
        invoker.executeCommand();
    }
}