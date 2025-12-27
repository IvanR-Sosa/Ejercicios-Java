package Interfaces;

import model.Point;

public interface IPointService {

    public Point createPoints (Integer x1,Integer y1,Integer x2, Integer y2);
    public Double calculateDistance (Point point);
    
    
}
