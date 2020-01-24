package repetitivos;
/*
Escribe un programa que pida el limite inferior y superior de un intervalo.
Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0.
Cuando termine el programa dará las siguientes informaciones:

La suma de los números que están dentro del intervalo (intervalo abierto).
Cuantos números están fuera del intervalo.
Informa si hemos introducido algún número igual a los límites del intervalo.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Pido un intervalo downLimit y upLimit <-- si downLimit > upLimit lo vuelvo a pedir
Pido que introduzca números hasta que escriba el 0 para parar.
Muestro al usuario: Suma de los números que ha introducido que esten dentro del intervalo
                    Cuántos números ha introducido pero están fuera del intervalo
                    Si ha introducido un número igual a los límites del intervalo
*/
import java.util.Scanner;

public class Ej5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Bienvenido a este programa para decirte todos los números pares entre dos números.");
    System.out.println("----------------------------------------------------------------------------------");
    
    //Pido rango
    System.out.print("Inserta un primer número para establecer el inicio del rango: ");
    int start = s.nextInt();
    System.out.print("Inserta un segundo valor para establecer el final del rango: ");
    int end = s.nextInt();

    //Crear un bucle asignándole a i cada valor del rango
    for (int i = start;i <= end;i++) {
      if (i%2 == 0) { //Solo muestro los números pares en nuestro rango
         System.out.println(i);
      }
    }
    System.out.println("¡Ya está! ¡Hasta pronto!");
  }
}
