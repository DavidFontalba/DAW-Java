package condicionales;
/*
Escribe un programa que lea un número e indique si es par o impar.
Autor: David Galván Fontalba
Fecha: 7/11/2019

Algoritmo:
Pedimos un número, si la división entera entre 2 y la división normal entre 2 es igual será par.
Comprobamos si el número es par
*/
import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para saber si un número es par o impar.");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("Introduce un número.: ");
    double a = s.nextDouble();

    // Comprobamos si es par o impar y mostramos el resultado
    if (a/2 == (int)(a/2)) {
      System.out.println("El número que has ingresado es par.");
    }
    else {
      System.out.println("El número que has ingresado es impar.");
    }
  }
}