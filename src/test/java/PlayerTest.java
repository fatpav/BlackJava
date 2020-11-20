import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.SPADES, CardRank.KING);
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
}
