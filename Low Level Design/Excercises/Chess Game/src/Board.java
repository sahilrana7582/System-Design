
import java.util.List;

public class Board {

    private User p1;
    private User p2;
    private Cell[][] board;

    public Board(User p1, User p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = new Cell[8][8];
        initBoard();       // <-- Make sure to initialize
        printBoard();      // Print after initializing
    }

    private void initBoard() {
        // Initialize all cells with null pieces
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Cell(i, j, null);
            }
        }

        // Place Player 1 (White) pieces
        List<ChessPiece> whitePieces = p1.getPieces();
        board[7][0].setPiece(whitePieces.get(0), PlayerType.WHITE); // R
        board[7][1].setPiece(whitePieces.get(1), PlayerType.WHITE); // N
        board[7][2].setPiece(whitePieces.get(2), PlayerType.WHITE); // B
        board[7][3].setPiece(whitePieces.get(3), PlayerType.WHITE); // Q
        board[7][4].setPiece(whitePieces.get(4), PlayerType.WHITE); // K
        board[7][5].setPiece(whitePieces.get(5), PlayerType.WHITE); // B
        board[7][6].setPiece(whitePieces.get(6), PlayerType.WHITE); // N
        board[7][7].setPiece(whitePieces.get(7), PlayerType.WHITE); // R
        for (int j = 0; j < 8; j++) {
            board[6][j].setPiece(whitePieces.get(8 + j), PlayerType.WHITE); // Pawns
        }

        // Place Player 2 (Black) pieces
        List<ChessPiece> blackPieces = p2.getPieces();
        board[0][0].setPiece(blackPieces.get(0), PlayerType.BLACK); // R
        board[0][1].setPiece(blackPieces.get(1), PlayerType.BLACK); // N
        board[0][2].setPiece(blackPieces.get(2), PlayerType.BLACK); // B
        board[0][3].setPiece(blackPieces.get(3), PlayerType.BLACK); // Q
        board[0][4].setPiece(blackPieces.get(4), PlayerType.BLACK); // K
        board[0][5].setPiece(blackPieces.get(5), PlayerType.BLACK); // B
        board[0][6].setPiece(blackPieces.get(6), PlayerType.BLACK); // N
        board[0][7].setPiece(blackPieces.get(7), PlayerType.BLACK); // R
        for (int j = 0; j < 8; j++) {
            board[1][j].setPiece(blackPieces.get(8 + j), PlayerType.BLACK); // Pawns
        }
    }

    public void printBoard() {
        System.out.println();
        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println("  +---+---+---+---+---+---+---+---+");

        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " |");
            for (int j = 0; j < 8; j++) {
                Cell c = board[i][j];
                if (c == null || c.isEmpty()) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + c.getPiece().getSymbol() + " |");
                }
            }
            System.out.println(" " + (8 - i));
            System.out.println("  +---+---+---+---+---+---+---+---+");
        }

        System.out.println("    a   b   c   d   e   f   g   h\n");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }


    private boolean isValidMove(int srcX, int srcY, int desX, int desY, User player) {
        Cell src = board[srcX][srcY];
        Cell des = board[desX][desY];

        if(des.isEmpty()) {
            return true;
        }else if(des.getColor() != player.getPlayerType()) {
            return true;
        }
        return false;
    }

    public void move(int srcX, int srcY, int desX, int desY, User player) {
        Cell src = board[srcX][srcY];
        Cell des = board[desX][desY];
        if(des.isEmpty()){
            des.setPiece(src.getPiece(), player.getPlayerType());
            src.setPiece(null, null);
        }
    }
}
