package repetitivos;
/*
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
pido cuantos números quiero introducir <-- cicles
mientras que cicles sea distinto a 0
    cicles pierde 1
    inserta un número <-- userNum
    depende de usernum añado +1 a un contador de mayor que cero, otro para menor que cero y otro para igual a cero
muestro los tres contadores
*/
import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Establezco los contadores en cero
    int zeroCount = 0;
    int plusCount = 0;
    int minusCount = 0;
    
    System.out.println("Bienvenido a este programa para agrupar números que introduzcas en mayores, menores e iguales a cero.");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    
    //Pido ciclos
    System.out.println("¿Cuántos números vas a introducir?");
    int cicles = s.nextInt();

    //Pido numeros y voy contando
    while (cicles != 0) {
      --cicles;
      System.out.println("Introduce un número: ");
      double userNum = s.nextDouble();
      if (userNum < 0) {
        ++minusCount;
      } else if (userNum > 0) {
        ++plusCount;
      } else {
        ++zeroCount;
      }
    }
    System.out.println("Números mayores que 0: "+plusCount);
    System.out.println("Números menores que 0: "+minusCount);
    System.out.println("Números iguales a 0..: "+zeroCount);
  }
}
