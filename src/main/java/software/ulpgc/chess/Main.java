package software.ulpgc.chess;
import static software.ulpgc.chess.File.*;
import static software.ulpgc.chess.Rank.*;
// == compara direccion .equals Compara el objeto
public class Main {
    static void main(String[] args)
    {
        Board board = Board.initial();

        Board turno1 = board.move(Square.at("e2"), Square.at("e4"));
        System.out.println("--- PRUEBA DE INMUTABILIDAD Y MOVIMIENTO ---");

        System.out.println("TABLERO ORIGINAL (Turno 0):");
        System.out.println("  Pieza en e2 (Debería seguir el WhitePawn): " + board.pieceAt("e2"));
        System.out.println("  Pieza en e4 (Debería seguir null): " + board.pieceAt("e4"));

        System.out.println("\nNUEVO TABLERO (Turno 1):");
        System.out.println("  Pieza en e2 (Debería ser null, ya no está): " + turno1.pieceAt("e2"));
        System.out.println("  Pieza en e4 (¡Aquí está el WhitePawn!): " + turno1.pieceAt("e4"));

        System.out.println("\n--- COMPROBACIÓN DE INTEGRIDAD ---");
        System.out.println("Total de piezas en el Turno 1 (Deben ser 32): " + turno1.pieces().size());
    }
}
