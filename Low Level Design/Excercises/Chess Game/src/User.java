import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private PlayerType playerType;
    private List<ChessPiece> pieces = new ArrayList<>(
            List.of(
                    new Haathi(),
                    new Horse(),
                    new Bishop(),
                    new Queen(),
                    new King(),
                    new Bishop(),
                    new Horse(),
                    new Haathi(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn(),
                    new Pawn()
            )
    );

    public User(String name, PlayerType playerType) {
        this.name = name;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public List<ChessPiece> getPieces() {
        return pieces;
    }

}
