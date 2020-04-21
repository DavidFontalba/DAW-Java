package ficheros;

/**
 * Ejercicio 5, página 257.
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero sin los comentarios.
 * 
 * @author David Galván Fontalba
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ej5quitacomentarios {
  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.out.println("Uso del programa: ejercicio5 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

      String originLine = "";
      String finalLine = "";
      boolean isLongComment = false;
      int i = 0;
      
      while ((originLine = br.readLine()) != null) {
        
        int len = originLine.length();
        finalLine = originLine;

        // Detecta inicio de comentario de bloque 
        if ((i = originLine.indexOf("/*")) != -1) {
          isLongComment = true;
          finalLine = originLine.substring(0, i);
          originLine = finalLine;
        }
        
        // Detecta fin de comentario de bloque 
        if ((i = originLine.indexOf("*/")) != -1) {
          isLongComment = false;
          finalLine = originLine.substring(i + 2, len);
        }
        // Detecta comentario de línea
        if (((i = originLine.indexOf("//")) != -1) && !isLongComment) {
          finalLine = originLine.substring(0, i);
        }

        if (!isLongComment) {
          bw.write(finalLine + "\n");
        }
      }

      // Cerramos el reader y el writer
      br.close();
      bw.close();

    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}