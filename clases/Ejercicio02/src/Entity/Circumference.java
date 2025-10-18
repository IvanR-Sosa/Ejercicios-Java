package Entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo 
del objeto. 
d) Método area(): para calcular el área de la circunferencia (Area = π * radio ). 
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * π * radio). 
*/
public class Circumference {

    private Double radius;

    public Circumference(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    public void createCicumference (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio");
        Double radius = scanner.nextDouble();
        this.radius = radius;
        scanner.close();
    }
    
    
    public Double calculateArea (){
        Double area = Math.PI * (Math.pow(this.radius, 2));
        BigDecimal formatNumber = new BigDecimal(area);
        formatNumber = formatNumber.setScale(2, RoundingMode.DOWN);
        return formatNumber.doubleValue();
    }
    
    public Double calculatePerimeter (){
        Double perimeter = 2 * Math.PI * this.radius;
        BigDecimal formatNumber = new BigDecimal(perimeter);
        formatNumber = formatNumber.setScale(2, RoundingMode.DOWN);
        return formatNumber.doubleValue();
    }
    
    
}
