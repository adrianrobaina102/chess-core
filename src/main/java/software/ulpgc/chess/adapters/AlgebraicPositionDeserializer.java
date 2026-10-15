package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.File;
import software.ulpgc.chess.domain.model.Rank;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.ports.PositionDeserializer;


public class AlgebraicPositionDeserializer implements PositionDeserializer {
    @Override
    public Square deserialize(String notation) {
        return new Square(File.getFile(notation.charAt(0)), Rank.getRank(Character.getNumericValue(notation.charAt(1))));
    }
}
