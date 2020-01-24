package secuenciales;
/*
Programa para calcular la nota final de la asignatura Algoritmos con los porcentajes 
  55% del promedio de sus tres calificaciones parciales.
  30% de la calificación del examen final.
  15% de la calificación de un trabajo final.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido las tres calificaciones, la del examen final y la del trabajo.
Calculo 
  calificaciones * 0.55 + examen final * 0.3 + trabajo * 0.15
Muestro el resultado
*/
import java.util.Scanner;

public class Ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double partial1;
    double partial2;
    double partial3;
    double finalTest;
    double finalWork;

    System.out.println("Bienvenido a este programa para calcular tu nota en la asignatura Algoritmos");
    System.out.println("----------------------------------------------------------------------------");

    System.out.print("Introduce con un valor numérico la nota de tu primer parcial.: ");
    partial1 = s.nextDouble(); //Leer el primer parcial

    System.out.print("Introduce con un valor numérico la nota de tu segundo parcial: ");
    partial2 = s.nextDouble(); //Leer el segundo parcial

    System.out.print("Introduce con un valor numérico la nota de tu tercer parcial.: ");
    partial3 = s.nextDouble(); //Leer el tercer parcial

    System.out.print("Introduce con un valor numérico la nota de tu examen final...: ");
    finalTest = s.nextDouble(); //Leer el examen

    System.out.print("Introduce con un valor numérico la nota de tu trabajo final..: ");
    finalWork = s.nextDouble(); //Leer el trabajo

    //Cálculos
    double total = ((partial1 + partial2 + partial3) / 3) * 0.55 + finalTest * 0.3 + finalWork * 0.15;

    System.out.println("Tu nota final en la asignatura de Algoritmos es un " + total);
  }
}