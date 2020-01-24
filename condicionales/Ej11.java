package condicionales;
/*
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las 
dimensiones de los lados de un triángulo. El programa debe determinar 
que tipo de triángulo es, teniendo en cuenta los siguiente:

Si se cumple Pitágoras entonces es triángulo rectángulo
Si sólo dos lados del triángulo son iguales entonces es isósceles.
Si los 3 lados son iguales entonces es equilátero.
Si no se cumple ninguna de las condiciones anteriores, es escaleno.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pedimos tres números A, B y C que serán los lados de un triángulo
En función de los lados, determinar qué tipo de triángulo es y mostrarlo
al usuario
trect <-- hipotenusa ** 2 == cateto1 ** 2 + cateto2 ** 2
tisos <-- 2 lados iguales
tequi <-- 3 lados iguales
tesca <-- si no se cumple nada de lo otro
*/

import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para determinar el tipo de triángulo según los lados que insertes.");
    System.out.println("---------------------------------------------------------------------------");

    System.out.print("Inserta un valor numérico para uno de los lados del triángulo........: ");
    double a = s.nextDouble();
    System.out.print("Inserta un valor numérico para otro de los lados del triángulo.......: ");
    double b = s.nextDouble();
    System.out.print("Inserta un último valor numérico para otro de los lados del triángulo: ");
    double c = s.nextDouble();

    // Compruebo las condiciones para clasificar el triángulo y muestro el resultado al usuario
    boolean isEquilateral = a == b && b == c;
    boolean isIsosceles = a == b && b != c || a == c && c != b || b == c && b != a;
    boolean isRight = Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2) || Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2) || Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2);

    // Comprobamos que sea una sola letra y que además sea mayúscula
    if (isEquilateral) {
      System.out.println("El triángulo es equilátero.");
    } else if (isIsosceles) {
      System.out.println("El triángulo es isósceles.");
    } else if (isRight) {
      System.out.println("El triángulo es rectángulo.");
    } else {
      System.out.println("El triángulo es escaleno.");
    }
  }
}