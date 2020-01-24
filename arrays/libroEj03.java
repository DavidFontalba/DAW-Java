package arrays;
/*
Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.

Autor: David Galván Fontalba
Fecha: 26/11/2019

*/
import java.util.Scanner;

public class libroEj03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int inverse[] = new int[10];
    System.out.println("Bienvenido a este programa para que introduzcas diez números y te los escriba en el orden contrario.\n");
    for (int i=0; i< inverse.length; i++){
      System.out.println("Introduce el "+(i+1)+"º");
      inverse[i] = s.nextInt();
    }
    System.out.println("\nAhora al revés");
    for (int i=inverse.length-1; i>=0; i--){
      System.out.println(inverse[i]);
    }
  }
}