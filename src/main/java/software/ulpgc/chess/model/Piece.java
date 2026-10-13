package software.ulpgc.chess.model;

import static software.ulpgc.chess.model.Color.Black;
import static software.ulpgc.chess.model.Color.White;

public enum Piece {
    WhitePawn,
    WhiteRook,
    WhiteQueen,
    WhiteKnight,
    WhiteKing,
    WhiteBishop,
    BlackPawn,
    BlackRook,
    BlackQueen,
    BlackKnight,
    BlackBishop,
    BlackKing;

    Color color()
    {
        return isWhite() ? White : Black;
    }
    boolean isPawn()
    {
        return this == WhitePawn || this == BlackPawn;
    }
    boolean isRook()
    {
        return this == WhiteRook || this == BlackRook;
    }
    boolean isQueen()
    {
        return this == WhiteQueen || this == BlackQueen;
    }
    boolean isKnight()
    {
        return this == WhiteKnight || this == BlackKnight;
    }
    boolean isBishop()
    {
        return this == WhiteBishop || this == BlackBishop;
    }
    boolean isKing() {
        return this == WhiteKing || this == BlackKing;
    }
    private boolean isWhite()
    {
        return this == WhitePawn ||
                this == WhiteRook ||
                this == WhiteKnight ||
                this == WhiteQueen ||
                this == WhiteKing ||
                this == WhiteBishop;
    }
}
