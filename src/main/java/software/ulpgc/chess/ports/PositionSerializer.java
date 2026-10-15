package software.ulpgc.chess.ports;
import software.ulpgc.chess.domain.model.Square;

public interface PositionSerializer {
    String serialize(Square square);
}
