package model;

import java.util.Random;

public class Months {
    
    private static final String[] MONTHS ={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String secretMonth;

    public Months() {
        Random rand = new Random();
        this.secretMonth = MONTHS[rand.nextInt(12)];

    }

    public String getSecretMonth() {
        return secretMonth;
    }
    
    
    
}
