package arrays2;
/*
Ejercicio 13
Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).

Ejemplo:
                                                     MED MIN MAX
   España: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
    Rusia: 179 189 208 167 186 17A 152 192 173 179 | 179 152 179
    Japón: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191

Autor: David Galván Fontalba
Fecha: 28/11/2019

Algoritmo:
Definimos el array "pais"
Generamos un array de 4 filas y 10 columnas en el que introducimos estaturas medias
aleatorias entre 140 y 210 (enteros) <-- stature

Mostramos el resultado
inserto "med min max"
bucle para cada elemento de pais
  insertar el elemento del pais
  bucle para insertar la fila elemento
    stature[elemento][i]
  escribir el separador
  insertar la media, minima y maxima [elemento]
*/

public class Ej13 {
  public static void main(String[] args) {
    String pais[] = new String[]{"España", "Rusia", "Japón", "Australia"};
    int stature[][] = new int[4][10];
    int min=211;
    int max=0;
    double mean=0;
    int calcs[][] = new int[4][3];

    int auxMinMax=0;
    for (int i=0; i<stature.length; i++) {
      for (int j=0; j<stature[i].length; j++) {
        stature[i][j] = (int) (Math.random()*71+140);

        //La máxima
        if (stature[i][j] > max) {
          max = stature[i][j];
        }

        //La mínima
        if (stature[i][j] < min) {
          min = stature[i][j];
        }

        if (auxMinMax == 9) {
          calcs [i][2] = max;
          calcs [i][1] = min;
        }
        auxMinMax++;
      }
      max = 0;
      auxMinMax = 0;
      min = 211;
    }

    int auxMean=0;
    for (int i=0; i<stature.length; i++) {
      for (int j=0; j<stature[i].length; j++) {
        mean += (stature[i][j] / 10);

        
        if (auxMean == 9) {
          calcs [i][0] = (int) mean;
          
          
        }
        auxMean++;
        

      }
      auxMean = 0;
      mean = 0;
    }

    int i=0;
    System.out.printf("%66s", "MED MIN MAX"+"\n");
    for (String elemento: pais) {
      System.out.printf("%9s: ", elemento);

      for (int z=0; z<stature[i].length; z++) {
        System.out.printf("%4d", stature[i][z]);
      }
      System.out.print(" |");

      for (int j=0; j<calcs[i].length; j++) {
        System.out.printf("%4d", calcs[i][j]);
      }
      System.out.println();
      i++;
    }
  }
}
