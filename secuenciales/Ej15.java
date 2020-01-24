package secuenciales;
/*
Programa para intercambiar valores entre variables.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido las variables
Calculo 
Muestro el resultado
*/
import java.util.Scanner;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double b;
    double c;

    System.out.println("Bienvenido, definirás dos variables A y B y el programa intercambiará sus valores");
    System.out.println("---------------------------------------------------------------------------------");

    System.out.print("Variable a = ");
    a = s.nextDouble();

    System.out.print("Variable b = ");
    b = s.nextDouble();

    //Cálculos
    c = a;
    a = b;
    b = c;

    System.out.println("Ahora a = " + a + " y b = " + b);
  }
}