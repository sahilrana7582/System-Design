public class Rock extends Piece {
    public Rock(String color) {
        super(color, "R");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        // Rook can move horizontally or vertically any number of squares
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // Check if the move is horizontal or vertical
        boolean isHorizontal = startX == endX;
        boolean isVertical = startY == endY;

        if (!isHorizontal && !isVertical) {
            return false;
        }

        // Check if the path is clear
        int dirX = Integer.compare(endX, startX);
        int dirY = Integer.compare(endY, startY);

        int x = startX + dirX;
        int y = startY + dirY;

        Cell[][] boardGrid = board.getBoard();

        while (x != endX || y != endY) {
            if (!boardGrid[x][y].isEmpty()) {
                return false; // Path is blocked
            }
            x += dirX;
            y += dirY;
        }

        return true; // Path is clear
    }
}