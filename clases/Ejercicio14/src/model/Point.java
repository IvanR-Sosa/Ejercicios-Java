package model;
/* Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa 
en los atributos del objeto. Después, a través de otro método calcular y devolver la 
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer 
como calcular la distancia entre dos puntos consulte el siguiente link:  
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html. 
*/
public class Point {
    
    private Integer x1;
    private Integer y1;
    private Integer x2;
    private Integer y2;

    public Point() {
    }

    public Point(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }
    
    
    
}
