package repetitivos;
/*
Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido una frase
variable auxiliar i que irá incrementando en 1 por ciclo
creo una variable que sera la nueva frase
mientras i sea menor que la longitud de nuestra frase
    si el caracter número (i, para que vaya incrementando y comprobando cada vez un carácter) es igual a el caracter i en mayusculas
        sumo el caracter i en minusculas a la nueva frase
    si no
        sumo el caracter i en mayusculas a la nueva frase
muestro el resultado
*/
import java.util.Scanner;

public class Ej13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para cambiar las mayúsculas y minúsculas de una frase por su contraria.");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.print("Inserta una frase: ");
    String ourString = s.nextLine();

    //Creo una variable auxiliar i con valor cero y empiezo el bucle
    int i = 0;
    String newString = "";
    while (i < ourString.length() ) {
      if (ourString.charAt(i) == Character.toUpperCase(ourString.charAt(i))) {
        newString = newString + Character.toLowerCase(ourString.charAt(i));
      } else {
        newString += Character.toUpperCase(ourString.charAt(i));
      }
      i++;
    }
System.out.println("El resultado es..: "+newString);
  }
}