public class King extends Piece {
    public King(String color) {
        super(color, "K");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        // King can move one square in any direction
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        int diffX = Math.abs(endX - startX);
        int diffY = Math.abs(endY - startY);

        return diffX <= 1 && diffY <= 1 && (diffX > 0 || diffY > 0);
    }
}