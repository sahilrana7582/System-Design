import java.util.Scanner;

public class Game {

    private Player lastPlayer;
    private Player currentPlayer;
    private final Board board;
    private final Scanner sc;

    public Game(Player player1, Player player2, int size) {
        lastPlayer = player1;
        currentPlayer = player2;
        sc = new Scanner(System.in);
        board = new Board(size);
    }

    public void play() {
        System.out.println("Game Start");
        board.printBoard();
        while (!board.boardFull()) {
            turn();
            if (board.checkWin()) {
                System.out.println(currentPlayer.getName() + " wins!");
                return;
            }
        }
        System.out.println("It's a Draw!");
    }

    private void turn() {
        int x = -1, y = -1;
        boolean validMove = false;

        while (!validMove) {
            System.out.println(currentPlayer.getName() + " turn");
            System.out.print("Enter X: ");

            if (sc.hasNextInt()) {
                x = sc.nextInt();
            } else {
                sc.next(); // Clear invalid input
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            System.out.print("Enter Y: ");
            if (sc.hasNextInt()) {
                y = sc.nextInt();
            } else {
                sc.next();
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            if (board.isValidMove(x, y)) {
                board.setValue(x, y, new Piece(currentPlayer.getPieceType()));
                validMove = true;
            } else {
                System.out.println("Invalid move, try again!");
            }
        }
        switchPlayer();
    }


    private void switchPlayer() {
        Player temp = lastPlayer;
        lastPlayer = currentPlayer;
        currentPlayer = temp;
    }
}
