package condicionales;
/*
Crea un programa que pida al usuario dos números y muestre su división 
si el segundo no es cero, o un mensaje de aviso en caso contrario.
Autor: David Galván Fontalba
Fecha: 7/11/2019

Algoritmo:
Pedimos dos números
Los números los dividiremos si el divisor no es 0 y mostraremos el 
resultado, y si lo es avisaremos de que no se puede realizar la operación.
*/
import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para dividir dos números, si el segundo toma de valor 0, no se podrá realizar la operación.");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");

    System.out.print("Introduce un primer valor numérico.: ");
    double a = s.nextDouble();
    System.out.print("Introduce un segundo valor numérico: ");
    double b = s.nextDouble();

    // Comprobamos si es par o impar y mostramos el resultado
    if (b != 0) {
      System.out.println("El resultado de la división es: " + a/b);
    }
    else {
      System.out.println("Has insertado un 0 para el divisor, por tanto no se puede llevar a cabo la división");
    }
  }
}