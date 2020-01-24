package secuenciales;
/*
Programa que calcula la hipotenusa de un triángulo rectángulo dados sus catetos
Autor: David Galván Fontalba
Fecha: 5/11/2019

Algoritmo

Leer los dos catetos
hipotenusa <-- raiz cuadrada del (cateto1 ** 2 + cateto2 ** 2)
Mostrar resultado
*/
public class Ej3 {
  public static void main(String[] args) {
    double cateto1;
    double cateto2;
    double hipotenusa;

    System.out.println("Bienvenido a este programa para calcular la hipotenusa de un triángulo rectángulo");
    System.out.println("---------------------------------------------------------------------------------");

    System.out.println("Dame un valor numérico para un cateto del triángulo: ");
    cateto1 = Double.parseDouble(System.console().readLine()); //Leer cateto1

    System.out.println("Dame otro para el otro cateto: ");
    cateto2 = Double.parseDouble(System.console().readLine()); //Leer cateto2

    hipotenusa = Math.pow(Math.pow(cateto1, 2) + Math.pow(cateto2, 2), 1/2); //Cálculo de la hipotenusa

    System.out.println("La hipotenusa de tu triángulo es: " + hipotenusa);
  }
}