package repetitivos;
/*
Realizar un programa que compruebe si una cadena contiene una subcadena.
Las dos cadenas se introducen por teclado.

Autor: David Galván Fontalba
Fecha: 12/11/2019

Algoritmo:
Pido la cadena y una subcadena
creo dos auxiliares, aux e i, y una nueva cadena para comprobar al final
mientras i sea menor que la longitud de la cad 1 y aux menor que la longitud de la cad 2
  si la posicion i de la cad 1 es igual a la posicion aux de la cad 2
    concateno la posicion i de la cadena 1 a nuestra nueva cadena
    sumo 1 a auxiliar
  sumo 1 a i
compruebo si la nueva cadena es igual a la subcadena e imprimo el resultado
*/
import java.util.Scanner;

public class Ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para comprobar si una cadena contiene a otra subcadena.");
    System.out.println("----------------------------------------------------------------------------------");

    System.out.print("Inserta la cadena grande, que tendrá o no en su interior a la otra: ");
    String ourString = s.nextLine();
    System.out.print("Inserta otra cadena que estará o no en la cadena anterior: ");
    String subString = s.nextLine();

    //Creo variables auxiliares
    int aux = 0;
    int i = 0;
    String newString = "";

    while (i < ourString.length() && aux < subString.length()) { //Para evitar errores en tiempo de ejecución, si i o aux llega al limite de la cadena para.
      if (ourString.charAt(i) == subString.charAt(aux)) {
        newString = newString + Character.toString(ourString.charAt(i));
        aux++;
      } else {
        newString = "";
      }
      i++;
    }

    //Muestro el resultado
    if (newString.equals(subString)) {
      System.out.println("La segunda cadena está dentro de la primera.");
    } else {
      System.out.println("La segunda cadena NO está dentro de la primera");
    }
  }
}
