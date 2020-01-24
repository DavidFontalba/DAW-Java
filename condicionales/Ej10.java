package condicionales;
/*
Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

exteriores
tangentes exteriores
secantes
tangentes interiores
interiores
concéntricas

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pido las variables de los puntos y radios de la circunferencia 1 y después de la 2
Creo una variable para la distancia entre dos puntos <-- Raiz cuadrada de (x2-x1)^2+(y2-y1)^2
Compruebo en qué estado clasificar las circunferencias

exteriores              <-- Distancia entre los centros mayor que la suma de sus radios
tangentes exteriores    <-- La suma de los radios es igual a la distancia de los centros
secantes                <-- Distancia entre los centros menor que la suma de sus radios
tangentes interiores    <-- Distancia entre los centros es igual que la diferencia de sus radios
interiores              <-- Distancia entre los centros es menor que la diferencia de las longitudes de sus radios
concéntricas            <-- El mismo centro pero distintos radios
*/

import java.util.Scanner;

public class Ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para clasificar el estado de dos circunferencias");
    System.out.println("---------------------------------------------------------------------------");

    System.out.print("Inserta un valor númerico para la coordenada x de la primera circunferencia: ");
    double x1 = s.nextDouble();
    System.out.print("Inserta un valor númerico para la coordenada y de la primera circunferencia: ");
    double y1 = s.nextDouble();
    System.out.print("Inserta un valor númerico para el radio de la primera circunferencia.......: ");
    double r1 = s.nextDouble();

    System.out.print("Inserta un valor númerico para la coordenada x de la segunda circunferencia: ");
    double x2 = s.nextDouble();
    System.out.print("Inserta un valor númerico para la coordenada y de la segunda circunferencia: ");
    double y2 = s.nextDouble();
    System.out.print("Inserta un valor númerico para el radio de la segunda circunferencia.......: ");
    double r2 = s.nextDouble();

    // Variable para calcular la distancia entre dos números
    double dist = Math.abs( Math.pow( Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2), 1/2) );

    // Comprobamos que sea una sola letra y que además sea mayúscula
    if (dist > (r1 + r2)) {
      System.out.println("Las circunferencias son exteriores.");
    } else if (x1 == x2 && y1 == y2 && r1 == r2) {
      System.out.println("Las circunferencias son la misma.");
    } else if (dist == (r1 + r2)) {
      System.out.println("Las circunferencias son tangentes exteriores.");
    } else if (x1 == x2 && y1 == y2 && r1 != r2) {
      System.out.println("Las circunferencias son concéntricas.");
    } else if (dist < (r1 + r2)) {
      System.out.println("Las circunferencias son secantes.");
    } else if (dist == Math.abs(r1 - r2)) {
      System.out.println("Las circunferencias son tangentes interiores.");
    } else if (dist < Math.abs(r1 - r2)) {
      System.out.println("Las circunferencias son interiores.");
    } else {
      System.out.println("Las circunferencias no pueden ser clasificadas en ninguno de los estados de este programa.");
    }
  }
}