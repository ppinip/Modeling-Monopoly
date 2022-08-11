import java.util.List;

public class Player {

    private String name;
    private List<Die> diceList;
    private Board board;
    private Piece piece;

    public Player(String name, Board board)
    {
        this.name = name;
        this.board = board;
    }
    public void takeTurn()
    {
        int fvTotal = 0;
        for (Die dice: diceList) {
            dice.roll();
            fvTotal += dice.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquares(oldLoc, fvTotal);
        piece.setLocation(newLoc);
    }

}
