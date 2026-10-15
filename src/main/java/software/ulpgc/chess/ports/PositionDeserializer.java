package software.ulpgc.chess.ports;

import software.ulpgc.chess.domain.model.Square;

public interface PositionDeserializer {
    Square deserialize(String notation);
}
