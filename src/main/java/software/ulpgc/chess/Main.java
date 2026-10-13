package software.ulpgc.chess;

import software.ulpgc.chess.adapters.FenBoardDeserializer;
import software.ulpgc.chess.domain.model.Board;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.ports.BoardDeserializer;

// == compara direccion .equals Compara el objeto
public class Main {
    static void main(String[] args)
    {
        BoardDeserializer deserializer = new FenBoardDeserializer();
        String fenString = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
        Board board = deserializer.deserialize(fenString);
        System.out.println(board);
    }
}
