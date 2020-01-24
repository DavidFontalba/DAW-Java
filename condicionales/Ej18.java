package condicionales;
/*
Realiza un programa que pida el día de la semana (del 1 al 7) y 
escriba el día correspondiente. Si introducimos otro número nos da un error.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Pido el número del 1 al 7 para el dia de la semana
Muestro el resultado del día considerando el 1 como lunes y el 7 como domingo
*/

import java.util.Scanner;

public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para convertir el número del día de la semana al nombre del día correspondiente.");
    System.out.println("-----------------------------------------------------------------------------------------------------------");

    System.out.print("Introduce un valor numérico para el día de la semana (del 1 al 7): ");
    int dayNumber = s.nextInt();
    

    // Muestro el resultado correspondiente
    if (dayNumber == 1) {
      System.out.println("El día es lunes.");
    } else if (dayNumber == 2) {
      System.out.println("El día es martes.");
    } else if (dayNumber == 3) {
      System.out.println("El día es miércoles.");
    } else if (dayNumber == 4) {
      System.out.println("El día es jueves.");
    } else if (dayNumber == 5) {
      System.out.println("El día es viernes.");
    } else if (dayNumber == 6) {
      System.out.println("El día es sábado.");
    } else if (dayNumber == 7) {
      System.out.println("El día es domingo.");
    } else {
      System.out.println("ERROR: El número "+dayNumber+" no es válido.");
    }
  }
}
