package Entity;

import java.util.Scanner;

public class RectangleEx {
    /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un 
método para calcular la superficie del rectángulo y un método para calcular el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el 
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir 
los métodos getters, setters y constructores correspondientes. 
Superficie = base * altura  
Perímetro = (base + altura) * 2.
    */
    
    private Integer base;
    private Integer height;

    public RectangleEx() {
    }

    public RectangleEx(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }
    
    public void createRectangle () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        this.base = scanner.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.height = scanner.nextInt();
    }
    
    public Integer calculatePerimeter(){
        if (this.base == 0 || this.height == 0) return 0;
        return (this.base + this.height) * 2;
    }
    public Integer calculateArea (){
        if (this.base == 0 || this.height == 0) return 0;
        return (this.base * this.height);
    }
    
    public void drawRectangle(){
        if (this.base == 0 || this.height == 0) System.out.println("---------------------------");
        else{
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        }
    }
    
}
