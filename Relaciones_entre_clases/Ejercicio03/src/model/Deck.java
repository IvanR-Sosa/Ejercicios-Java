package model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private final String [] siuts = {"sword","cups","clubs","coins"};
    private final Integer [] ranks = {1,2,3,4,5,6,7,10,11,12};
    
    private List<Card> cards ;
    private List<Card> discardPile;

    public Deck() {
        
        cards = new ArrayList<>();
        discardPile = new ArrayList<>();
        for (String siut : siuts) {
            for (Integer rank : ranks) {
                cards.add(new Card(siut, rank));
            }
        }
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile;
    }
    
    

    public List<Card> getCards() {
        return cards;
    }
    
    
}
