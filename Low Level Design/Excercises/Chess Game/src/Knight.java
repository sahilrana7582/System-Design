public class Knight extends Piece {
    public Knight(String color) {
        super(color, "N");
    }

    @Override
    public boolean isValidMove(Cell start, Cell end, Board board) {
        // Knight moves in L-shape: 2 squares in one direction and 1 square perpendicular
        int startX = start.getX();
        int startY = start.getY();
        int endX = end.getX();
        int endY = end.getY();

        int diffX = Math.abs(endX - startX);
        int diffY = Math.abs(endY - startY);

        return (diffX == 2 && diffY == 1) || (diffX == 1 && diffY == 2);
    }
}