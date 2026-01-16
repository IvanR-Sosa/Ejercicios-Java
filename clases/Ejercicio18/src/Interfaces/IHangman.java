package Interfaces;

import model.Hangman;

public interface IHangman {

    void createGame (String word,Integer attemts);
    void wordLength(Hangman hangman);
    void findLetter (Hangman hangman,Character letter);
    Boolean lettersFond (Hangman hangman,Character letterF,String[] auxWord);
    void showAttempts (Hangman hangman);
    void play();

    
}
