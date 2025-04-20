public abstract class Piece {
    private String color;
    private String symbol;

    public Piece(String color, String symbol) {
        this.symbol = symbol;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getSymbol() {
        return symbol;
    }

    // Abstract method for move validation
    public abstract boolean isValidMove(Cell start, Cell end, Board board);
}