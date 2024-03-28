public class Pawn extends Piece{
    // Det ända jag tror vi begöver i subklasserna är dess egna movemetoder!

    public Pawn(boolean isWhite){
        this.isWhite = isWhite;
        this.value = 1;
        this.pieceType = pieceType.PAWN;    
    }

    void movePiece(Board b, Square sq) {

    }
}