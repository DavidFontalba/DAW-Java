package arrays;
/*
3. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código 
ascii entre el 32 y el 126. Puedes hacer casting con (char) para  convertir un entero en un carácter.

Voy a mostrar los carácteres en la misma línea, uno seguido de otro.

Autor: David Galván Fontalba
Fecha: 23/11/2019

Algoritmo:
un bucle que se haga 50 veces
  genero un numero entre el 32 y el 126
  muestro ese numero convertido a caracter
*/
import java.util.Scanner;

public class Ej03matrix {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numRandom;
    int numOfChars;

    System.out.println("Bienvenido a este programa para generar carácteres aleatorios.");
    System.out.println("--------------------------------------------------------------\n");

    System.out.print("\nIntroduce el número de carácteres que quieres generar: ");
    numOfChars = s.nextInt();

    for (int i=0; i<numOfChars; i++) {
      numRandom = (int)(Math.random()*95 +32); //Utilizo el 95 porque 95+32=127
      System.out.print( (char) numRandom);
    }

    System.out.println("\n\n ¡Ya está!");
  }
}