package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.State;
import software.ulpgc.chess.ports.StateDeserializer;

import java.util.Arrays;

public class FentStateDeserializer implements StateDeserializer {

    @Override
    public State deserialize(String value) {
        return deserialize(getFenPart(value));
    }
    private State deserialize(String[] values) {  return new State(Arrays.copyOfRange(values, 1, values.length));}
    private String[] getFenPart(String fen){
        return fen.split(" ");
    }
}
