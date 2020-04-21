package ficheros;

/**
 * Ejercicio 4, página 256.
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 * 
 * @author David Galván Fontalba
 */

import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ej4ordenapalabras {
  public static void main(String[] args) {
    
    if (args.length != 1) {
      System.out.println("Uso del programa: ej4ordenapalabras FICHERO.TXT");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      int l = args[0].length();
      String name = args[0].substring(0, l - 4);
      String extension = args[0].substring(l - 4, l);

      BufferedWriter bw = new BufferedWriter(new FileWriter(name + "_sort" + extension));

      ArrayList<String> myArrayList = new ArrayList<String>();

      String line = "";
      while (line != null) {
        myArrayList.add(line);
        line = br.readLine();
      }
      br.close();

      myArrayList.remove(0);
      Collections.sort(myArrayList);
      
      for (String s: myArrayList) {
        bw.write(s + "\n");
      }

      bw.close();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}