package colecciones;

import java.util.ArrayList;

import colecciones.Carta;

/**
 * Ejercicio 8
 *
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author David Galván Fontalba
 */
  
public class ej8cartasazar {
  public static void main(String[] args) {
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    Carta aux;
    int NUMCARTAS = 10;
    
    //Meto las cartas en el Array
    for (int i=0; i<NUMCARTAS; i++) {
      aux = new Carta();
      
      boolean yaExiste = false;
      for (int j=0; j<cartas.size(); j++) {
        if (cartas.get(i).equals(aux)) {
          yaExiste=true;
        }
      }
      if (!yaExiste) {
        cartas.add( new Carta() );
      } 
      
    }
    
    //Muestro las cartas por pantalla
    for (int i=0; i<cartas.size(); i++) {
      System.out.println(cartas.get(i));
    }
  }
}