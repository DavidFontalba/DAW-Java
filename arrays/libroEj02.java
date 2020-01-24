package arrays;
/*
Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?

Autor: David Galván Fontalba
Fecha: 26/11/2019

*/
public class libroEj02 {
  public static void main(String[] args) {
    Character simbolo[] = new Character[10];
    Character emptyChar = null;
    simbolo[0]='a';
    simbolo[1]='x';
    simbolo[4]='@';
    simbolo[6]=emptyChar;
    simbolo[7]='+';
    simbolo[8]='Q';

    for (int i=0; i< simbolo.length; i++){
      System.out.println(simbolo[i]);
    }

    //Solución: En Java, los valores de los elementos vacíos toman el valor de 0.
    //Utilizo Character en vez de char, para poder concretar, como dice el ejercicio que simbolo[6]=''
  }
}