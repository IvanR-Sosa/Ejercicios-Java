package ejercicio16;

import model.NIF;
import service.serviceNif;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        serviceNif serNif = new serviceNif();
        NIF nif = serNif.createNif();
        serNif.showNif(nif);

    }
    
}
