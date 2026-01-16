package service;

import Interfaces.IHangman;
import java.util.Arrays;
import java.util.Scanner;
import model.Hangman;

public class ServiceHangman implements IHangman{
        Hangman hangman;
        String secretWord = "programacion";
        String[] auxWord;
    @Override
    public void createGame(String word, Integer attemts) {
        String[] wordFInd = new String[word.length()];
        for (int i = 0; i < wordFInd.length; i++) {
                wordFInd[i]="_";
        }
         hangman = new Hangman(wordFInd, 0, attemts);
        auxWord = word.split("");
    }

    @Override
    public void wordLength(Hangman hangman) {
        System.out.println("El tamaño de la palabra a buscar es : " + hangman.getWords().length);
    }

    @Override
    public void findLetter(Hangman hangman, Character letter) {
         auxWord = secretWord.split("");
          for (String s : hangman.getWords()) {
        if (s.equals(String.valueOf(letter))) {
            System.out.println("La letra '" + letter + "' ya fue encontrada antes.");
            return; // salir sin gastar intento
        }
    }

        Boolean auxB = lettersFond(hangman, letter, auxWord);
        if (auxB) {
        for (int i = 0; i < hangman.getWords().length; i++) {
            if(letter.equals(auxWord[i].charAt(0))){
            hangman.getWords()[i] = auxWord[i]; // asigna cada letra
            hangman.setLettersFound(hangman.getLettersFound()+1);
            }
        }
    }else{
            System.out.println("No encontrada la  letra : " + letter);
            hangman.setNumberOfAttempts(hangman.getNumberOfAttempts()-1);
        }

    }

    @Override
    public Boolean lettersFond(Hangman hangman, Character letterF,String[] auxWord) {
         for (int i = 0; i < auxWord.length; i++) {
            if( letterF.equals(auxWord[i].charAt(0))){
                return true;
            }
             
        }
         return false;
    }

    @Override
    public void showAttempts(Hangman hangman) {
        for (int i = 0; i < hangman.getWords().length; i++) {
            System.out.print(hangman.getWords()[i] + " ");
        }
        
        System.out.println("\nNumero de intentos disponibles : " + hangman.getNumberOfAttempts());
        System.out.println("letras encontradas : " + hangman.getLettersFound());
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Character letterScanner= ' ';
        System.out.println("Cuantos intentos le dara al participantes");
        Integer x = scanner.nextInt();
        createGame(secretWord, x);
        scanner.nextLine();
        wordLength(hangman);
        
        do {
            System.out.println("Ingrese una letra: ");
             letterScanner= scanner.next().charAt(0);
             findLetter(hangman, letterScanner);
             showAttempts(hangman);
            
        } while (hangman.getNumberOfAttempts()>0 && !Arrays.equals(auxWord, hangman.getWords()));
        if(hangman.getNumberOfAttempts()<1){
            System.out.println("Agotaste tus intentos vuelve a intentarlo mas tarde");
        }else{
            System.out.println("Felicitaciones");
        }
    }
    

    
}
