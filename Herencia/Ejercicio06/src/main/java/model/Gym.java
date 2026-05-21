package model;

import interfaces.IAddedValue;

public class Gym implements IAddedValue{

    private char type; 

    public Gym(char type) {
        this.type = type;
        if (type > 'B') {
            type = 'A';
        }
        
    }

    public char getType() {
        return type;
    }
    


    @Override
    public Integer calculateAddValue() {
        if (type == 'A') return 50;
        return 30;

    }
    
    
    
}
