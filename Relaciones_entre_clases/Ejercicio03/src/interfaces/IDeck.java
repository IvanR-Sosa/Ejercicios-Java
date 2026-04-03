package interfaces;


import java.util.List;
import model.Card;
import model.Deck;

public interface IDeck {
    void shuffleDeck (Deck deck);
    Card drawNextCard (Deck deck);
    Integer availbleCards (Deck deck);
    List<Card> dealCards(Deck deck, Integer numberCards);  
    List<Card> showDiscardPile(Deck deck);                      
    List<Card> showCards(Deck deck); 
}
