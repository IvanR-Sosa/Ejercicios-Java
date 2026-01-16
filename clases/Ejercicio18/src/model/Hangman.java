package model;

public class Hangman {
    
    private String[] words;
    private Integer lettersFound;
    private Integer numberOfAttempts;

    public Hangman() {
    }

    public Hangman(String[] words, Integer lettersFound, Integer numberOfAttempts) {
        this.words = words;
        this.lettersFound = lettersFound;
        this.numberOfAttempts = numberOfAttempts;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public Integer getLettersFound() {
        return lettersFound;
    }

    public void setLettersFound(Integer lettersFound) {
        this.lettersFound = lettersFound;
    }

    public Integer getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(Integer numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }
    
    
    
}
