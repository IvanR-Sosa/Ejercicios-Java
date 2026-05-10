package model;

import interfaces.IGeometricShape;

public class Rectangle implements IGeometricShape{
    private Double base;
    private Double height;

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    

    @Override
    public Double calculateArea() {
        return base * height;
    }

    @Override
    public Double calculatePerimeter() {
        return (base + height) * 2;
    }
    @Override
    public String toString() {
        return String.format("RECTANGULO\nEL area es : %.2f\n"
                + "El perimetro es : %.2f \n\n", calculateArea(),calculatePerimeter());
    }
    
}
