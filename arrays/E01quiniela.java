package arrays;
/*
1. Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos 
y el pleno al quince (15 filas) de forma que la probabilidad de que salga un 1 sea  de 1/2, la probabilidad 
de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. 
Pista: 1/2 = 3/6 y 1/3 = 2/6.

Author: David Galván Fontalba
Fecha: 22/11/2019

Divido 600 en 6 partes de 6,
1 tendra 3 partes (1/2) de 6 (0-299)
x tendra 2 partes (2/3) de 6 (300-499)
2 tendra 1 partes (1/6) de 6 (500-599)

Algoritmo:

Escribir:
1   x   2
---------

Mientras haya menos contador que 15 (bucle for)
  genero un numero random --> numRandom
  si i es 14
    escribo: Y el pleno al quince es:
  si el numRandom >= 0 && numRandom < 300
    muestro un 1
  si no y numRandom >= 300 < 500
    muestro una x
  si no 
    muestro un 2
fin bucle
*/
public class E01quiniela {
  public static void main(String[] args) {
    int numRandom;
    
    System.out.println("Bienvenido a este programa para generar una quiniela aleatoria.");
    System.out.println("---------------------------------------------------------------");

    System.out.println("                1º  2º  3º");
    System.out.println("----------------------------");

    for (int i=0; i<15; i++) {
      
      
      if (i==14){
        System.out.print("Pleno al 15 --> ");
      } else {
        if (i<9) {
          System.out.print("Partido 0"+(i+1)+"º --> ");
        } else {
          System.out.print("Partido "+(i+1)+"º --> ");
        }
      }
      for (int j=0; j<3; j++) {
        numRandom = (int) (Math.random()*600);

        if (numRandom >= 0 && numRandom < 300) {
          System.out.print("1   ");
        } else if (numRandom >= 300 && numRandom < 500) {
          System.out.print("x   ");
        } else {
          System.out.print("2   ");
        }
      }
      System.out.println("");
    }
  }
}