//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User u1 = new User("John", PlayerType.BLACK);
        User u2 = new User("Jane", PlayerType.WHITE);
        Board board = new Board(u1, u2);


    }
}