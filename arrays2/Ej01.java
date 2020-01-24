package arrays2;
/*
Ejercicio 1
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.


Autor: David Galván Fontalba
Fecha: 27/11/2019

*/
public class Ej01 {
  public static void main(String[] args) {
    int num[][] = new int[3][6];
    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    num[1][0]=75;
    num[1][4]=10;
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=11;

    //Muestro la tabla siendo i la posicion para las filas y z para las columnas
    // Hacer una función para mostrar tablas con cifras que utilicen 1 o 2 caracteres
    System.out.print("|----|----|----|----|----|----|");
    for (int i=0 ; i<num.length ; i++) {
      System.out.print("\n|"); //Salto de linea

      for (int z=0 ; z<num[i].length ; z++) {
        System.out.print( ( (num[i][z]>=10 && num[i][z]<100) || num[i][z]<0)?" "+num[i][z]+" |":"  "+num[i][z]+" |" ); //Para que salga la tabla mostrada correctamente
      }
      System.out.print("\n|"); //Salto de linea

      for (int z=0 ; z<num[i].length ; z++) {
        System.out.print("----|");
      }
    }
  }
}