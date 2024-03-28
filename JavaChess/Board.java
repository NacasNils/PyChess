import java.lang.StringBuilder;

public class Board {
    // SKA AV NÄSTA STATION MEN FORTSÄTTER SENARE! mvh Nils 17:49 27/ Mar/ 2024 
    // är tbx nu ! mvh Nils 18:48 27/ Mar/ 2024

    // för singleton pattern
    private static Board board_instance = null;

    //matris som 8x8 som ska användas som spelbräda
    public Square[][] board;

    //Konstruktorn är private pga singleton pattern
    private Board(){
        this.board = createBoard();
    }

    // för singleton pattern. Vi måste kalla getInstance istället för att kalla konstruktorn
    public static synchronized Board getInstance(){
        if (board_instance == null){
            board_instance = new Board();
        }
        return board_instance;

    }
    // Skapar Boarden
    Square[][] createBoard(){
        StringBuilder sb = new StringBuilder(); // Squarenamn är Strings som vi måste bygga ihop
        Square[][] tempBoard = new Square[8][8];
        String bLetters = "ABCDEFGH";

        for (int i = 7; i >= 0; i--) {              // yttre loop för siffran (inverterad pga hur schackbrädan ser ut)

            for (int j = 0; j < 8; j++) {           // inre loop för bokstaven

                sb.append(bLetters.charAt(j));      // bokstaven på rätt plats
                sb.append(i+1);                       // siffran på rätt plats

                

                String squareName = sb.toString();  // gör det till en String

                System.out.println(squareName);     // endast för debugging syfte när man runnar main filen

                tempBoard[i][j] = new Square(squareName, null);     //Vi måste fixa detta sen så piece inte är null 
                
                sb.setLength(0); // Cleara stringbuildern inför nästa iteration
                
            }
        }
        return tempBoard;
    }

    

}
