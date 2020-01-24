package arrays;
/*
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.

Autor: David Galván Fontalba
Fecha: 26/11/2019

*/
import java.util.Scanner;

public class libroEj05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero[] = new int[10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    System.out.println("Bienvenido a este programa para decirte el máximo y el mínimo de 10 números que introduzcas.\n");

    for (int i = 0; i<10; i++) {
      System.out.print("Introduce el "+(i+1)+"º: ");
      numero[i] = s.nextInt();

      if (numero[i] > max) {  //Máximo
        max = numero[i];
      }
      if (numero[i] < min) {  //Mínimo
        min = numero[i];
      }
    }
    for (int i=0; i<10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == max) {  //Máximo
        System.out.print(" <-- Máximo");
      }
      if (numero[i] == min) {  //Mínimo
        System.out.print(" <-- Mínimo");
      }
      System.out.println();
    }
  }
}