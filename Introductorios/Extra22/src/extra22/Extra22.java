package extra22;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Extra22 {

    public static void main(String[] args) {
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con un 
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras 
creada.  
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
        */
        Scanner scanner = new Scanner (System.in);
        String[] words = new String[5];
        String[][] wordSearch = new String [20][20];
        readWords(words, scanner);
      
        locateWord(wordSearch, words);
        showWordSearch(wordSearch);
    }
    public static void readWords (String[] word, Scanner scanner){
        
        for (int i = 0; i < word.length; i++) {
            String auxWord = "";
                do {
                System.out.println("Ingrese palabra a buscar: ");
                auxWord = scanner.nextLine();
                word[i] = auxWord;
            } while (auxWord.length() <3 || auxWord.length() > 5);
        }
    }
    public static void locateWord (String[][] wordSearch, String[] word){
        Random random = new Random();
        HashSet <Integer> index = new HashSet<>();
         for (int i = 0; i < wordSearch.length; i++) {
        for (int j = 0; j < wordSearch[i].length; j++) {
            wordSearch[i][j] = "";
        }
    }

        for (String aux : word) {
            Integer row ;
            do {
                row = random.nextInt(20);
            } while (index.contains(row));
            index.add(row);
            
            Integer useColumn = random.nextInt(20 - aux.length());
            for (int i = 0; i < aux.length(); i++) {
                wordSearch[row][useColumn + i] = String.valueOf(aux.charAt(i));
            }
            
        }
        for (int i = 0; i < wordSearch.length; i++) {
        for (int j = 0; j < wordSearch[i].length; j++) {
            if (wordSearch[i][j].isEmpty()) {
                wordSearch[i][j] = String.valueOf(random.nextInt(10));
            }
        }
    }

    }
    public static void showWordSearch ( String[][] wordSearch){
        for (int i = 0; i < wordSearch.length; i++) {
                for (int j = 0; j < wordSearch[i].length; j++) {
                    if (wordSearch[i][j].isEmpty()) {
                        System.out.print("[X]");
                    }else{
                        System.out.print("[" + wordSearch[i][j] + "]");
                    }
            }
                System.out.println("");
        }
    }
    
}
