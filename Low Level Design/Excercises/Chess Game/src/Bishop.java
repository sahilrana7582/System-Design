public class Bishop extends Piece {
    public Bishop(String color) {
        super(color, "B");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        // Bishop can move diagonally any number of squares
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // Check if the move is diagonal
        if (Math.abs(endX - startX) != Math.abs(endY - startY)) {
            return false;
        }

        // Check if the path is clear
        int dirX = Integer.compare(endX, startX);
        int dirY = Integer.compare(endY, startY);

        int x = startX + dirX;
        int y = startY + dirY;

        Cell[][] boardGrid = board.getBoard();

        while (x != endX) {
            if (!boardGrid[x][y].isEmpty()) {
                return false; // Path is blocked
            }
            x += dirX;
            y += dirY;
        }

        return true; // Path is clear
    }
}