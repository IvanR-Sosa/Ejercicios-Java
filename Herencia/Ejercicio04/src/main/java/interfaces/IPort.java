package interfaces;

import model.Port;
import model.Rental;

public interface IPort {
public void showPort(Port port);
public Boolean berthAsignation(Port port ,Rental rental);    
}
