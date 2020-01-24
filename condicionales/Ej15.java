package condicionales;
/*
El director de una escuela está organizando un viaje de estudios, y requiere 
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía 
de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 
alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, 
el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, 
el costo de la renta del autobús es de 4000 euros, sin importar el número 
de alumnos. 

Realice un algoritmo que permita determinar el pago a la compañía de 
autobuses y lo que debe pagar cada alumno por el viaje.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pido el número de alumnos que van a ir
si numeroalumnos mayor o igual que 100 <-- 65 euros por alumno
si numeroalumnos está entre 50 y 99 <-- 70 euros por alumno
si numeroalumnos está entre 30 y 49 <-- 95 euros por alumno
si numeroalumnos es menor que 30 <-- son 4000 euros
Muestro el resultado (precio por alumno y total)
*/

import java.util.Scanner;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para calcular el precio del autobus para viajes de estudios.");
    System.out.println("---------------------------------------------------------------------------------------");

    System.out.print("Inserta un valor numérico para el número de alumnos que van a utilizar el autobús: ");
    int numberOfStudents = s.nextInt();
    

    // Compruebo en qué varemo se encuentran y calculo y muestro el resultado
    
    if (numberOfStudents >= 100) {
      System.out.println("El autobús costará un total de "+(numberOfStudents * 65)+" euros, 65 euros por alumno.");
    } else if (numberOfStudents > 49 && numberOfStudents <= 99) {
      System.out.println("El autobús costará un total de "+(numberOfStudents * 70)+" euros, 70 euros por alumno.");
    } else if (numberOfStudents >= 30 && numberOfStudents <= 49) {
      System.out.println("El autobús costará un total de "+(numberOfStudents * 95)+" euros, 95 euros por alumno.");
    } else if (numberOfStudents > 0 && numberOfStudents < 30) {
      System.out.println("El autobús costará un total de 4000 euros, "+(4000 / numberOfStudents)+" euros por alumno.");
    } else if (numberOfStudents <= 0) {
      System.out.println("Para calcular las tarifas para viajes de estudios es necesario que asistan alumnos.");
    }
  }
}