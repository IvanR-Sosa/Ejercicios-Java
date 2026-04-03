package model;

public class Card {
    
    private String suit;
    private Integer rank;

    public Card() {
    }

    
    public Card(String suit, Integer rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + " -> " + rank;
    }
    
    
    
}
