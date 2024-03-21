
package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
    private ArrayList<Carta> cartas=new ArrayList() ;
    private ArrayList<Carta> monton=new ArrayList();

// constructor

    public Baraja() {
    }
    
 // metodos especiales
    
    public void crearBaraja(){
   
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if(j!= 8 && j!=9){
                    Carta c= new Carta(j,""); // crea una nueva instancia de carta
                    switch (i){
                        case 0: c.setPalo("Oro");cartas.add(c);break;
                        case 1: c.setPalo("Copa");cartas.add(c);break;
                        case 2: c.setPalo("Espada");cartas.add(c);;break;
                        case 3: c.setPalo("Basto");cartas.add(c);;break;
                    }
                    //cartas.add(c);
                }
            }
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta);
            
        }
    }

    public void Barajar(){
    
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta(){
        Carta aux = new Carta(0,"");
       if(cartas.isEmpty()){
           System.out.println("No hay mas cartas");
           return null;
       }
        aux=cartas.get(0);
        cartas.remove(0);
        return aux;
    }
    
    public void darCartas(int num){
//        ArrayList<Carta>cartasJugador=new ArrayList();
//        for (int i = 0; i < num; i++) {
//           cartasJugador.add(cartas(i)); 
//        }
//        
        

    } 
}
