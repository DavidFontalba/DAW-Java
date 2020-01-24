package secuenciales;
/*
Programa para calcular la raíz cuadrada y la raíz cúbica de un número
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido el número
Calculo 
 Calculo la raiz cuadrada, y para la raiz cubica <-- x ** (1/3)
Muestro el resultado
*/
import java.util.Scanner;

public class Ej13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x;

    System.out.println("Bienvenido a este programa para calcular la raíz cuadrada y la raíz cúbica de un número");
    System.out.println("---------------------------------------------------------------------------------------");

    System.out.print("Dame un número: ");
    x = s.nextDouble();

    System.out.println("La raíz cuadrada de " + x + " es: " + Math.pow(x, (double) 1/2) + " y su raíz cúbica es: " + Math.pow(x, (double) 1/3));
  }
}