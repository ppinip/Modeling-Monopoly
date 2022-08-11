import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCount;
    private List<Player> players;
    private List<Die> diceList;
    private Board board;

    public MGame()
    {
        this.diceList = new ArrayList<Die>();
        this.players = new ArrayList<Player>();
        this.board = new Board();
        this.roundCount = 0;
    }
    public void playGame(int N)
    {
        for (;roundCount < N; roundCount++){
            playRound();
        }
    }

    private void playRound()
    {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
