package secuenciales;
/*
Programa para decirte el total de euros y céntimos que tienes cuándo le insertes la cantidad de monedas
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido monedas
Calculo 
total en centimos <- 2e*200 + 1e*100 + 50c*50 + 20c*20 + 10c*10
separo euros y centimos
Muestro el resultado
*/
import java.util.Scanner;

public class Ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int eu2;
    int eu1;
    int ce50;
    int ce20;
    int ce10;
    System.out.println("Bienvenido a este programa para sumar monedas");
    System.out.println("---------------------------------------------");

    System.out.println("¿Cuántas monedas de 2 euros tienes?");
    eu2 = s.nextInt();
    System.out.println("¿Cuántas monedas de 1 euro tienes?");
    eu1 = s.nextInt();
    System.out.println("¿Cuántas monedas de 50 céntimos tienes?");
    ce50 = s.nextInt();
    System.out.println("¿Cuántas monedas de 20 céntimos tienes?");
    ce20 = s.nextInt();
    System.out.println("¿Cuántas monedas de 10 céntimos tienes?");
    ce10 = s.nextInt();

    //Calculo
    double totalCents = eu2*200 + eu1*100 + ce50*50 + ce20*20 + ce10*10;

    //Divido en euros y céntimos
    double euros = totalCents/100;
    double centimos = ( (totalCents/100) - (int)(totalCents/100) ) * 100;

    System.out.println("Con esas monedas juntas un total de " + (int)euros + " euros y " + (int)centimos + " céntimos.");
  }
}