package condicionales;
/*
Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pido que el usuario inserte las variables nota, edad y sexo
Compruebo las variables y muestro los resultados en función de los requisitos
para nota mayor o igual a cinco, edad mayor o igual a 18 y sexo F será ACEPTADA
para nota mayor o igual a cinco, edad mayor o igual a 18 y sexo M será POSIBLE
si no se cumplen las condiciones será NO ACEPTADA
*/
import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenidos a este programa para comprobar si has sido aceptada, posible o no aceptada.");
    System.out.println("---------------------------------------------------------------------------------------");

    System.out.print("Inserta tu nota: ");
    double note = s.nextDouble();
    System.out.print("Inserta tu edad: ");
    double age = s.nextDouble(); s.nextLine();
    System.out.print("Inserta tu sexo ('F' para femenino o 'M' para masculino): ");
    String gender = s.nextLine();

    // Comprobamos que sea una sola letra y que además sea mayúscula
    if (note >= 5 && age >= 18 && gender.equals("F")) {
      System.out.println("ACEPTADA");
    } else if (note >= 5 && age >= 18 && gender.equals("M") ) {
      System.out.println("POSIBLE");
    } else {
      System.out.println("NO ACEPTADA");
    }
  }
}