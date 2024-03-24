
package cartas;

import java.util.Scanner;

public class Cartas {

    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        Baraja b = new Baraja();
        b.crearBaraja();
        b.mostrarBaraja();
        
        System.out.println("Barajando");
        b.Barajar();
        b.mostrarBaraja();
        
        System.out.println("Ingrese la cantidad de cartas a recibir");
        b.darCartas(leer.nextInt());
        
        System.out.println("Cartas del monton ");b.cartasMonton();
        System.out.println("Cartas que quedan ");b.mostrarBaraja();
        
    }
    
}
