package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.  
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta.  
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals(). */
        Scanner scanner = new Scanner(System.in);
        Boolean FDE = false;
        String message="";
        Integer correct= 0;
        Integer incorrect = 0;
        do {
            System.out.println("Ingrese Mensaje");
            message = scanner.nextLine();
            if (message.equalsIgnoreCase("&&&&&")){
                FDE = true;
            }
            if (message.length()==5) {
                if (message.substring(0, 1).equalsIgnoreCase("x") && message.substring(message.length()-1).equalsIgnoreCase("o")){
                    correct ++;
                }
            }else{
                incorrect ++;
            }
            System.out.println("-----"+message.substring(0,1)+"----"+message.substring(message.length()-1));
        } while (!FDE);
        System.out.println("Codificaciones Correctas:  "+correct);
        System.out.println("Codificaciones Incorrectas:  "+incorrect);

    }
    
}
