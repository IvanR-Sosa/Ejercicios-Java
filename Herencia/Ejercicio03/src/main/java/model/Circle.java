
package model;

import interfaces.IGeometricShape;


public class Circle implements IGeometricShape{
    private Double radio;

    public Circle(Double radio) {
        this.radio = radio;
    }
    

    @Override
    public Double calculateArea() {
        return pi * (Math.pow(radio, 2));
    }

    @Override
    public Double calculatePerimeter() {
        return pi*(radio*2);
    }

    @Override
    public String toString() {
        return String.format("CIRCULO\nEL area es : %.2f\n"
                + "El perimetro es : %.2f \n\n", calculateArea(),calculatePerimeter());
    }
    
    
    
    
    
}
