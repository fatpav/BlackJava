import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Player player;

    @Before
    public void before() {
        deck = new Deck();
        player = new Player();
        }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getDeckSize());
        }

    @Test
    public void deckHasCards() {
        Card card1 = new Card(SuitType.HEARTS, CardRank.QUEEN);
        Card card2 = new Card(SuitType.DIAMONDS, CardRank.TEN);
        deck.addCardToDeck(card1);
        deck.addCardToDeck(card2);
        assertEquals(2, deck.getDeckSize());
        }

    @Test
    public void deckCanBeCreated() {
        deck.createDeck();
        assertEquals(52, deck.getDeckSize());
        }

    @Test
    public void canShuffle(){
        deck.createDeck();
        deck.shuffleDeck();
//        System.out.println(deck.getDeck());
    }

//    @Test
//    public void canRemoveCardFromDeck() {
//        deck.createDeck();
//        deck.removeCard(0);
//        assertEquals(51, deck.getDeckSize());
//        }

     @Test
     public void canDealCard() {
         Card card1 = new Card(SuitType.HEARTS, CardRank.QUEEN);
         deck.createDeck();
         deck.shuffleDeck();
         deck.dealCard();
         player.addCard(card1);
         assertEquals(1, player.checkHand());
         assertEquals(51, deck.getDeckSize());
         }
}
