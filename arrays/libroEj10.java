package arrays;
/*
Ejercicio 10
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario

Autor: David Galván Fontalba
Fecha: 26/11/2019

Algoritmo:
Bucle que se haga 20 veces
  Genero 20 numeros aleatorios entre 0 y 100 y los meto en un array
  Ordeno, si es par a la posicion i y el que había en i, a la posición j
*/
import java.util.Scanner;

public class libroEj10 {
  public static void main(String[] args) {
    int random[] = new int[20];

    System.out.println("Bienvenido a este programa que genera 20 numeros aleatorios entre el 0 y el 100 y ordena los pares al principio.");
    for (int i=0;i<20;i++) {
      random[i] = (int)(Math.random()*101);
    }
    System.out.println("El array generado aleatoriamente es: ");
    for (int i=0;i<20;i++) {
      System.out.print(random[i]+", ");
    }
    System.out.println();

    //Ordeno los números
    for (int i=0; i<20; i++) {
      for (int j=i+1; j<20; j++) {
        if(random[i]%2!=0) {
          int auxiliar=random[i];
          random[i] = random[j];
          random[j] = auxiliar;
        }
      }
    }
    System.out.println("El array ordenado es: ");
    for (int i=0;i<20;i++) {
      System.out.print(random[i]+", ");
    }
  }
}