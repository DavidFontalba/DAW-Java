package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.BasicError;

/**
 * Clase para pedir datos al usuario por teclado.
 * @author David Galván Fontalba
 * @version v1
 */
public class Keyboard {
  static Scanner myScanner = new Scanner(System.in);
  /**
   * Lee enteros
   * @return Número entero
   * @throws BasicError
   */
  public static int readInt() throws BasicError {
    try {
      return myScanner.nextInt();
    } catch (InputMismatchException ime) {
      myScanner.nextLine();
      throw new BasicError("\nHas introducido un argumento inválido.");
    }
  }
  
  /**
   * Lee enteros y escribe un mensaje
   * @param message
   * @return Número entero
   * @throws BasicError
   */
  public static int readInt(String message) throws BasicError {
    System.out.print(message);
    return readInt();
  }
  
  /**
   * Para leer números con decimales
   * @return Número flotante
   * @throws BasicError
   */
  public static double readDouble() throws BasicError {
    try {
      return myScanner.nextDouble();
    } catch (InputMismatchException ime) {
      myScanner.nextLine();
      throw new BasicError("\nHas introducido un argumento inválido.");
    }
  }
  
  /**
   * Para leer números con decimales y escribir un mensaje
   * @param message
   * @return Número flotante
   * @throws BasicError
   */
  public static double readDouble(String message) throws BasicError {
    System.out.print(message);
    return readDouble();
  }
  
  
  /**
   * Para leer cadenas
   * @return Cadena
   * @throws BasicError
   */
  public static String readLine() {
    myScanner.nextLine();
    return myScanner.nextLine();
  }
  
  /**
   * Para leer cadenas y escribir un mensaje
   * @param message
   * @return Cadena
   * @throws BasicError
   */
  public static String readLine(String message) throws BasicError {
    System.out.print(message);
    return readLine();
  }
  
}
