package repetitivos;
/*
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido un cadena
Pido un caracter
contador en 0
Hago una variable que empieza siendo 0, i
mientras i <= len(cadena)
    si cadena[i] == caracter
        contador +1
    si no
        i +1
fin
*/
import java.util.Scanner;

public class Ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para que introduzcas una frase y un carácter, y decirte cuántas veces aparece ese carácter en tu frase.");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

    System.out.print("Escribe lo que quieras: ");
    String ourString = s.nextLine();

    System.out.print("Escribe un solo carácter: ");
    String ourChar = s.nextLine();

    int counter = 0;
    int i = 0;
    while (i < ourString.length()) {
      if ( ourString.charAt(i) == ourChar.charAt(0) ) {
        counter++;
      }
      i++;
    }
    System.out.println("El carácter "+ourChar+" aparece "+counter+" veces.");
  }
}

