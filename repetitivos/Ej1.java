package repetitivos;
/*
Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el
introducido, además de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado),
si se llega al limite de intentos te muestra el número que había generado.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Generar un número aleatorio entero del 1 al 100 <- numRandom
pido un número <- numGuess
mientras que numRandom y numGuess sean distintos y tenga intentos
    muestro si numRandom es menor o mayor que numGuess y resto un intento (empiezas con 10) y lo muestro
si se acierta el número, te dice en cuántos intentos lo has acertado.
si llegas al limite de intentos muestra numRandom
*/
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tries = 10;     //Establezco los intentos de inicio por defecto
    int numGuess = -1;  //Doy valor a una variable que usará el usuario y genero un número aleatorio
    int numRandom = (int)Math.floor( Math.random()*(1-(100+1))+(100) );
    
    System.out.println("Bienvenido a este programa que consiste en que adivines un número generado aleatoriamente.");
    System.out.println("------------------------------------------------------------------------------------------");

    while (numGuess != numRandom && tries != 0) {
      --tries;
      //Pido un número al usuario
      System.out.println("Introduce un valor numérico entero entre el 1 y el 100, adivina en cuál estoy pensando: ");
      numGuess = s.nextInt();
      if (numGuess <= 0 || numGuess >= 101) {
        System.out.println("El número tiene que estar entre 1 y 100.");
      } else if (numGuess < numRandom) {
        System.out.println("Pienso en un número mayor.");
      } else if (numGuess > numRandom) {
        System.out.println("Pienso en un número menor.");
      }
      if (tries != 1) {
        System.out.println("Te quedan "+tries+" intentos.");
      } else if (tries == 1) {
        System.out.println("Te queda "+tries+" intento.");
      }
    } //Fin del bucle
    
    if (tries == 0) {
      System.out.println("Lo siento. El número era "+numRandom+", otra vez será.");
    } else if (numGuess == numRandom) {
      System.out.println("¡Correcto!");
    }
    if (tries != 1) {
        System.out.println("Aún tenías "+tries+" intentos.");
    } else if (tries == 1) {
        System.out.println("Te quedaba "+tries+" intento.");
    }
  }
}
