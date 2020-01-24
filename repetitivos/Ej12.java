package repetitivos;
/*
Pide una cadena y dos caracteres por teclado (valida que sea un carácter),
sustituye la aparición del primer carácter en la cadena por el segundo carácter.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido una cadena y dos carácteres, si es más de un carácter se lo vuelvo a pedir,
y distintos, si los pusiera igual, se los vuelvo a pedir
creo una auxiliar i para el bucle
creo una cadena que sera el resultado
mientras i sea menor que la longitud de la cadena
  si el caracter en posicion i es igual al primer caracter
    el caracter en posicion i de nuestra frase será sumo a la nueva frase el segundo caracter
  si no
    sumo a la nueva frase el caracter en posicion i
muestro el resultado
*/
import java.util.Scanner;

public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para sustituir un carácter que aparezca en una frase por otro distinto.");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.print("Inserta la cadena a la que le quieres cambiar un carácter: ");
    String ourString = s.nextLine();

    //Pido los caracteres, validando que son solo 1 y que son distintos, porque si son iguales la solución es la misma
    String charOne = "aa";
    String charTwo = "aa";

    while (charOne.equals(charTwo)) { //Carácteres distintos
      while (charOne.length() != 1) { //Un solo carácter
        System.out.println("Introduce un carácter, será aquel que quieres quitar: ");
        charOne = s.nextLine();
        if (charOne.length() != 1) {
          System.out.println("Tiene que ser un sólo carácter.");
        }
      }
      while (charTwo.length() != 1) {
        System.out.println("Introduce un carácter, será aquel por el que quieres sustituir: ");
        charTwo = s.nextLine();
        if (charTwo.length() != 1) {
          System.out.println("Tiene que ser un sólo carácter.");
        }
      }
      if (charOne.equals(charTwo)) {
        System.out.println("Si los carácteres son el mismo, el resultado es la frase inicial.\n Tienen que ser distintos, vuelve a introducirlos."); 
      }
    }

    /*
    Empiezo el bucle,
    mientras i sea menor que la longitud de la cadena
    cada vez que el caracter en posición i sea igual a el caracter 
    uno cambiamos el caracter en esa posición por el dos
    */
    int i = 0;
    String newString= "";
    while (i < ourString.length()) {
      if (ourString.charAt(i) == charOne.charAt(0)) {
        newString = newString + charTwo;
      } else {
        newString = newString + Character.toString(ourString.charAt(i));
      }
      i++;
    }
    System.out.println("La frase, cambiando el carácter '"+charOne+"' por el carácter '"+charTwo+"' es:");
    System.out.println(newString);
  }
}

