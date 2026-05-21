package model;

import interfaces.IAddedValue;

public class Restaurant implements IAddedValue{

private String name;
private Integer capacity;

    public Restaurant(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }
    

    @Override
    public Integer calculateAddValue() {

        return (this.capacity <= 30) ? 10 :
                (this.capacity <= 50) ? 30 : 50; 

    }

    
}
