                                                                            /*
 * Piece class to make it OOP. (Nice)
 */
public abstract class Piece {
    
    protected enum pieceType{
        PAWN,
        ROOK,
        KNIGHT,
        BISHOP,
        KING,
        QUEEN
    }
    // All types of pieces
    
    public pieceType pieceType;

    protected boolean isWhite;

    protected int value;

    public String[] possibleMoves;     // tror att denna kan va viktig i framtiden

    void movePiece(){}          // Ingen bra ide här än.
}
