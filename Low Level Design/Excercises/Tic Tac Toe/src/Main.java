//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", PieceType.X);
        Player player2 = new Player("Player 2", PieceType.O);

        Game newGame = new Game(player1, player2, 3);
        newGame.play();


    }
}