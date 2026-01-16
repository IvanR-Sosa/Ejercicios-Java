package service;

import Interfaces.INIFService;
import java.util.Scanner;
import model.NIF;

public class serviceNif implements INIFService {
    Scanner scanner = new Scanner(System.in);     
    private static final char[] LETTERS = { 'T','R','W','A','G','M','Y','F','P','D', 'X','B','N','J','Z','S','Q','V','H','L', 'C','K','E' };


    @Override
    public NIF createNif () {
        System.out.println("Ingrese DNI");
        Long dni = scanner.nextLong();
        int rest =(int)(dni % 23);
        NIF nif =new NIF();
        nif.setDNI(dni);
        nif.setLetter(LETTERS[rest]);
        return nif;
    }

    @Override
    public void showNif(NIF nif) {
        System.out.printf("%08d-%c",nif.getDNI(),nif.getLetter());

    }
    
    
    
}
