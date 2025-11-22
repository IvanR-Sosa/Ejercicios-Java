package Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
    Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese 
una frase que puede ser una palabra o varias palabras separadas por un espacio en 
blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
automática según la longitud de la frase ingresada. Deberá además implementar los 
siguientes métodos:  
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
frase ingresada.  
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida 
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter 
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la 
frase, por ejemplo:  
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
• Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario. 
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con  una nueva frase ingresada por el usuario y mostrar la frase resultante. 
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
mostrar la frase resultante. 
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
public class stringEj {
    
    private String sentence;
    private Integer sizeSentence;

    public stringEj() {
    }

    public stringEj(String sentence) {
        this.sentence = sentence;
        this.sizeSentence = this.sentence.length();
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    //----------------------------------------------------------------------------------------
    
    public void showVowels(){
        HashSet<Character> vowel = new HashSet<>();
        for (int i = 0; i < this.sizeSentence; i++) {
            char x = this.sentence.charAt(i);
            if (isVowel(x)) {
                vowel.add(x);
            }
        }
        if (vowel.isEmpty()) {
            System.out.println("Vocales no encontradas");
        }else{
            System.out.println("Vocales encontradas : ");
            for (Character character : vowel) {
                System.out.println("[ " + character + " ]");
            }
        }
        
    }
    public static Boolean isVowel(Character x){
        x = Character.toLowerCase(x);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
    //-------------------------------------------------------------------------------------------------
    public String InvertSentence(){
        String newSentence =" ";
        for (int i = this.sizeSentence-1; i>=0; i--) {
            char x = this.sentence.charAt(i);
            newSentence += x;
        }
        return newSentence;
    }
        //-----------------------------------------------------------------------------------------------
    public void timesRepeated(String y){
        //Aqui lo obligo a tomar el primer valor de la cadena pasad "y" asi que si es una cadena de tamaño mayor a 1 solo tomara el valor del index 0
        char x = y.charAt(0);
        Integer counter = 0;
        for (int i = 0; i < this.sizeSentence; i++) {
            if (this.sentence.charAt(i) == x) {
                counter ++;
            }
        }
        if (counter == 0) {
            System.out.println("La letra: " + x + ", no se encuentra en la cadena de texto : " + this.sentence);
        }else{
            System.out.println("La letra: " + x + ",  se encuentra en la cadena de texto : " + this.sentence + "  " + counter + " veces");
        }
    }
    //-------------------------------------------------------------------------------------------------------
    
    public Boolean compareLength(String sentenceTwo){
        if( this.sizeSentence == sentenceTwo.length()) return true;
        return false;
    }
    //---------------------------------------------------------------------------------------------------
    public void joinSentences(String sentenceTwo){
        String newSentence="";
        if (sentenceTwo.isBlank() || this.sentence.isBlank()) {
            System.out.println("No tiene sentido unir espacios vacios");
        }else{
            newSentence = this.sentence + "  " + sentenceTwo;
            System.out.println("Frase resultante : " + newSentence);
        }
    }
//---------------------------------------------------------------------------------------------------

public void replaceCharacter(String x){
    String newSentence = this.sentence.toLowerCase().replace("a",x);
    System.out.println("La nueva frase es:  " + newSentence);
}    
//--------------------------------------------------------------------------------------------------
public Boolean contain (String x){
        char y = x.charAt(0);
    if(this.sentence.contains(String.valueOf(y))) return true;
    return false;
}
    
    


    
}
