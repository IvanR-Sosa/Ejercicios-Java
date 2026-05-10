package service;

import interfaces.IPort;
import java.util.Random;
import model.Port;
import model.Rental;

public class PortService implements IPort{

    @Override
    public void showPort(Port port) {
        for (int i = 0; i < port.getBerth().length; i++) {
            for (int j = 0; j < port.getBerth()[i].length; j++) {
                if (port.getBerth()[i][j] == null) {
                    System.out.print("[" + port.getColumn()[i] + port.getRow()[j] + " ]");
                } else {
                    System.out.print("[" + port.getColumn()[i] + port.getRow()[j] + "X]");
                }
            }
            System.out.println("");
        }

    }

    @Override
    public Boolean berthAsignation(Port port, Rental rental) {
        Random random = new Random();
        for (int i = 0; i < 48; i++) {
            Integer x = random.nextInt(port.getColumn().length);
            Integer y = random.nextInt(port.getRow().length);
            
            if ( port.getBerth()[x][y] == null) {
                port.getBerth()[x][y] = true;
                rental.setBerthPosition(  "[" + port.getColumn()[x] + port.getRow()[y]+"]\n");
                
                return true;
            }
            
        }
        System.out.println("No se pudo asignar mas amarres");
        return false;

    }
    
}
