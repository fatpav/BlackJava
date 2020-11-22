import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    private Deck deck;
    private Player player;
    private Player player2;
    private Card card;
    private Card card2;
    private Card card3;
    private Card card4;
    private Game game;

    @Before
    public void before(){
        game = new Game();
        deck = new Deck();
        player = new Player();
        player2 = new Player();
        card = new Card(SuitType.SPADES, CardRank.ACE);
        card2 = new Card(SuitType.DIAMONDS, CardRank.KING);
        card3 = new Card(SuitType.DIAMONDS, CardRank.FIVE);
        card4 = new Card(SuitType.CLUBS, CardRank.SEVEN);
    }

    @Test
    public void gameCanAddPlayer(){
        game.addPlayer(player);
        game.addPlayer(player2);
        assertEquals(2, game.checkPlayers());
    }

    @Test
//    public void playersCanDrawGame(){
//        game.addPlayer(player);
//        game.addPlayer(player2);
//        player.addCard(card);
//        player.addCard(card2);
//        player2.addCard(card);
//        player2.addCard(card2);
////        game.compareScore(player, player2)
//        assert(game.checkWinner());
//    }

    @Test
    public void playerCanWin(){
        game.addPlayer(player);
        game.addPlayer(player2);
        player.addCard(card);
        player.addCard(card2);
        player2.addCard(card3);
        player2.addCard(card4);
        game.checkWinner();
        assertEquals("Player1 Wins!", game.checkWinner());
    }
}
