package secuenciales;
/*
Programa para invertir las posiciones de un número de dos cifras
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido el número
Calculo 
Muestro el resultado
*/
import java.util.Scanner;

public class Ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Bienvenido a este programa para invertir las posiciones de un número de dos cifras");
    System.out.println("----------------------------------------------------------------------------------");

    System.out.print("Dame un número de dos cifras: ");
    num = s.nextInt();

    //Cálculos
    String inverse = (num - ( (int)(num*0.1) * 10)) + "" + ( (int)(num*0.1));

    System.out.println("El inverso del número es " + inverse);
  }
}