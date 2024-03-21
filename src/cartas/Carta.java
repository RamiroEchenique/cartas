
package cartas;

public class Carta {
    private int num;
    private String palo;
    
    //constructor

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }
    
    // metodos getter y setters

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    // metodo to String

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }
    
    
    
    
}
