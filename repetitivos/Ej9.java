package repetitivos;
/*
Mostrar en pantalla los N primeros número primos. Se pide por teclado la cantidad de números primos que queremos mostrar.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido la cantidad de números primos que queremos mostrar.
Enseño el primero que siempre va a ser 2 y creo un contador
Empiezo a probar números, el primero será el 3
Mientras nuestro contador sea menor que la cantidad de números que buscamos haremos lo siguiente:
    Crearemos una variable para afirmar que es primo
    Otra variable para el divisor, empezará siendo 3 igual que el número con el que empezamos
    Mientras el divisor sea menor que la raiz cuadrada del numero que estamos intentando y la variable que afirma que es primo sigue siendo verdadera
        si el resto entre el numero y el divisor es cero es divisible, por tanto la variable que afirma que es primo será falsa
        sumamos dos al divisor para probar el siguiente divisor impar
    si hemos terminado el bucle anterior y la variable que afirma que es primo sigue siendo verdadera (hemos encontrado un número primo)
        añado 1 al contador y enseño el resultado
    Para probar si el siguiente número es primo, sumo 2 a la variable con la que estabamos probando (empezó siendo 3)
*/
import java.util.Scanner;

public class Ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int counter = 1;
    boolean itsPrime;
    int divider;
    int tryingNumber;

    System.out.println("Bienvenido a este programa para indicarte los X primeros números primos.");
    System.out.println("------------------------------------------------------------------------");

    System.out.print("Inserte la cantidad de números primos que quiere saber (Mínimo 1): ");
    int amount = s.nextInt();

    //El primer primo, y el único que es par va a ser dos
    if (amount >= 2) {
      System.out.println("El 1º número primo es: 2");
    }

    //Hago los calculos para el resto, los impares
    tryingNumber = 3;
    while (counter < amount) {
      itsPrime = true; //Suponemos que va a ser un número primo
      divider = 3; //El primer número que no es ni uno (porque va a salir siempre) ni dos (porque no va a ser par)
      while ( (divider <= tryingNumber/2 ) && itsPrime) { //Mientras el divisor sea menor que la raíz cuadrada del número a comprobar y siga siendo primo (porque no hemos hayado que no lo es aún)
        if (tryingNumber % divider == 0) { //Si el resto da cero dejará de ser un candidato a ser primo
          itsPrime = false;
        }
        divider = divider + 2; //Probamos con el siguiente divisor impar
      }
      if (itsPrime) { //Si es primo
        counter++; //Añadimos uno a nuestro contador
        System.out.println("El "+counter+"º número primo es: "+tryingNumber); //Mostramos el resultado
      }
      tryingNumber = tryingNumber + 2; //Una vez terminado, probamos con el siguiente número impar.
    }
  }
}

