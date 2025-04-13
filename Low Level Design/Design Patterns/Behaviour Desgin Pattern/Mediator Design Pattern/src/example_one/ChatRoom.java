package example_one;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator{
    private String name;
    private List<Collegue> collegues;

    public ChatRoom(String name) {
        this.name = name;
        this.collegues = new ArrayList<>();
    }

    public void addNewCollegue(Collegue collegue) {
        collegues.add(collegue);
    }

    public void removeCollegue(Collegue collegue) {
        collegues.remove(collegue);
    }

    @Override
    public void sendMessage(String message, Collegue collegue) {
        for (Collegue collegue1 : collegues) {
            if (collegue1 != collegue) {
                collegue1.receive(message);
            }
        }
    }
}
