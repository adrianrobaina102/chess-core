package software.ulpgc.chess;

import software.ulpgc.chess.adapters.FenBoardDeserializer;
import software.ulpgc.chess.adapters.FenBoardSerializer;
import software.ulpgc.chess.adapters.FenStateDeserializer;
import software.ulpgc.chess.domain.model.Board;
import software.ulpgc.chess.domain.model.Piece;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.domain.model.State;
import software.ulpgc.chess.ports.BoardDeserializer;
import software.ulpgc.chess.ports.BoardSerializer;
import software.ulpgc.chess.ports.StateDeserializer;

import java.util.HashMap;
import java.util.Map;

// == compara direccion .equals Compara el objeto
public class Main {
    static void main(String[] args)
    {
        BoardDeserializer boarDeserializer = new FenBoardDeserializer();
        StateDeserializer stateDeserializer = new FenStateDeserializer();
        String fenString = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
        Board board = boarDeserializer.deserialize(fenString);
        State state =  stateDeserializer.deserialize(fenString);
        System.out.println(board);
        System.out.println(state.toString());
        Board boardInitial = Board.initial();
        BoardSerializer serializer = new FenBoardSerializer();
        System.out.println(serializer.serialize(boardInitial));
    }
}
