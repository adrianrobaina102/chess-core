package tests;

import org.junit.jupiter.api.Test;
import software.ulpgc.chess.adapters.UciMoveDeserializer;
import software.ulpgc.chess.domain.model.File;
import software.ulpgc.chess.domain.model.Move;
import software.ulpgc.chess.domain.model.Rank;
import software.ulpgc.chess.domain.model.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UciMoveDeserializerTest {

    @Test
    public void should_deserialize_center_move() {
        UciMoveDeserializer deserializer = new UciMoveDeserializer();
        Move move = deserializer.deserialize("e2e4");

        assertEquals(new Square(File.E, Rank.R2), move.from());
        assertEquals(new Square(File.E, Rank.R4), move.to());
    }

    @Test
    public void should_deserialize_boundary_move() {
        UciMoveDeserializer deserializer = new UciMoveDeserializer();
        Move move = deserializer.deserialize("a1h8");

        assertEquals(new Square(File.A, Rank.R1), move.from());
        assertEquals(new Square(File.H, Rank.R8), move.to());
    }
}