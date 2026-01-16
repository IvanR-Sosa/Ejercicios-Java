package model;

public class NIF {
    private Long DNI;
    private char letter;
    

    public NIF() {
    }

    public NIF(Long DNI, char letter) {
        this.DNI = DNI;
        this.letter = letter;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    
}
