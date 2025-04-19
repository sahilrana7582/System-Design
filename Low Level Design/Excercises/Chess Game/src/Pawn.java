public class Pawn implements ChessPiece {
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a King from (" + x + ", " + y + ") to (" + (x + 1) + ", " + (y + 1) + ")");
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
