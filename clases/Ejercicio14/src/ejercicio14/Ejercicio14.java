package ejercicio14;

import model.Point;
import service.pointService;

public class Ejercicio14 {

    public static void main(String[] args) {
        pointService pointService1= new pointService();
        Point point = pointService1.createPoints(8,4 ,9, 2);
        Double distance = pointService1.calculateDistance(point);
        System.out.println("La distancia entre puntos es:  " + distance);
        

    }
    
}
