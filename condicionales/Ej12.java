package condicionales;
/*
Escribir un programa que lea un e año indicar si es bisiesto. Nota: un 
año es bisiesto si es un número divisible por 4, pero no si es divisible 
por 100, excepto que también sea divisible por 400.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pedimos el año
Comprobamos si es divisible por 4, en ese caso
comprobamos que no sea divisible por cien pero si por 400
Entonces sera bisiesto, sino no.
*/

import java.util.Scanner;

public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para comprobar si un año es bisiesto o no.");
    System.out.println("---------------------------------------------------------------------");

    System.out.print("Inserte un valor numérico para el año: ");
    double year = s.nextDouble();

    // Hacemos las comprobaciones
    if (year/4 == (int)(year/4) ) {
      if (year/100 != (int)(year/100) || year/400 == (int)(year/400)) {
        System.out.println("El año es bisiesto");
      }
    } else {
      System.out.println("El año NO es bisiesto");
    }
  }
}