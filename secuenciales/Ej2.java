package secuenciales;
/*
Programa para calcular el perímetro de un rectángulo
Autor: David Galván Fontalba
Fecha: 5/11/2019

Algoritmo

Pedimos la base y la altura
perimetro <-- 2 * (base + altura)
Mostramos el resultado
*/
public class Ej2 {
  public static void main(String[] args) {
    double base;
    double height;
    double perimeter;

    System.out.println("Bienvenido a este programa con el que calcular el perímetro de un rectángulo");
    System.out.println("----------------------------------------------------------------------------");

    System.out.println("\nDame un valor numérico para la base: ");
    base = Double.parseDouble(System.console().readLine()); //Leer la base

    System.out.println("Ahora otro para la altura: ");
    height = Double.parseDouble(System.console().readLine()); //Leer la altura

   perimeter = 2 * (base + height); //Cálculo del perimetro

    System.out.println("El perímetro del rectángulo es: " + perimeter);
  }
}