public class Board {
    private final int size;
    private final Piece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public boolean boardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) return false;
            }
        }
        return true;
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size && board[x][y] == null;
    }

    public void setValue(int x, int y, Piece piece) {
        if (isValidMove(x, y)) {
            board[x][y] = piece;
            printBoard();
        }
    }

    public boolean checkWin() {
        boolean result = checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
        if (result) {
            System.out.println("Win detected!");
        }
        return result;
    }

    private boolean checkRowsForWin() {
        for (int row = 0; row < size; row++) {
            Piece firstPiece = board[row][0];
            if (firstPiece == null) continue;

            boolean allSame = true;
            for (int col = 1; col < size; col++) {
                if (board[row][col] == null || !board[row][col].getType().equals(firstPiece.getType())) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Row " + row + " win!");
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int col = 0; col < size; col++) {
            Piece firstPiece = board[0][col];
            if (firstPiece == null) continue;

            boolean allSame = true;
            for (int row = 1; row < size; row++) {
                if (board[row][col] == null || !board[row][col].getType().equals(firstPiece.getType())) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Column " + col + " win!");
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        // Main diagonal (top-left to bottom-right)
        Piece firstPiece = board[0][0];
        if (firstPiece != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (board[i][i] == null || !board[i][i].getType().equals(firstPiece.getType())) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Main diagonal win!");
                return true;
            }
        }

        // Anti-diagonal (top-right to bottom-left)
        firstPiece = board[0][size-1];
        if (firstPiece != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (board[i][size-1-i] == null || !board[i][size-1-i].getType().equals(firstPiece.getType())) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Anti-diagonal win!");
                return true;
            }
        }

        return false;
    }

    public void printBoard() {
        System.out.println("-".repeat(size * 6));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((board[i][j] == null ? "-" : board[i][j].getType()));
                if(j < size - 1) System.out.print("|");
            }
            System.out.println("  ");
        }
        System.out.println();
    }
}