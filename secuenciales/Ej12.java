package secuenciales;
/*
Programa para medir la distancia entre dos puntos
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido dos puntos, cuatro coordenadas
Calculo 
 Raiz cuadrada de (x2-x1)^2+(y2-y1)^2
Muestro el resultado
*/
import java.util.Scanner;

public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x1;
    double y1;
    double x2;
    double y2;

    System.out.println("Bienvenido a este programa para medir la distancia entre dos puntos");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("Dame la primera coordenada, x, del primer punto: ");
    x1 = s.nextDouble();

    System.out.print("Dame la segunda coordenada, y, del primer punto: ");
    y1 = s.nextDouble();

    System.out.print("Dame la primera coordenada, x, del segundo punto: ");
    x2 = s.nextDouble();

    System.out.print("Dame la segunda coordenada, y, del segundo punto: ");
    y2 = s.nextDouble();

    //Cálculo
    double distance = Math.abs(Math.pow( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 1/2));

    System.out.println("La distancia entre los puntos es " + distance);
  }
}