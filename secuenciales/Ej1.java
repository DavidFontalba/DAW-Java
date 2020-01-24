package secuenciales;
/*
Programa que lee un nombre y te saluda
Autor: David Galván Fontalba
Fecha: 5/11/2019

Algoritmo

Pido un nombre
Saludo al nombre

*/

public class Ej1 {
  public static void main(String[] args) {
    String name;
    
    System.out.println("¿Cómo te llamas?");                       //Pedir el nombre
    name = System.console().readLine();                           //Leer el nombre
    System.out.println("¡Encantado de conocerte "+ name + "!");   //Saludar
  }
}