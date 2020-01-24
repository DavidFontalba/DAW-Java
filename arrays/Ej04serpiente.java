package arrays;
/*
4. Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. 
La cabeza se representará con el carácter @ y se debe colocar  exactamente en la posición 13 
(con 12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: 
se generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter 
se coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a 
la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el 
usuario introducirá un dato correcto.

Ejemplo:

Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
            @
            *
             *
             *
             *
            *

Autor: David Galván Fontalba
Fecha: 24/11/2019

Algoritmo:
Pido la longitud de la serpiente
Escribo la cabeza: 
            @(con 12 espacios antes)
posicion <-- 12 (sitio donde esta la cabeza)
mientras i sea menor que la longitud
  genero un numero aleatorio entre 0, 1 y 2.
  si es 0
    posicion--
    bucle "posicion-1" veces
      escribo un espacio a nueva cadena
    escribo * a nueva cadena
    Muestro nueva cadena
  si no y es 1
    bucle "posicion-1" veces
      escribo un espacio a nueva cadena
    escribo * a nueva cadena
    Muestro nueva cadena
  si no y es 2
    posicion++
    bucle "posicion-1" veces
      escribo un espacio a nueva cadena
    escribo * a nueva cadena
    Muestro nueva cadena
*/
import java.util.Scanner;

public class Ej04serpiente {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int lenght;
    int position;
    int numRandom;
    String serpentBuilder;

    System.out.println("Bienvenido a este programa para generar una serpiente aleatoria.");
    System.out.println("----------------------------------------------------------------\n");

    System.out.print("Inserta cuán larga será la serpiente: ");
    lenght = s.nextInt();

    System.out.println("            @");
    position = 12; //Número de espacios que tiene la cabeza

    for (int i=1; i<lenght; i++) {
      numRandom = (int) (Math.random()*3);
      
      if (numRandom == 0) { //Uno a la izquierda
        serpentBuilder = "";
        position--;
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);

      } else if (numRandom == 1) { //Mantiene el sitio
        serpentBuilder = "";
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);
        
      } else { //Uno a la derecha
        serpentBuilder = "";
        position++;
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);
      }
    }
  }
}