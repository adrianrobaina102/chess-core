package software.ulpgc.chess.ports;

import software.ulpgc.chess.domain.model.Move;

public interface MoveDeserializer {
    Move deserialize(String serializedMove);
}
