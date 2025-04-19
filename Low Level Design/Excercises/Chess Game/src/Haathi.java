public class Haathi implements ChessPiece{
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Elephant from (" + x + ", " + y + ") to (" + (x + 1) + ", " + (y + 1) + ")");
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
