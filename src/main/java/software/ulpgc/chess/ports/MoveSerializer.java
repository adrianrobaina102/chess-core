package software.ulpgc.chess.ports;

import software.ulpgc.chess.domain.model.Move;

public interface MoveSerializer {
    String serialize(Move move);
}
