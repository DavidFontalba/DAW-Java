package condicionales;
/*
Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
Autor: David Galván Fontalba
Fecha: 7/11/2019

Algoritmo
Pedir dos números, a y b.
Comparar los dos números y afirmar o negar si el primero es mayor.
*/
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para saber, entre dos números, si el primero es mayor al segundo.");
    System.out.println("---------------------------------------------------------------------------------------------");

    System.out.print("Introduce el primer número.: ");
    double a = s.nextDouble();

    System.out.print("Introduce el segundo número: ");
    double b = s.nextDouble();

    //Comparamos los números y mostramos el resultado en función del resultado de la comparación
    if (a > b) {
      System.out.println("El primer número es mayor que el segundo.");
    } else if (b > a) {
      System.out.println("El primer número no es mayor que el segundo, es menor.");
    } else {
      System.out.println("El primer número no es mayor que el segundo, es igual.");
    }
  }
}