public class Cell {

    private int row;
    private int col;
    private ChessPiece piece;
    private PlayerType player;

    public Cell(int row, int col, ChessPiece piece) {
        this.piece = piece;
        this.row = row;
        this.col = col;
    }


    public void setPiece(ChessPiece piece, PlayerType player) {
        this.piece = piece;
        this.player = player;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public PlayerType getColor() {
        return  PlayerType.BLACK;
    }
}
