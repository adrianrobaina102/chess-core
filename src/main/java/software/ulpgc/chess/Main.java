package software.ulpgc.chess;
import static software.ulpgc.chess.File.*;
import static software.ulpgc.chess.Rank.*;
// == compara direccion .equals Compara el objeto
public class Main {
    static void main(String[] args)
    {
        Board board = Board.initial();

        System.out.println("--- PRUEBA DE CASILLAS ---");
        System.out.println("a1 (Torre Blanca): " + board.pieceAt("a1"));
        System.out.println("e1 (Rey Blanco): " + board.pieceAt("e1"));
        System.out.println("a8 (Torre Negra): " + board.pieceAt("a8"));
        System.out.println("e8 (Rey Negro): " + board.pieceAt("e8"));
        System.out.println("e4 (Vacía, debe ser null): " + board.pieceAt("e4"));

        System.out.println("\n--- TOTAL DE PIEZAS ---");
        System.out.println("Piezas en el tablero (deben ser 32): " + board.pieces().size());

        System.out.println("\n--- ESTADO DEL TABLERO ---");
        System.out.println(board);
    }
}
