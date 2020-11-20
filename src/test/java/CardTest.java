import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.HEARTS, CardRank.SIX);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(SuitType.HEARTS, playingCard.getSuit());
    }

    @Test
    public void cardHasValue() {
        assertEquals(6, playingCard.getRankValue());
        }

    @Test
    public void cardHasRank() {
        assertEquals(CardRank.SIX, playingCard.getRank());
        }
}
