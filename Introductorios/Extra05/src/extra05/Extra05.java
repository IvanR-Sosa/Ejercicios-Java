package extra05;

import java.util.Scanner;

public class Extra05 {

    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:  
o  Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.  
o  Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.  
o  Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.  
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio. 
        */
        Scanner scanner = new Scanner(System.in);
        String[] typeOfPartner = {"A","B","C"};
        Double[] treatmentValue  = {1000.00,2000.00,3000.00};
        String partner = "";
        Boolean partnerConfirm = false;
        do {
           
            System.out.println("Ingrese que tipo de socio es:");
            partner = scanner.nextLine();
            for (String partnervalue : typeOfPartner) {
                if (partner.equalsIgnoreCase(partnervalue)) {
                    partnerConfirm = true;
                    partner = partnervalue;
                    break;
                }
            }
            if(!partnerConfirm) System.out.println("Tipo de socio invalido si no es socio aun ingrese C");
        } while (!partnerConfirm);
        showTreatmentValues(treatmentValue);
        System.out.println("-----------------------------");
        aplicationOfDiscounts(treatmentValue, partner);

    }
    public static void showTreatmentValues(Double[] treatment){
        Integer position = 1;
        for (Double value : treatment) {
            System.out.println("Tratamiento " + position + " cuesta : $ " + value);
            position ++ ;
        }
    }
    public static void aplicationOfDiscounts (Double [] treatment,String partner){
        Double discountPercentage = 0.00;
        switch (partner) {
            case "A":
                discountPercentage = 0.5;
                
                break;
            case "B":
                discountPercentage = 0.35;
              
                break;
            case "C": 
               discountPercentage = 0.00;
                
                break;
            default:
                throw new AssertionError();
        }
        for (int i = 0; i < treatment.length; i++) {
            Double aux = treatment[i] * discountPercentage;
            treatment[i] = treatment[i] - aux;
        }
        showTreatmentValues(treatment);
    }
    
}
