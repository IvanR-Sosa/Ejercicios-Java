package Interfaces;

import model.Roots;

public interface IRoots {
    
    Double getDiscriminant(Roots r);
    Boolean hasRoots(Roots r);
    Boolean hasRoot(Roots r);
    void getRoots(Roots r);
    void getRoot(Roots r);
    void calculate(Roots r);
    
}
