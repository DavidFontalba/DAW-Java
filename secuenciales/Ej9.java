package secuenciales;
/*
Programa para averiguar cuanto tendras que pagar si te descuentan un 15%
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido cuánto se ha gastado en total comprando
Calculo el precio con el descuento aplicado
Muestro el resultado
*/
import java.util.Scanner;

public class Ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double buy;
    System.out.println("Bienvenido a este programa para aplicarle un 15% de descuento a tu compra y saber cuánto valdrá");
    System.out.println("-----------------------------------------------------------------------------------------------");

    System.out.print("Introduce, usando un valor numérico, y en euros, cuánto vale el total de tu compra: ");
    buy = s.nextDouble(); //Leer la compra

    //Cálculos
    double total = buy - (buy * 0.15);

    System.out.println("Con el descuento aplicado, ¡tan solo tendrás que pagar " + total + " euros!");
  }
}