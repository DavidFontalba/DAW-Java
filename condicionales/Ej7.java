package condicionales;
/*
Realiza un algoritmo que calcule la potencia, para ello pide por teclado
la base y el exponente. Pueden ocurrir tres cosas:

El exponente sea positivo, sólo tienes que imprimir la potencia.
El exponente sea 0, el resultado es 1.
El exponente sea negativo, el resultado es 1/potencia con el exponente 
positivo.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pido al usuario una potencia, dividida en dos variables: base y exponente
Si es positivo inserto la potencia, si el exponente es 0 el resultado es 1
y si el exponente es negativo el resultado será uno entre la potencia con
el exponente positivo
*/
import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para calcular una potencia.");
    System.out.println("-------------------------------------------------------");

    System.out.print("Inserta la base de la potencia.....: ");
    double base = s.nextDouble();
    System.out.print("Inserta el exponente de la potencia: ");
    double exp = s.nextDouble();

    // Comprobamos que sea una sola letra y que además sea mayúscula
    if (exp > 0) {
      System.out.println("El resultado de la potencia es " + Math.pow(base, exp));
    } else if (exp < 0) {
      System.out.println("El resultado de la potencia es " + 1 /  Math.pow(base, Math.abs(exp)) );
    } else {
      System.out.println("El resultado de la potencia es 1");
    }
  }
}