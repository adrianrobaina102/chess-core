package software.ulpgc.chess;

import software.ulpgc.chess.adapters.FenBoardDeserializer;
import software.ulpgc.chess.adapters.FentStateDeserializer;
import software.ulpgc.chess.domain.model.Board;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.domain.model.State;
import software.ulpgc.chess.ports.BoardDeserializer;
import software.ulpgc.chess.ports.StateDeserializer;

// == compara direccion .equals Compara el objeto
public class Main {
    static void main(String[] args)
    {
        BoardDeserializer boarDeserializer = new FenBoardDeserializer();
        StateDeserializer stateDeserializer = new FentStateDeserializer();
        String fenString = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
        Board board = boarDeserializer.deserialize(fenString);
        State state =  stateDeserializer.deserialize(fenString);
        System.out.println(board);
        System.out.println(state.toString());
    }
}
