package example_two;

import java.util.HashMap;
import java.util.Map;

public class FanRemoteInvoker {

    private Map<String, ICommand> commands = new HashMap<>();

    public void setCommand(String key, ICommand command) {
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        commands.get(key).execute();
    }
}
