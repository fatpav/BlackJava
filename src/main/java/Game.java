import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    private Deck deck;
    private Player player;

    public Game(){
        this.deck = deck;
        this.players = new ArrayList<Player>();
        this.player = player;

    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int checkPlayers(){
        return this.players.size();
    }

    public String checkWinner() {
        String player1WinMessage = "Player 1 Wins!";
        String player2WinMessage = "Player 2 Wins!";
        String drawMessage = "Draw! No winners here.";
        int handTotal = this.players.get(0).handTotal();
        for (Player player : this.players) {
            if (player.handTotal() > handTotal) {
                return player1WinMessage;
            }
            if (player.handTotal() < handTotal) {
                return player2WinMessage;
            }
//
        }return drawMessage;
    }
}
