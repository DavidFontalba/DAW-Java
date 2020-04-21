package regexp;

/**
 * 1. Programa que recibe dos parámetros: un fichero de texto y una cadena que le indica qué información va extraer del mismo,
 * después muestra por la pantalla los datos extraídos.
 *
 * Los posibles valores del segundo parámetro y la información que extrae es:
 *
 * DNI: extrae los DNIs.
 * IP: extrae las direcciones IP.
 * MAT: extrae matrículas de coche con formato 0000XXX.
 * HEX: extrae números hexadecimales. Entendemos que las letras entre A y F son en mayúsculas y el número empieza con #.
 * FEC: extrae fechas con formato dd/mm/aaaa. 
 * TWT: extrae usuarios de twitter: empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos.
 * 
 * @author David Galván Fontalba
 */

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio1 {

  // Función para buscar las coincidencias dentro del fichero
  private static void searchUsages(String fichero, String expresion) {
    try {
      BufferedReader bReader = new BufferedReader(new FileReader(fichero));
      String line = bReader.readLine();
      while (line != null) {
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
          System.out.println("Coincidencias: " + matcher.group());
        }
        line = bReader.readLine();
      }
      bReader.close();
    } catch (FileNotFoundException e) {
      System.err.println("Error: No se ha encontrado el fichero");
      System.exit(2);
    } catch (IOException e) {
      System.err.println("Error: Fallo de lectura/escritura");
      System.exit(2);
    }
  }

  public static void main(String[] args) {
    
    // Comprobamos que el programa recive 2 parámetros
    if (args.length != 2) {
      System.err.println("Error: El programa tiene que tener 2 parámetros");
      System.exit(1);
    }
    
    // Asignamos los argumentos a variables
    String file = args[0];
    String option = args[1].toUpperCase();
    String expresion = "";

    // Switch que según la opción que hayamos elegido manda un parámetro a buscar u otro
    switch (option) {
      case "DNI":
        expresion = "\\d{8}[A-HJ-NP-TV-Z]";
        break;

      case "IP":
        expresion = "\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b";
        break;

      case "MAT":
        expresion = "\\d{4}[BC-DF-GH-JN-PT-VZ]{3}";
        break;

      case "HEX":
        expresion = "#[0-9A-Fa-f]+\\b";
        break;

      case "FEC":
        expresion = "\\d{1,2}/\\d{1,2}/\\d{4}";
        break;

      case "TWT":
        expresion = "\\B(@[a-zA-Z0-9_]{1,15})\\b";
        break;

      default:
        System.err.println("Error al introducir el nombre del parámetro");
        System.exit(1);
    }

    // Llamamos a la función para que saque los datos del fichero
    searchUsages(file, expresion);

  }
  
}