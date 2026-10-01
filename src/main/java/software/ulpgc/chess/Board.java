package software.ulpgc.chess;
import java.util.Map;
import java.util.Objects;
import static software.ulpgc.chess.Square.*;
import static software.ulpgc.chess.Piece.*;
public class Board {
    private final Map<Square, Piece> pieces;
    public Board(Map<Square, Piece> pieces) {
        this.pieces = Map.copyOf(pieces);
    }
}
