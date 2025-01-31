import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private static final String[] SUITS = {"c", "d", "h", "s"}; //{"♠", "♣", "♥", "♦"};  {"Club", "Diamond", "Heart", "Spade"};
    public static final String[] VALUES = {"2", "3", "4", "5", "6","7", "8", "9", "t", "j", "q", "k", "a"};
    private Card[] deck;

   
    
    
    public Deck(){
        List<Card> deckList = new ArrayList<Card>();

        // create cards and add to deck
        
        for(String suit: SUITS){
            for(String value: VALUES){
                deckList.add(new Card(suit, value));
            }
        }

        // shuffle deck
        
        Collections.shuffle(deckList);
        this.deck = deckList.toArray(new Card[deckList.size()]);
    }


    public Card pop(){

        Card firstCard = this.deck[0];
        Card[] newDeck = new Card[this.deck.length-1];

        System.arraycopy(this.deck, 1, newDeck, 0, newDeck.length);

        this.deck = newDeck;
        return firstCard;
    }
}
