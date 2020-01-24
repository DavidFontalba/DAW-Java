package secuenciales;
/*
Programa para saber a qué hora llega un ciclista de una ciudad A a otra B.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido la hora y el tiempo en segundos que tarda en llegar.
Calculo 
Convierto la hora a segundos, le sumo los que ha tardado y convierto el total en la nueva hora
Muestro el resultado
*/
import java.util.Scanner;

public class Ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int hours;
    int minutes;
    int seconds;
    int timeInSecs;

    System.out.println("Bienvenido a este programa para averiguar a qué hora llegará un ciclista que sale de una ciudad A a una hora y tarda T segundos en llegar a una ciudad B");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

    System.out.println("¿Qué hora era cuando el ciclista salió de la primera ciudad?");
    System.out.print("Horas...: ");
    hours = s.nextInt();

    System.out.print("Minutos.: " + (int)hours + ":");
    minutes = s.nextInt();

    System.out.print("Segundos: " + (int)hours + ":" + (int)minutes + ":");
    seconds = s.nextInt();

    System.out.println("¿Cuántos segundos tardó en llegar?");
    timeInSecs = s.nextInt();

    //Calculo
    int totalSecs = (hours*3600 + minutes*60 + seconds) + timeInSecs;

    //Convierto los segundos totales a horas, minutos, segundos
    int hoursEnd = totalSecs/3600;
    double minutesEnd = ( ( (double)totalSecs / 3600) - hoursEnd)*60;
    double secondsEnd = (minutesEnd - (int)(minutesEnd))*60;

    System.out.println("El ciclista llegará a la ciudad B a las " + (int)hoursEnd + ":" + (int)minutesEnd + ":" + (int)secondsEnd);
  }
}