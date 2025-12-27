package service;

import Interfaces.IPointService;
import model.Point;

public class pointService implements IPointService{

    @Override
    public Point createPoints(Integer x1, Integer y1, Integer x2, Integer y2) {
        Point point = new Point(x1, y1, x2, y2);
        return point;
    }

    @Override
    public Double calculateDistance(Point point) {
        Double dx = point.getX2()-(double)point.getX1();
        Double dy = point.getY2()-(double)point.getY1();
        
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance;

    }


    
}
