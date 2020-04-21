package ficheros;

/**
 * Ejercicio 2, página 256.
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author David Galván Fontalba
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ej2primosmuestra {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      
      String line = "";
      while (line != null) {
        System.out.print(line + " ");
        line = br.readLine();
      } 
      System.out.println();
      br.close();
    } catch (IOException e) {
      System.out.println("ERROR: Ha habido un error de lectura.");
      System.err.println(e.getMessage());
    }
  }
}