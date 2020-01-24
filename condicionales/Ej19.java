package condicionales;
/*
Escribe un programa que pida un número entero entre uno y doce 
e imprima el número de días que tiene el mes correspondiente.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Pido un número del 1 al 12 para el mes
los meses 1,3,5,7,8,10,12 tienen 31 días
los meses 4,6,9,11 tienen 30 días
el mes 2 tiene 28 días
Muestro el resultado al comprobar de qué mes se trata
*/

import java.util.Scanner;

public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para saber el número de días que tiene un mes.");
    System.out.println("-------------------------------------------------------------------------");

    System.out.print("Introduce un valor numérico para el mes (del 1 al 12): ");
    int monthNumber = s.nextInt();
    

    // Muestro el resultado correspondiente
    
    if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
      System.out.println("El mes "+monthNumber+" tiene 31 días.");
    } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 ||  monthNumber == 11) {
      System.out.println("El mes "+monthNumber+" tiene 30 días.");
    } else if (monthNumber == 2) {
      System.out.println("El mes 2 tiene 28 días.");
    } else {
      System.out.println("ERROR: El número "+monthNumber+" no es válido.");
    }
  }
}
