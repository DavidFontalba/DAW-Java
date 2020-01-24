package condicionales;
/*
Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
Autor: David Galván Fontalba
Fecha: 7/11/2019

Algoritmo:
Pido al usuario una cadena
Compruebo que lo que el usuario ha introducido es UNA letra, y mayúscula
para ello comprobaremos que el primer carácter de la cadena es igual a
la cadena entera <-- len(cadena) sera igual a 1, y posteriormente que sea
mayor o igual que A y menor o igual que Z
*/
import java.util.Scanner;

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para que insertes una cadena y comprobar si es una letra mayúscula.");
    System.out.println("-----------------------------------------------------------------------------------------------");

    System.out.print("Escribe: ");
    String ourString = s.nextLine();

    // Comprobamos que sea una sola letra y que además sea mayúscula
    if (ourString.length() == 1 && (ourString.compareTo("A") > 0 && ourString.compareTo("Z") < 0 )) {
      System.out.println("Has insertado una única letra mayúscula.");
    } else {
      System.out.println("No has insertado una única letra mayúscula.");
    }
  }
}