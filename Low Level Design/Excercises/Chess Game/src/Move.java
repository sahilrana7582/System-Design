public class Move {
    private Board board;

    public Move(Board board) {
        this.board = board;
    }

    public boolean playMove(Cell start, Cell end) {
        if (start == null || end == null || start.isEmpty()) {
            System.out.println("Invalid move: No piece at start position");
            return false;
        }

        Piece piece = start.getPiece();
        String pieceColor = piece.getColor();

        // Check if the destination is valid
        if (!isValidMove(end, pieceColor)) {
            return false;
        }

        // Check if the move is valid for this piece
        if (!piece.isValidMove(start, end, board)) {
            System.out.println("Invalid move for " + piece.getSymbol());
            return false;
        }

        // Execute the move
        int srcX = start.getX();
        int srcY = start.getY();
        int destX = end.getX();
        int destY = end.getY();

        // Capture logic is already handled in isValidMove
        end.setPiece(piece);
        start.setPiece(null);

        System.out.println("Move completed: " + pieceColor + " " + piece.getSymbol() +
                " from (" + srcX + "," + srcY + ") to (" + destX + "," + destY + ")");

        return true;
    }

    public boolean isValidMove(Cell end, String color) {
        Piece piece = end.getPiece();

        if (piece != null) {
            if (piece.getColor().equals(color)) {
                System.out.println("Invalid Move! You have your own piece there.");
                return false;
            } else {
                System.out.println("Capturing opponent's piece!");
                return true;
            }
        }

        return true;
    }
}