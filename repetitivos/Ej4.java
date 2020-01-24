package repetitivos;
/*
Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
pido dos numeros
    para i en el rango entre los dos números
    muestro los numeros con el modulo de 2 == 0
fin
*/
import java.util.Scanner;

public class Ej4 {
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
