package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.*;
import software.ulpgc.chess.ports.BoardDeserializer;

import java.util.HashMap;
import java.util.Map;

public class FenBoardDeserializer implements BoardDeserializer {
    @Override
    public Board deserialize(String fen) {
        return deserialize(getValue(fen, 0).split("/"));
    }
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
        Map<Square, Piece> map = new HashMap<>();
        for (char order : rank) {
            if(Character.isLetter(order))
            {
                Square square = Square.of(i, j);
                map.put(square, Piece.getPiece(order));
                i++;
            }
            else
            {
                i += Character.getNumericValue(order);
            }

        }
        return map;
    }
    private String getValue(String fen, int index){
        return fen.split(" ")[index];
    }
}
