package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import exceptions.BasicError;
import utils.Keyboard;
/**
 * 2. Crea un programa que encripte un fichero que le pasamos como parámetro y almacene 
 * el resultado en otro, que también pasamos como parámetro, de manera que:
 * 
 * Si el programa no recibe dos parámetros termina con un error 1.
 * Si el programa recibe un solo parámetro guardará la información encriptada en el mismo 
 * archivo del que lee, pero antes advertirá al usuario de que machacará el archivo origen, 
 * dando opción a que la operación no se haga.
 * 
 * Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina 
 * con un mensaje de error y código 2.
 * 
 * Si en el fichero destino no se puede escribir da error al abrirlo como lectura) ç
 * el programa termina con un mensaje de error y código 2.
 * 
 * Para encriptar usa el método César, necesitarás una clave que debes pedir al usuario.
 *   
 * @author David Galván Fontalba
 *
 */
public class ej1EncriptadoCesar {
  public static void main(String[] args) throws IOException {
    // Comprobamos que el número de parámetros es correcto
    if (args.length == 0 || args.length > 2) {
      System.err.println("Error en el número de parámetros");
      System.exit(1);
    }
              
    // Comprobamos el fichero origen y el fichero destino
    String originFile = args[0];
    String finalFile = finalFile(args);
          
    // Abrimos el fichero origen
    BufferedReader bOrigin = originBuffer(originFile);
      
    // Leemos el fichero y lo guardamos
    ArrayList<String> linesForOrigin = new ArrayList<String>();
    String l = bOrigin.readLine();
    
    while (l != null) {
      linesForOrigin.add(l);
      l = bOrigin.readLine();
    }
    bOrigin.close();

    // Pedimos el desplazamiento para el encriptar usando el método César
    int displacement = cesarDisplacement(); 
          
    // Abrimos el fichero a encriptar
    BufferedWriter bFinal = finalBuffer(finalFile);
      
    // Encriptamos el archivo origen y lo escribimos en el fichero final
    for (String line : linesForOrigin) {
      bFinal.write(cesarEncrypt(line, displacement));
    }
    bFinal.close();
      
    System.out.println("Fin del programa.");
  }

  
  /**
   * 
   * @param args
   * @return Nombre del fichero de destino
   * @throws  
   */
  private static String finalFile(String[] args) {
    String file;
    
    if (args.length == 1) { // Fichero de origen y de destino iguales (Solo hay 1 fichero)
      file = args[0];

      // Se perderá el archivo origen
      System.out.println("Solo ha indicado un archivo: " + file);
      System.out.println("Está operación sobreescribirá el contenido de " + file);

      // Pedimos confirmación
      String resp;
      do {
        System.out.print("¿Quiere seguir con la operación? (S/N) ");
        resp = Keyboard.readLine().toUpperCase();
      } while (!resp.equals("S") && !resp.equals("N"));
      if (resp.equals("N")) {
        System.out.println("Saliendo.");
        System.exit(0);
      }
    } else { // Fichero de origen y de destino distintos
      file = args[1];  
    }
    return file;
  }

  /**
   * 
   * @param originFile
   * @return manejador del fichero para lectura
   */
  private static BufferedReader originBuffer(String originFile) {
    try {
      return new BufferedReader(new FileReader(originFile));
    } catch (Exception e) {
      System.err.println("No se ha podido abrir " + originFile);
      System.exit(2);
    }
    return null;
  }
    
  /**
   * Pide el desplazamiento para encriptar usando el método César.
   * @return desplazamiento.
   */
  private static int cesarDisplacement() {
    int displacement = 0;
    boolean stay = true;
    
    do {
      try {
        displacement = Keyboard.readInt("Desplazamiento para la encriptación usando César: "); 
        stay = false;
      } catch (BasicError be) {
        System.err.println("Tiene que introducir un valor entero.");
      }
    } while (stay);
    return displacement;
  }
    
  /**
   * 
   * @param fichero de destino
   * @return manejador del fichero para escritura
   */
  private static BufferedWriter finalBuffer(String finalFile) {
    try {
      return new BufferedWriter(new FileWriter(finalFile));
    } catch (Exception e) {
      System.err.println("No se ha podido abrir para escritura " + finalFile);
      System.exit(3);
    }
    return null;
  }
    
  /**
   * Encripta la cadena que le pasamos como parámetro. 
   * @param line
   * @param displacement
   * @return cadena ya encriptada
   */
  private static String cesarEncrypt(String line, int displacement) {
    String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZáéíóúüñÁÉÍÓÚÜÑ";
    String encryptedLine = "";
    for (char character: line.toCharArray()) {
      char encryptedCharacter = character;
      // Si el carácter es alfabético lo encriptamos
      if (letters.contains(Character.toString(character))) {
        int charIsIn = letters.indexOf(character);
        int encryptedCharIsIn = ((charIsIn + displacement) % letters.length());
        encryptedCharacter = letters.charAt(encryptedCharIsIn);
      } 
      encryptedLine += encryptedCharacter;
    }
    return encryptedLine;
  }
}