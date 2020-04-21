package ficheros;

/**
 * Ejercicio 1, página 256.
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author David Galván Fontalba
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class ej1primos {
  private static boolean isPrime(int n) {
    for (int i = 2 ; i < n ; i++) {
      if ( (n % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

      for (int i = 0 ; i < 500 ; i++) {
        if (isPrime(i)) {
          bw.write(String.valueOf(i) + "\n");
        }
      }
      
      bw.close();
    } catch (IOException e) {
        System.out.println("ERROR: Ha habido un error de escritura.");
        System.err.println(e.getMessage());
    }
  }

}