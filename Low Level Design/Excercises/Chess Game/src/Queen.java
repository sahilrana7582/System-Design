public class Queen extends Piece {
    public Queen(String color) {
        super(color, "Q");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        // Queen can move diagonally, horizontally, or vertically any number of squares
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // Check if the move is diagonal, horizontal or vertical
        boolean isDiagonal = Math.abs(endX - startX) == Math.abs(endY - startY);
        boolean isHorizontal = startX == endX;
        boolean isVertical = startY == endY;

        if (!isDiagonal && !isHorizontal && !isVertical) {
            return false;
        }

        // Check if the path is clear
        return isPathClear(start, end, board);
    }

    private boolean isPathClear(Cell start, Cell end, Board board) {
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        // Direction of movement
        int dirX = Integer.compare(endX, startX);
        int dirY = Integer.compare(endY, startY);

        int x = startX + dirX;
        int y = startY + dirY;

        Cell[][] boardGrid = board.getBoard();

        // Check cells along the path
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