package service;

import java.util.Scanner;
import model.Months;

public class serviceMonths {
    Scanner scanner = new Scanner(System.in); 
    public void guessMonth (){
        Months month = new Months();
        Boolean attempt = false;
        System.out.println("Intenta adivinar el mes elegido");
        while (!attempt) {
            String m1 = scanner.nextLine();
            if (m1.equals(month.getSecretMonth())) {
                attempt = true;
            }else{
                System.out.println("No ha acertado. Intente nuevamente");
            }
        }
        
        System.out.println("¡Ha acertado!");
        
    }
    
}
