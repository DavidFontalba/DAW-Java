package arrays;
/*
2. Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine 
de generar números hasta que no saque el 24. El  programa deberá decir al final cuántos números se han generado.

Autor: David Galván Fontalba
Fecha: 23/11/2019

Algoritmo:
Genero un numero aleatorio
i = 1
Mientras el número aleatorio sea distinto a 24:
  Genero un numero aleatorio
  i++
Muestro cuántos numeros he generado mostrando i
*/
public class Ej02numero24 {
  public static void main(String[] args) {
    int numRandom;
    int i = 1;

    System.out.println("Bienvenido a este programa para generar un número aleatorio, y que parará cuando éste sea 24.");
    System.out.println("---------------------------------------------------------------------------------------------");

    numRandom = (int) (Math.random()*101);
    if (numRandom % 2 != 0) {
      numRandom--;
    }

    while (numRandom != 24) {
      numRandom = (int) (Math.random()*101);
      if (numRandom % 2 != 0) {
        numRandom--;
      }
      i++;
    }
    System.out.println("¡Ya está! Se han generado "+i+" números hasta alcanzar el 24.");
  }
}