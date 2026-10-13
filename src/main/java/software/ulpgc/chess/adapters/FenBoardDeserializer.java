package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.Board;
import software.ulpgc.chess.domain.model.Piece;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.ports.BoardDeserializer;

import java.util.HashMap;
import java.util.Map;

public class FenBoardDeserializer implements BoardDeserializer {
    @Override
    public Board deserialize(String value) {return deserialize(value.split("/"));}
    private Board deserialize(String[] values) { return new Board(piecesIn(values)); }

    private Map<Square, Piece> piecesIn(String[] values) {
        Map<Square, Piece> map = new HashMap<>();
        int j = 8;
        for (String value : values)
            map.putAll(piecesIn(j--, value.toCharArray()));
        return map;
    }

    private Map<Square, Piece> piecesIn(int j, char[] rank) {
        int i = 1;
        for (char order : rank) {
            Square square = Square.of(i, j);
        }
        return Map.of();
    }
}
