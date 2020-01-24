package arrays2;
/*
Ejercicio 3
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).

Autor: David Galván Fontalba
Fecha: 27/11/2019

*/

public class Ej03 {
  public static void main(String[] args) {
    int num[][] = new int[4][5];
    int sumatorioFila=0;
    int sumatorioColumna=0;
    int elSumatorio=0;

    for (int i=0 ; i<num.length ; i++) {
      for (int z=0 ; z<num[i].length ; z++) {
        num[i][z]= (int) (Math.random()*900+100);
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
        System.out.print("  "+num[i][z]+" |");
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