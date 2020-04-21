package regexp;

/**
 * 2. Programa que reciba una url y el nombre de una etiqueta html.
 * Si la url es válida debe mostrar por la pantalla el contenido de cada etiqueta.
 *
 * Ejemplo: 
 *
 * Si ejecuto java miprograma https://www.iesgrancapitan.org h1
 *
 * La salida sería:
 *
 * Últimos artículos de nuestro blog de centro
 *
 * Número de etiquetas encontradas: 1
 * 
 * @author David Galván Fontalba
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejercicio2 {

  public static void main(String[] args) {
    
    // Comprobamos que el programa recive los parámetros correctos
    if (args.length != 2) {
      System.err.println("Error: En el número de parámetros");
      System.exit(1);
    }

    // Parámetros
    String toReadUrl = args[0];
    String label = args[1];
    String html = "";

    try {
      // Abrimos y establecemos conexión http
      URL url = new URL(toReadUrl);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");

      // Leemos el contenido html
      BufferedReader bReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = bReader.readLine()) != null) {
        html += line + "\n";
      }
      bReader.close();

      // Busco el contenido de la etiqueta en el html leído
      Pattern pattern = Pattern.compile("<" + label + "[^>]*>(.*?)</" + label + ">", Pattern.DOTALL);
      Matcher matcher = pattern.matcher(html);

      int n = 0;
      while (matcher.find()) {
        System.out.println("Ocurrencia nº" + ++n + ": " + matcher.group(1));
      }

      System.out.println("\nTotal etiquetas <" + label + "> encontradas: " + n);
    } catch (Exception e) {
      System.err.println("Error al manejar la URL " + e.getMessage());
    }

  }

}