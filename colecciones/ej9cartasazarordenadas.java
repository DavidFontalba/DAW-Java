package colecciones;

import java.util.ArrayList;

import colecciones.Carta;

/**
 * Ejercicio 9
 * Modifica el programa anterior de tal forma que las cartas se muestren orde-
 * nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 *
 * (Programa anterior)
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author David Galván Fontalba
 */
  
public class ej9cartasazarordenadas {
  public static void main(String[] args) {
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    int NUMCARTAS = 10;
    
    //Meto las cartas en el Array
    for (int i=0; i<NUMCARTAS; i++) {
      cartas.add( new Carta() );
    }
    
    //Ejercicio 9
    //Ordeno el Array
    ArrayList<Carta> cartasOrdenadas = new ArrayList<Carta>();
    Carta aux;
    
      
    for (int i=0; i<Carta.PALOS.length; i++) { //Recorre cada Palo
        
      for (int j=0; j<Carta.FIGURAS.length; j++) {//Recorre cada Figura/cara
          
        for (int a=0; a<cartas.size(); a++) { //Recorre cada carta
         
          //Si una carta coincide con el primer palo y cara a ordenar
          if (cartas.get(a).getPalo() == Carta.PALOS[i]) {
            if (cartas.get(a).getCara() == Carta.FIGURAS[j]) {
              aux = cartas.get(a);
              cartasOrdenadas.add(aux); //Meto la carta en el nuevo array ordenado
            }
          }
        }
      }
    }
    
    //Muestro las cartas por pantalla
    for (int i=0; i<cartasOrdenadas.size(); i++) {
      System.out.println(cartasOrdenadas.get(i));
    }
  }
}