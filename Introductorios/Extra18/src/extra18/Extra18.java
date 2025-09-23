package extra18;

public class Extra18 {

    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos). 
        */
        Integer[] vectorOne = {3,56,78,4};
        for (int i = 0; i < vectorOne.length; i++) System.out.print("[ " + vectorOne[i] + " ]");
        System.out.println("\n---------------------------- \n");
        Integer[] vectorTwo = {3,2,78,4};
        for (int i = 0; i < vectorTwo.length; i++) System.out.print("[ " + vectorTwo[i] + " ]");

        System.out.println("\nLos vectores creados son Iguales ?  : " + compareVector(vectorOne, vectorTwo));

    }
    public static Boolean compareVector (Integer[] vectorOne , Integer[] vectorTwo ) {
        if ( vectorOne.length != vectorTwo.length) return false;
        for (int i = 0; i < vectorOne.length; i++) {
            if (!vectorOne[i].equals(vectorTwo[i])) return false;
        }
        return true;
    }
    
}
