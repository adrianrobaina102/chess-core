package tests;

import org.junit.jupiter.api.Test;
import software.ulpgc.chess.adapters.AlgebraicPositionDeserializer;
import software.ulpgc.chess.domain.model.File;
import software.ulpgc.chess.domain.model.Rank;
import software.ulpgc.chess.domain.model.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebraicPositionDeserializerTest {
    @Test
    public void should_deserialize_lower_bound_position() {
        AlgebraicPositionDeserializer deserializer = new AlgebraicPositionDeserializer();
        Square square = deserializer.deserialize("a1");
        assertEquals(File.A, square.file());
        assertEquals(Rank.R1, square.rank());
    }

    @Test
    public void should_deserialize_upper_bound_position() {
        AlgebraicPositionDeserializer deserializer = new AlgebraicPositionDeserializer();
        Square square = deserializer.deserialize("h8");
        assertEquals(File.H, square.file());
        assertEquals(Rank.R8, square.rank());
    }

    @Test
    public void should_deserialize_center_position() {
        AlgebraicPositionDeserializer deserializer = new AlgebraicPositionDeserializer();
        Square square = deserializer.deserialize("e4");
        assertEquals(File.E, square.file());
        assertEquals(Rank.R4, square.rank());
    }
}
