package repetitivos;
/*
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido la base y el exponente, establezco i y end(empieza con el valor de la base) como variables para calcular
    Mientras que i sea menor o igual a exponente
    i += 1
    end *= base
muestro el resultado
*/
import java.util.Scanner;

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base = 1;
    double exp = 1;

    System.out.println("Bienvenido a este programa para decirte todos los números pares entre dos números.");
    System.out.println("----------------------------------------------------------------------------------");
    
    //Pido base y exponente
    System.out.print("Inserta un valor numérico para la base: ");
    base = s.nextDouble();
    System.out.print("Inserta un valor numérico para el exponente: ");
    exp = s.nextDouble();

    //Establezco la variable end para calcular
    int i = 1;
    double end = base;
    while (i < exp) {
      i++;
      end = end * base;
    }
    System.out.println("¡El resultado de tu potencia es "+end+"!");
  }
}
