package service;

import model.Roots;
import Interfaces.IRoots;

public class serviceRoots implements IRoots{

    @Override
    public Double getDiscriminant(Roots r) {
        return (double)(r.getB()*r.getB()) - (4*r.getA()*r.getC());
    }

    @Override
    public Boolean hasRoots(Roots r) {
        return getDiscriminant(r) > 0;
    }

    @Override
    public Boolean hasRoot(Roots r) {
        return getDiscriminant(r) == 0;
    }

    @Override
    public void getRoots(Roots r) {
        if (hasRoots(r)){
            //-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
            double n = ((r.getB() * r.getB()) - (4*r.getA()*r.getC())) / (2*r.getA());
            Double x1 = -r.getB() + Math.sqrt(n);
            Double x2 = -r.getB() - Math.sqrt(n);
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }
    }

    @Override
    public void getRoot(Roots r) {
        if (hasRoot(r)) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("Single root: " + x);
        }
    }

    @Override
    public void calculate(Roots r) {
        if (hasRoots(r)) {
            getRoots(r);
        }else if (hasRoot(r)){
            getRoot(r);
        }else{
            System.out.println("No hay soluciones posibles");
        }
    }
    
    
    
}
