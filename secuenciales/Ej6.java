package secuenciales;
/*
Programa para hacer una media entre tres números
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo

Pido tres números a, b y c.
Cálculo de la media
Muestro el resultado
*/

import java.util.Scanner;

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    System.out.println("Bienvenido a este programa para hacer una media entre tres números");
    System.out.println("------------------------------------------------------------------");

    System.out.print("Dame el primer número: ");
    a = s.nextDouble(); //Leer a
    System.out.print("Dame el segundo número: ");
    b = s.nextDouble(); //Leer b
    System.out.print("Dame el tercer número: ");
    c = s.nextDouble(); //Leer c
    System.out.println("La media de los números es: "+ ((a + b + c) / 3));
  }
}