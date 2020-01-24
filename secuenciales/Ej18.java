package secuenciales;
/*
Programa para escribir las iniciales, ingresados por el usuario nombre y apellidos.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido nombre y apellidos.
Creo una cadena que serán las iniciales
Muestro el resultado
*/
import java.util.Scanner;

public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name;
    String firstSurname;
    String secondSurname;

    System.out.println("Bienvenido a este programa para escribir las iniciales de un nombre, ingresados por el usuario nombre completo y apellidos");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------");

    System.out.print("Inserta un nombre..........: ");
    name = s.nextLine();

    System.out.print("Inserta un primer apellido.: ");
    firstSurname = s.nextLine();

    System.out.print("Inserta un segundo apellido: ");
    secondSurname = s.nextLine();

    String initials = name.charAt(0) + "." + firstSurname.charAt(0) + "." + secondSurname.charAt(0) + ".";

    System.out.println("Las iniciales son: " + initials.toUpperCase());
  }
}