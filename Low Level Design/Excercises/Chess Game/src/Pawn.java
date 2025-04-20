public class Pawn extends Piece {
    private boolean hasMoved = false;

    public Pawn(String color) {
        super(color, "P");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // Direction depends on color
        int direction = getColor().equals("WHITE") ? -1 : 1;

        // Regular move - one square forward
        if (startY == endY && endX == startX + direction && end.isEmpty()) {
            hasMoved = true;
            return true;
        }

        // First move - can move two squares forward
        if (!hasMoved && startY == endY && endX == startX + 2 * direction &&
                end.isEmpty() && board.getBoard()[startX + direction][startY].isEmpty()) {
            hasMoved = true;
            return true;
        }

        // Capture - diagonally one square forward
        if (Math.abs(endY - startY) == 1 && endX == startX + direction && !end.isEmpty() &&
                !end.getPiece().getColor().equals(getColor())) {
            hasMoved = true;
            return true;
        }

        return false;
    }
}
