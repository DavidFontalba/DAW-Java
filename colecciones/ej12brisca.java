package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 12
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta . El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
 * el resto de cartas no vale nada.
 * 
 * @author DavidFontalba
 */
public class ej12brisca {
  public static void main(String[] args) {
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    int NUMCARTAS = 5;
    
    HashMap<String, Integer> puntuacionBrisca = new HashMap<String, Integer>();
    puntuacionBrisca.put("As",11);
    puntuacionBrisca.put("2",0);
    puntuacionBrisca.put("3",10);
    puntuacionBrisca.put("4",0);
    puntuacionBrisca.put("5",0);
    puntuacionBrisca.put("6",0);
    puntuacionBrisca.put("7",0);
    puntuacionBrisca.put("Sota",2);
    puntuacionBrisca.put("Caballo",3);
    puntuacionBrisca.put("Rey",4);
    
    //Meto las cartas en el Array
    for (int i=0; i<NUMCARTAS; i++) {
      cartas.add( new Carta() );
    }
    
    int puntuacion = 0;
    for (Carta i : cartas) {
      puntuacion += puntuacionBrisca.get( i.getCara() );    
    }
  //Muestro las cartas por pantalla
    System.out.println("Tus cartas son: ");
    for (int i=0; i<cartas.size(); i++) {
      System.out.println(cartas.get(i));
    }
    System.out.println("Tu puntuación es: "+puntuacion);
  }
}