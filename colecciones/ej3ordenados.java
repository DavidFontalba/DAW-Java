package colecciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * Ejercicio 3
 *
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 *  * @author David Galván Fontalba
 */

public class ej3ordenados {
  public static void main(String[] args) {
    int NUMS = 10;
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa para ordenar y almacenar diez números introducidos");
    
    for (int i=0; i < NUMS; i++) {
      System.out.print("Introduce el "+(i+1)+" número: ");
      myArrayList.add(s.nextInt());
    }
    Collections.sort(myArrayList);
    
    System.out.print("Tus números ordenados son");
    for (int i : myArrayList) {
      System.out.print(", "+i);
    }
    
  }
}