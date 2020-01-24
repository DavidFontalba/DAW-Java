package arrays2;
/*
Ejercicio 5
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.

Autor: David Galván Fontalba
Fecha: 28/11/2019

Algoritmo:
Bucle que se hará 6 veces -- i
  Bucle que se hará 10 veces -- z
    Voy generando números aleatorios e introduciendolos en el array
    si el numero es maximo
      guardo su posicion (i y z) en un vector con 2 dimensiones
    si el numero es minimo
      guardo su posicion (i y z) en un vector con 2 dimensiones


*/

public class Ej05 {
  public static void main(String[] args) {
    int num[][] = new int[6][10];
    int arrayAuxMax[] = new int[2];
    int arrayAuxMin[] = new int[2];
    int max = -1;
    int min = 1001;

    for (int i=0 ; i<num.length ; i++) {
      for (int z=0 ; z<num[i].length ; z++) {
        num[i][z]= (int) (Math.random()*1001);

        if (num[i][z] > max) {  //Máximo
          max = num[i][z];
          arrayAuxMax[0]=i+1;
          arrayAuxMax[1]=z+1;
        }
        
        if (num[i][z] < min) {  //Mínimo
          min = num[i][z];
          arrayAuxMin[0]=i+1;
          arrayAuxMin[1]=z+1;
        }
      }
    }

    System.out.print("|----------------------------------------------------------------------------");
    for (int i=0 ; i<num.length ; i++) {
      System.out.print("\n|"); //Salto de linea
      for (int z=0 ; z<num[i].length ; z++) {
        System.out.print("  "+num[i][z]+" |");
      }
      System.out.print("\n|"); //Salto de linea
    }
    System.out.println("\n|----------------------------------------------------------------------------");
    System.out.println("El máximo está en la fila "+arrayAuxMax[0]+", columna "+arrayAuxMax[1]);
    System.out.println("El mínimo está en la fila "+arrayAuxMin[0]+", columna "+arrayAuxMin[1]);
  }
}