package arrays;
/*
Ejercicio 1
Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?

Autor: David Galván Fontalba
Fecha: 26/11/2019

*/
public class libroEj01 {
  public static void main(String[] args) {
    int num[] = new int[12]; //Preguntar si hay alguna forma de hacerlo asi: {39,-2, , ,0, ,14, ,5,120, , };
    num[0]=39;
    num[1]=-2;
    num[4]=0;
    num[6]=14;
    num[8]=5;
    num[9]=120;

    for (int i=0; i< num.length; i++){
      System.out.println(num[i]);
    }

    //Solución: En Java, los valores de los elementos toman el valor de 0
  }
}