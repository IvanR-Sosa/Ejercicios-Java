
package com.example.ejercicio05;

import java.util.ArrayList;
import model.Build;
import model.OfficeBuilding;
import model.SportsCenter;

public class Ejercicio05 {

    public static void main(String[] args) {

        ArrayList <Build> buildings = new ArrayList<>();
        buildings.add(new SportsCenter(true, 30.3, 25.6, 65.2));
        buildings.add(new SportsCenter(false, 15.3, 42.6, 75.3));
        buildings.add(new OfficeBuilding(45, 18, 75.4, 28.9, 30.3));
        buildings.add(new OfficeBuilding(36, 15, 55.4, 22.9, 38.3));
        
        buildings.forEach(System.out::println);
        Integer numRoofed = 0;
        for (Build building : buildings) {
            if (building.getClass().equals(SportsCenter.class)) {
               SportsCenter sc = (SportsCenter) building; 
               if(sc.getIsRoofed() == true ) numRoofed ++;
            }else{
                OfficeBuilding ob = (OfficeBuilding) building;
                ob.cantPeople();
            }
        }
        System.out.println("La cantidad de polideportivos techados es : " + numRoofed);


    }
}
