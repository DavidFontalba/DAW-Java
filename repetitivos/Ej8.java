package repetitivos;
/*
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

Para hacer una espera en Python podemos usar el método sleep del módulo time.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
Pido cuanto quiere contar
establezco ahora en 0
empiezo un bucle que durara hasta que ahora y la variable antes pedida sean iguales
    voy mostrando un cronometro y sumando 1 a now cada vez que pasa 1segundo
*/
import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int now = 0;
    int seconds;
		int minutes;
		int hours;
    String cadenaSeconds;
    String cadenaMinutes;
    String cadenaHours;
    
    String updateCrono = "\b\b\b\b\b\b\b\b\b\b\b";

    System.out.print("Inserta cuántos segundos quieres contar: ");
    int future = s.nextInt();

    // horas
    for (hours=0; hours<=23; hours++) {
      // minutos
      for (minutes=0; minutes<=59; minutes++) {
        // segundos
        for (seconds=0; seconds<=59; seconds++) {
          
           cadenaSeconds = (seconds <= 9)?"0"+seconds:""+seconds;
           cadenaMinutes = (minutes <= 9)?"0"+minutes:""+minutes;
           cadenaHours = (hours <= 9)?"0"+hours:""+hours;
           
          System.out.print(updateCrono + cadenaHours + ":" + cadenaMinutes + ":" + cadenaSeconds);
          
          if (now == future) {
            break;
          }
          try {
            Thread.sleep(1000);
          } catch(InterruptedException e) {
            System.out.println(e.getMessage());
          }
          now++;
        }
        if (now == future) {
          break;
        }
      }
    if (now == future) {
      break;
    }
    }
  }
}

