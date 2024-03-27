/*
* Basic Square class, Used to make our board
 */

public class Square {

        // Init Variables piece and what square it is 
    public final String sqName;    // Once square has gotten a designated name it is locked to that name. eg. A1 E7.
    public Piece piece;

    Square(String sqName, Piece piece){
        this.sqName = sqName;
        this.piece = piece;
    }

}
