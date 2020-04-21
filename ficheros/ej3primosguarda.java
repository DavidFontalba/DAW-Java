package ficheros;

/**
 * Ejercicio 3, página 256.
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 * 
 * @author David Galván Fontalba
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ej3primosguarda {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Uso del programa: ej3primosguarda FICHERO1 FICHERO2 MEZCLA");
      System.exit(1); // sale del programa
    }
    try {
      BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));
    
      String line1 = "";
      String line2 = "";
      
      while ( (line1 != null) || (line2 != null) ) {
        line1 = bf1.readLine();
        line2 = bf2.readLine();
        
        if (line1 != null) {
          bw.write(line1 + "\n");
        }
        
        if (line2 != null) {
          bw.write(line2 + "\n");
        }
      } 
    
      bf1.close();
      bf2.close();
      bw.close();
    
    } catch (IOException e) {
      System.out.println("ERROR: Se ha producido un error de lectura/escritura");
      System.err.println(e.getMessage());
    }
  }
}