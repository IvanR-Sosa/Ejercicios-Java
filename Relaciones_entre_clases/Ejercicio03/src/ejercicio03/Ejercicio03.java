package ejercicio03;

import model.Deck;
import service.DeckService;

public class Ejercicio03 {

    public static void main(String[] args) {
        Deck deck = new Deck();
        DeckService deckService = new DeckService();
        
        deckService.shuffleDeck(deck);
        System.out.println("------------------------------");
        System.out.println(deckService.drawNextCard(deck) + "\n" +deckService.availbleCards(deck) );
        System.out.println("-------------------------------");
        System.out.println(deckService.dealCards(deck,4) + "\n" + deckService.availbleCards(deck) );
        System.out.println("---------------------------------");
        System.out.println(deckService.showCards(deck));
        System.out.println("----------------------------------");
        System.out.println(deckService.showDiscardPile(deck));

    }
    
}
