package repetitivos;
/*
Introducir una cadena de caracteres e indicar si es un palíndromo.
Una palabra palíndroma es aquella que se lee igual adelante que atrás.

Autor: David Galván Fontalba
Fecha: 12/11/2019

Algoritmo:
Pido una cadena
creo una variable i igual a cero
otra variable igual a la longitud de la cadena <-- range
una variable que será nuestra nueva cadena
mientras range mayor o igual a cero:
    si el caracter en posicion i de la cadena es igual al de posicion range 
        i mas uno
        range menos uno
        nueva cadena mas el caracter en posicion i
if nueva cadena es igual a cadena
    muestro el resultado afirmativo
si no
    muestro el negativo
*/
import java.util.Scanner;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para comprobar si una cadena es palíndroma.");
    System.out.println("----------------------------------------------------------------------");

    System.out.print("Inserta una cadena: ");
    String ourString = s.nextLine();

    //Creo variables auxiliares
    int i = 0;
    int rangeString = ourString.length() - 1;
    String firstString = "";
    String secondString = "";

    /*
    Voy creando cadenas, en dos variables auxiliares, una de izq a derecha y otra al contrario,
    cuando i y el rango sean iguales, será el último carácter necesario comprobar,
    por si el número de carácteres es impar
    */
    while (i <= rangeString && ourString.charAt(i) == ourString.charAt(rangeString)) {
      firstString = firstString + ourString.charAt(i);
      secondString = secondString + ourString.charAt(rangeString);
      i++;
      rangeString--;
    }
    //Muestro si es palindromo o no
    if (firstString.equals(secondString) && firstString != "") {
      System.out.println("La cadena es palíndroma.");
    } else {
      System.out.println("La cadena no es palíndroma.");
    }
  }
}