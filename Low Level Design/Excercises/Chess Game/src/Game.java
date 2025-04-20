import java.util.Scanner;

public class Game {
    private Board board;
    private Move moveManager;
    private String currentPlayer;

    public Game() {
        board = new Board();
        moveManager = new Move(board);
        currentPlayer = "WHITE"; // White starts
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Chess Game Started!");
        System.out.println("Enter moves in format: 'start-end' (e.g., 'e2-e4')");

        while (gameRunning) {
            board.printBoard();
            System.out.println(currentPlayer + "'s turn. Enter your move:");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) {
                gameRunning = false;
                continue;
            }

            // Parse move input
            String[] positions = input.split("-");
            if (positions.length != 2) {
                System.out.println("Invalid input format. Use: 'start-end' (e.g., 'e2-e4')");
                continue;
            }

            Cell start = board.getCell(positions[0]);
            Cell end = board.getCell(positions[1]);

            if (start == null || end == null) {
                System.out.println("Invalid position(s)");
                continue;
            }

            if (start.isEmpty()) {
                System.out.println("No piece at starting position");
                continue;
            }

            if (!start.getPiece().getColor().equals(currentPlayer)) {
                System.out.println("That's not your piece");
                continue;
            }

            // Try to make the move
            boolean moveMade = moveManager.playMove(start, end);

            if (moveMade) {
                // Switch player for next turn
                currentPlayer = currentPlayer.equals("WHITE") ? "BLACK" : "WHITE";
            }
        }

        scanner.close();
        System.out.println("Game ended.");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}