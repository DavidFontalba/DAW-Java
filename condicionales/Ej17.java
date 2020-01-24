package condicionales;
/*
Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un 
dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.

Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: ERROR: número incorrecto..

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Pido el número inicial
Muestro el resultado según el número introducido por el usuario
*/

import java.util.Scanner;

public class Ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para decirte la cara opuesta de un dado de seis caras.");
    System.out.println("---------------------------------------------------------------------------------");

    System.out.print("¿Qué número ha salido en el dado?");
    int number = s.nextInt();
    

    // Muestro el resultado de la cara opuesta
    if (number == 1) {
      System.out.println("La cara opuesta de tu número es el seis.");
    } else if (number == 2) {
      System.out.println("La cara opuesta de tu número es el cinco.");
    } else if (number == 3) {
      System.out.println("La cara opuesta de tu número es el cuatro.");
    } else if (number == 4) {
      System.out.println("La cara opuesta de tu número es el tres.");
    } else if (number == 5) {
      System.out.println("La cara opuesta de tu número es el dos.");
    } else if (number == 6) {
      System.out.println("La cara opuesta de tu número es el uno.");
    } else {
      System.out.println("ERROR: El número "+number+" es incorrecto.");
    }
  }
}
