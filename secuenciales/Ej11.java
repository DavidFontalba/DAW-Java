package secuenciales;
/*
Programa para medir la distancia entre dos números
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido dos números
Calculo 
  Valor absoluto de a - b
Muestro el resultado
*/
import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double first;
    double second;

    System.out.println("Bienvenido a este programa para medir la distancia entre dos números");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("Inserte un primer número: ");
    first = s.nextDouble(); //Leer primer numero

    System.out.print("Inserte otro número más: ");
    second = s.nextDouble(); //Leer segundo numero

    System.out.println("La distancia entre " + first + " y " + second + " es: " + Math.abs(first-second));
  }
}