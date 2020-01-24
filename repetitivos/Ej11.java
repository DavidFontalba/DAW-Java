package repetitivos;
/*
Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), 
realiza un programa que cuente cuantas palabras tiene.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido una frase
Establezco un contador con valor 1 por la primera palabra
variable auxiliar i que irá incrementando en 1 por ciclo
mientras i sea menor que la longitud de nuestra frase
    si el caracter número (i, para que vaya incrementando y comprobando cada vez un carácter) es un espacio
        añadir +1 al contador
    sumo i y termino el bucle
muestro el resultado
*/
import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para que introduzcas una frase, y decirte cuántas palabras tiene.");
    System.out.println("--------------------------------------------------------------------------------------------");

    System.out.print("Escribe una frase: ");
    String ourString = s.nextLine();

    Scanner s2 = new Scanner(ourString);
    int counter = 0;
    while (s2.hasNextLine()) {
      s2.next();
      counter ++;
    }
    System.out.println("La frase tiene "+counter+" palabras");
  }
}

