package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.ports.PositionSerializer;

public class AlgebraicPositionSerializer implements PositionSerializer {

    @Override
    public String serialize(Square square) {
        return square.file().name().toLowerCase() + square.rank().symbol();
    }
}
