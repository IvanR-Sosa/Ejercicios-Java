package service;

import interfaces.IDeck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Card;
import model.Deck;

public class DeckService implements IDeck{

    @Override
    public void shuffleDeck(Deck deck) {
        Collections.shuffle(deck.getCards());
    }

    @Override
    public Card drawNextCard(Deck deck) {
        Card card = new Card();
        if(deck.getCards().isEmpty()){
            System.out.println("Sin cartas disponibles");
            return null;
        }
        card = deck.getCards().get(0);
        deck.getDiscardPile().add(card);
        deck.getCards().remove(card);
        return  card;
    }

    @Override
    public Integer availbleCards(Deck deck) {
        if (deck.getCards().isEmpty()) {
            System.out.println("No quedan cartas disponibles");
            return 0;
        }
        return  deck.getCards().size();
    }

    @Override
    public List<Card> dealCards(Deck deck, Integer numberCards) {
        if (deck.getCards().size() < numberCards ) {
            System.out.println("No hay esa cantidad de cartas disponibles");
            return null;
        }
        List<Card> cardsPlayer = new ArrayList<>();
        
        for (int i = 0; i < numberCards; i++) {
            cardsPlayer.add(drawNextCard(deck));
        }
        
        return cardsPlayer;
        
    }

    @Override
    public List<Card> showDiscardPile(Deck deck) {
        if (deck.getDiscardPile().isEmpty()) {
            System.out.println("Sin cartas en el monton");
            return  null;
        }
        return deck.getDiscardPile();

    }

    @Override
    public List<Card> showCards(Deck deck) {
        if (deck.getCards().isEmpty()) {
            System.out.println("Sin cartas en la baraja");
            return null;
        }
        return deck.getCards();
    }
    
}
