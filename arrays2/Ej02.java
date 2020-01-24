package arrays2;
/*
Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.



Autor: David Galván Fontalba
Fecha: 27/11/2019

*/
import java.util.Scanner;

public class Ej02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num[][] = new int[4][5];
    int sumatorioFila=0;
    int sumatorioColumna=0;
    int elSumatorio=0;

    for (int i=0 ; i<num.length ; i++) {
      for (int z=0 ; z<num[i].length ; z++) {
        System.out.print("Inserta un número entero: ");
        num[i][z]= s.nextInt();
      }
    }
    //Muestro la tabla siendo i la posicion para las filas y z para las columnas
    System.out.print("|------------------------------");
    for (int i=0 ; i<num.length ; i++) {
      System.out.print("\n|"); //Salto de linea

      sumatorioFila=0;
      for (int z=0 ; z<num[i].length ; z++) {
        sumatorioFila += num[i][z];
        elSumatorio += num[i][z];
        System.out.print(" "+num[i][z]+" |");
      }
      System.out.print("| "+sumatorioFila);
      System.out.print("\n|"); //Salto de linea

      
    }
    System.out.print("\n|-----------------------------|\n|");
    for (int i=0 ; i<5 ; i++) {
      for (int z=0 ; z<4 ; z++){
        sumatorioColumna += num[z][i];
      
        if (z == 3) {
          System.out.print(" "+sumatorioColumna+" |");
          sumatorioColumna=0;
        } 
      }
    }
    System.out.print("| "+elSumatorio);
    System.out.print("\n|------------------------------");
  }
}