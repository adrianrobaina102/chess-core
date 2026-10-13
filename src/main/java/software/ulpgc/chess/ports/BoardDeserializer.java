package software.ulpgc.chess.ports;

import software.ulpgc.chess.model.Board;

public interface BoardDeserializer {
    Board deserialize(String value);
}
