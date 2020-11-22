import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private Deck deck;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public int checkHand(){
        return this.hand.size();
    }

    public void addCard(Card card){
        this.hand.add(card);
        }

    public int handTotal(){
        int total = 0;
        for(Card card : this.hand){
            total += card.getValue();
        }
        return total;
    }
}






