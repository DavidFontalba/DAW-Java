package repetitivos;
/*
Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y
‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce
un espacio

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
doy un valor cualquiera a userChar
mientras userChar sea distinto a un espacio
    pido insertar userChar
    si es a, e, i, o, u
        imprimir 'VOCAL'
    si no
        imprimir ' NO VOCAL'
*/
import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Bienvenido a este programa para decirte si los carácteres que introduces son vocales o no.");
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.println("Inserta un espacio en cualquier momento para salir del programa.");
    // Establezco la variable userChar y ourChar para poder inicializar el bucle
    String userChar = "A";
    char ourChar = userChar.charAt(0);
    
    //Bucle hasta que escriba espacio para salir
    while (ourChar!=' ') {
      //Pido carácter
      System.out.println("Inserta 1 carácter: ");
      userChar = s.nextLine();
      ourChar = userChar.charAt(0);
      
      if (userChar.length() != 1) {
        System.out.println("Solo debes introducir un carácter.");
      } else if (userChar.equals("a") || userChar.equals("A") || userChar.equals("e") || userChar.equals("E") || userChar.equals("i") || userChar.equals("I") || userChar.equals("o") || userChar.equals("O") || userChar.equals("u") || userChar.equals("U") ) {
        System.out.println("'VOCAL'");
      } else if (ourChar==' ') {
        System.out.println("¡Hasta pronto!");
      } else {
        System.out.println("'NO VOCAL'");
      }
    }
  }
}
