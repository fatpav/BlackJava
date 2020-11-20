import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;


    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public int getDeckSize() {
        return this.deck.size();
        }

    public void addCardToDeck(Card card) {
        this.deck.add(card);
    }

    public void createDeck() { //This method will create a 'Deck' Array List with 52 instances of the 'Card' class
        // The program will loop through both the SuitType and the CardRank Enums,
        // creating an instance of the 'Card' Class every time until every parameter has been assigned to a Card instance
        for(SuitType suit : SuitType.values()){
            for(CardRank rank : CardRank.values()){
                Card card = new Card(suit, rank);{
                    // the newly created instances of the 'Card' class will be added to the empty 'Deck' Array List
                    this.deck.add(card);
                }
            }
        }
    }

//    public int getCardAtIndex(int index){
//        return this.deck.get(index);
//    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
//        return getCardAtIndex(0);
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public void removeCard(int index) {
        this.deck.remove(index);
    }

//    public Card dealCard(){
//       return this.deck.remove(0);
//    }

}
