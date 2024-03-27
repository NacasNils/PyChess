/*
 * Piece class to make it OOP. (Nice)
 */

public abstract class Piece {
    // All types of pieces
    enum pieceType{
        PAWN,
        ROOK,
        KNIGHT,
        BISHOP,
        KING,
        QUEEN
    }
    
    public pieceType pieceType;

    public String[] possibleMoves;     // tror att denna kan va viktig i framtiden

    void movePiece(){}          // Ingen bra ide här än.
}
