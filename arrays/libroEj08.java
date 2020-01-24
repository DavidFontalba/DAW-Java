package arrays;
/*
Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter

Autor: David Galván Fontalba
Fecha: 26/11/2019

Algoritmo:
12 veces
  Pido las temperaturas medias y las almaceno en un array
  averiguo la temperatura maxima 

12 veces
  
  averiguo el porcentaje de la temp[i] (temp[i] * 100 / max)
  Muestro tantos asteriscos como (porcentaje/2) (para poner un maximo de 50 asteriscos)
*/
import java.util.Scanner;

public class libroEj08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double temperatures[] = new double[12];
    double max = Double.MIN_VALUE;
    System.out.println("Bienvenido a este programa para hacer un diagrama de barras con las temperaturas que insertes de cada mes para un solo año.\n");

    for (int i = 0; i<12; i++) {
      System.out.print("Introduce la temperatura media del mes "+(i+1)+": ");
      temperatures[i] = s.nextDouble();

      if (temperatures[i] > max) {  //Averiguo cual es la temperatura maxima
        max = temperatures[i];
      }
    }
    System.out.println();

    for (int i = 0; i<12; i++) {
      int percent = (int)(temperatures[i] * 100 / max);
      if (i < 9) {
        System.out.print("Mes 0"+(i+1)+"| ");
      } else {
        System.out.print("Mes "+(i+1)+"| ");
      }

      for (int j=0; j<(percent/2); j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}