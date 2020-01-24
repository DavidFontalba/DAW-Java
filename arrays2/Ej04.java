package arrays2;
//import java.sql.Time;

/*
Ejercicio 4
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.

Autor: David Galván Fontalba
Fecha: 27/11/2019

*/

public class Ej04 {
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
      try {
        Thread.sleep(1000);
     } catch (Exception e) {
        System.out.println(e);
     }
      System.out.print("| "+sumatorioFila);
      System.out.print("\n|"); //Salto de linea

      
    }
    System.out.print("\n|-----------------------------|\n|");
    for (int i=0 ; i<5 ; i++) {
      for (int z=0 ; z<4 ; z++){
        sumatorioColumna += num[z][i];
      
        if (z == 3) {
          try {
            Thread.sleep(1000);
         } catch (Exception e) {
            System.out.println(e);
         }
          System.out.print(" "+sumatorioColumna+" |");
          sumatorioColumna=0;
        } 
      }
    }
    try {
      Thread.sleep(1500);
   } catch (Exception e) {
      System.out.println(e);
   }
    System.out.print("| "+elSumatorio);
    System.out.print("\n|------------------------------");
  }
}