package secuenciales;
/*
Programa para transformar grados Fahrenheit a grados Celsius
Autor: David Galván Fontalba
Fecha: 5/11/2019

Algoritmo
 
Pido grados Fahrenheit
Cálculo celsius <-- (fah - 32) / (9/5)
Muestro los grados Celsius
*/
public class Ej5 {
  public static void main(String[] args) {
    double fah;
    double celsius;

    System.out.println("Bienvenido a este programa para convertir grados Fahrenheit a grados Celsius");
    System.out.println("----------------------------------------------------------------------------");

    System.out.print("Dame un valor numérico en grados Fahrenheit: ");
    fah = Double.parseDouble(System.console().readLine()); //Leer fah

    celsius = (fah - 32) / (9 / 5); //Calculo los grados celsius

    System.out.println(fah + "º Fahrenheit son " + celsius + "º Celsius");
  }
}