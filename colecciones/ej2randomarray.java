package colecciones;

import java.util.ArrayList;
import funciones.estadisticas.Arrays;

/*
 * Ejercicio 2
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author David Galván Fontalba
 * 
 */
public class ej2randomarray {
  public static void main(String[] args) {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    System.out.println("Programa que un numero aleatorio (Entre 10 y 20) de valores aleatorios (Entre 0 y 100) y muestra su suma, media, máximo y mínimo.");
    
    //Tamaño de la lista entre 10 y 20
    int numElements = (int) (Math.random() * 11 + 10);
    for (int i=0; i < numElements; i++) {
      myArrayList.add( (int) (Math.random() * 101) );
    }
    System.out.print("Los números generados son");
    for (int i : myArrayList) {
      System.out.print(", "+i);
    }
    System.out.println();
    
    System.out.println("Suma: "+ Arrays.suma(myArrayList) );
    System.out.println("Media: "+ Arrays.media(myArrayList) );
    System.out.println("Máximo: "+ Arrays.maximo(myArrayList, 0) );
    System.out.println("Mínimo: "+ Arrays.minimo(myArrayList, 100) );
  }
}