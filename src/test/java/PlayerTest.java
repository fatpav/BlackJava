import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;
    Card card2;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.SPADES, CardRank.KING);
        card2 = new Card(SuitType.HEARTS, CardRank.EIGHT);
    }

    @Test
    public void playerHasNoCards(){
        assertEquals(0, player.checkHand());
    }

    @Test
    public void addCardToPlayer() {
        player.addCard(card);
        assertEquals(1, player.checkHand());
        }

    @Test
    public void playerHandHasValue(){
        player.addCard(card);
        player.addCard(card2);
        assertEquals(18, player.handTotal());
    }
}
