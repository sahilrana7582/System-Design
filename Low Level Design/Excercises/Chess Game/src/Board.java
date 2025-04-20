public class Board {
    private Cell[][] board;

    public Board() {
        this.board = new Cell[8][8];
        initBoard();
        printBoard();
    }

    private void initBoard() {
        // Initialize all cells with null pieces
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Cell(null, i, j);
            }
        }

        board[7][0].setPiece(new Rock("WHITE")); // R
        board[7][1].setPiece(new Knight("WHITE")); // N
        board[7][2].setPiece(new Bishop("WHITE")); // B
        board[7][3].setPiece(new Queen("WHITE")); // Q
        board[7][4].setPiece(new King("WHITE")); // K
        board[7][5].setPiece(new Bishop("WHITE")); // B
        board[7][6].setPiece(new Knight("WHITE")); // N
        board[7][7].setPiece(new Rock("WHITE")); // R
        for (int j = 0; j < 8; j++) {
            board[6][j].setPiece(new Pawn("WHITE")); // Pawns
        }

        // Place Player 2 (Black) pieces
        board[0][0].setPiece(new Rock("BLACK")); // R
        board[0][1].setPiece(new Knight("BLACK")); // N
        board[0][2].setPiece(new Bishop("BLACK")); // B
        board[0][3].setPiece(new Queen("BLACK")); // Q
        board[0][4].setPiece(new King("BLACK")); // K
        board[0][5].setPiece(new Bishop("BLACK")); // B
        board[0][6].setPiece(new Knight("BLACK")); // N
        board[0][7].setPiece(new Rock("BLACK")); // R
        for (int j = 0; j < 8; j++) {
            board[1][j].setPiece(new Pawn("BLACK")); // Pawns
        }
    }

    public void printBoard() {
        System.out.println();
        System.out.println("      *   W   H   I   T   E   *    ");
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

        System.out.println("    a   b   c   d   e   f   g   h    ");
        System.out.println("      *   B   L   A   C   K   *    \n");
    }

    public Cell[][] getBoard() {
        return board;
    }

    // Get cell by algebraic notation (e.g., "e4")
    public Cell getCell(String position) {
        if (position == null || position.length() != 2) {
            return null;
        }

        char file = position.charAt(0);
        char rank = position.charAt(1);

        if (file < 'a' || file > 'h' || rank < '1' || rank > '8') {
            return null;
        }

        int y = file - 'a';
        int x = 8 - (rank - '0');

        return board[x][y];
    }
}