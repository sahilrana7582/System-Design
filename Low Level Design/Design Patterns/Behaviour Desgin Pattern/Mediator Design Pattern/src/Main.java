import example_one.ChatRoom;
import example_one.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom1 = new ChatRoom("Room 1");
        User user1 = new User(chatRoom1, "User 1", "user1", "1234567890");
        User user2 = new User(chatRoom1, "User 2", "user2", "1234567890");
        User user3 = new User(chatRoom1, "User 3", "user3", "1234567890");
        User user4 = new User(chatRoom1, "User 4", "user4", "1234567890");
        User user5 = new User(chatRoom1, "User 5", "user5", "1234567890");
        User user6 = new User(chatRoom1, "User 6", "user6", "1234567890");
        User user7 = new User(chatRoom1, "User 7", "user7", "1234567890");
        User user8 = new User(chatRoom1, "User 8", "user8", "1234567890");
        User user9 = new User(chatRoom1, "User 9", "user9", "1234567890");
        User user10 = new User(chatRoom1, "User 10", "user10", "1234567890");
        User user11 = new User(chatRoom1, "User 11", "user11", "1234567890");
        User user12 = new User(chatRoom1, "User 12", "user12", "1234567890");
        User user13 = new User(chatRoom1, "User 13", "user13", "1234567890");
        User user14 = new User(chatRoom1, "User 14", "user14", "1234567890");
        User user15 = new User(chatRoom1, "User 15", "user15", "1234567890");
        User user16 = new User(chatRoom1, "User 16", "user16", "1234567890");
        User user17 = new User(chatRoom1, "User 17", "user17", "1234567890");
        User user18 = new User(chatRoom1, "User 18", "user18", "1234567890");
        User user19 = new User(chatRoom1, "User 19", "user19", "1234567890");
        User user20 = new User(chatRoom1, "User 20", "user20", "1234567890");

        chatRoom1.addNewCollegue(user1);
        chatRoom1.addNewCollegue(user2);
        chatRoom1.addNewCollegue(user3);
        chatRoom1.addNewCollegue(user4);
        chatRoom1.addNewCollegue(user5);
        chatRoom1.addNewCollegue(user6);
        chatRoom1.addNewCollegue(user7);
        chatRoom1.addNewCollegue(user8);
        chatRoom1.addNewCollegue(user9);
        chatRoom1.addNewCollegue(user10);
        chatRoom1.addNewCollegue(user11);
        chatRoom1.addNewCollegue(user12);
        chatRoom1.addNewCollegue(user13);
        chatRoom1.addNewCollegue(user14);
        chatRoom1.addNewCollegue(user15);
        chatRoom1.addNewCollegue(user16);
        chatRoom1.addNewCollegue(user17);
        chatRoom1.addNewCollegue(user18);
        chatRoom1.addNewCollegue(user19);
        chatRoom1.addNewCollegue(user20);

        user1.send("Hello");
    }
}