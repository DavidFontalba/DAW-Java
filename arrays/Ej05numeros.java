package arrays;
/*
5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo, la moda, la media,
la mediana y la desviación típica de esos números.

Autor: David Galván Fontalba
Fecha: 25/11/2019

Algoritmo:
Un bucle que se realizará 50 veces
  genero un numero aleatorio entre el 100 y el 199,
  muestro el numero + un espacio
  almaceno el numero en un array
  compruebo máximo
  compruebo mínimo
  voy calculando la media

calculo la desviacion tipica
(la raiz cuadrada de la varianza)

ordeno los numeros segun su valor

la mediana será el numero en posicion 24 + el numero en pos 25 /2 (la mediana cuando el numero total es par es la media de los dos centrales)

guardamos la repeticion maxima, empieza siendo 0
moda: Bucle que se realizará 50 veces (uso i)
  contador para el numero de repeticiones que estamos haciendo = 0
  bucle que se realizará 50 veces (uso j)
    si el valor de i y el de j son iguales
      +1 al contador  
    si el contador es mayor que nuestro actual contador de repeticiones
      la moda será el valor en la posicion i
      la repeticion maxima será ahora nuestro contador de repeticiones


*/
import java.util.Scanner;

public class Ej05numeros {
  public static void main(String[] args) {
    int random[] = new int[50];
    int max=99;
    int min=200;
    int medium=0;
    double variance=0;
    double typic;
    double median;
    int trend=0;

    for (int i = 0; i<50; i++) {
      random[i] = (int)(Math.random()*100 +100);
      System.out.print(random[i]+" ");

      if (random[i] > max) {  //Máximo
        max = random[i];
      } else if (random[i] < min) {  //Mínimo
        min = random[i];
      }
      
      //Para sumar la media
      medium += (random[i]/50);
    }
    //Desviación típica
    for (int i = 0; i < 50; i++) {
      variance += Math.pow((random[i]-medium), 2) / 50;
    }
    typic = Math.pow(variance, (0.5) );

    //Ordeno los números para calcular la mediana y la moda
    for (int i = 0; i < 50; i++) {
      for (int j=i+1; j<50; j++) {
        if(random[i]>random[j]) {
          int auxiliar=random[i];
          random[i] = random[j];
          random[j] = auxiliar;
        }
      }
    }
    //Calculo la mediana
    median = (double)((random[24]+random[25]) / 2);

    //Calculo la moda
    int maxRepetition=0;
    for (int i=0; i<50; i++) {
      int actualRepetition=0;
      for (int j=0; j<50; j++) {
        if (random[i]==random[j]) {
          actualRepetition++;
        }
        if (actualRepetition > maxRepetition) {
          trend = random[i];
          maxRepetition = actualRepetition;
        }
      }
    }
    //Muestro resultados
    System.out.println("\n-------------------------------");
    System.out.println("El máximo es...........: "+max);
    System.out.println("El mínimo es...........: "+min);
    System.out.println("La moda es.............: "+trend);
    System.out.println("El máximo es...........: "+medium);
    System.out.println("La mediana es..........: "+median);
    System.out.println("La desviación típica es: "+typic);
    
  }
}