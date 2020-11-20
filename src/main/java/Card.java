public class Card {

    private SuitType suit;
    private CardRank rank;

    public Card(SuitType suit, CardRank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public CardRank getRank() {
        return this.rank;
    }

    public int getRankValue() {
        return this.rank.getValue();
    }
    
    public String toString() {
        return this.rank + " of " + this.suit;
        }

//    public void addCardToDeck(Card card) {
//        this.deck
//    }
}
