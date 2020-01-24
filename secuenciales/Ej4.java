package secuenciales;
/*
Programa que hace una suma, una resta, una división y una multiplicación dados dos números
Autor: David Galván Fontalba
Fecha: 5/11/2019

Algoritmo

Pido dos números a y b
Calculamos
Mostramos los distintos resultados
*/
public class Ej4 {
  public static void main(String[] args) {
    double a;
    double b;

    System.out.println("Bienvenido, este programa realizará una suma, una resta, una división y una multiplicación con los números que me des.");
    System.out.println("----------------------------------------------------------------------------------------------------------------------");

    System.out.println("Dame un valor numérico para el primer número: ");
    a = Double.parseDouble(System.console().readLine()); //Leer a

    System.out.println("Dame otro número: ");
    b = Double.parseDouble(System.console().readLine()); //Leer b

    System.out.println("\nAquí tiene los resultados:");
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " * " + b + " = " + (a * b));
  }
}