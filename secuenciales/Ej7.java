package secuenciales;
/*
Programa para convertir minutos en horas:minutos:segundos
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo

Pedir minutos
Cálculo: 
	hh <-- minutos//60
	mm <-- ((minutos/60)-(hh))*60
	ss <-- (mm - int(mm)*60)
Muestro resultado
*/
import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double hours;
    double minutes;
    double seconds;

    System.out.println("Bienvenido a este programa que transformará los minutos que insertes al formato: horas:minutos:segundos");
    System.out.println("-------------------------------------------------------------------------------------------------------");

    System.out.print("Inserte un valor numérico para los minutos a transformar: ");
    double firstMinutes = s.nextDouble(); //Leer los minutos 

    //Cálculos
    hours = firstMinutes / 60;
    minutes = ((firstMinutes/60) - (int)hours) * 60;
    seconds = (double)(minutes - (int)minutes) * 60;

    System.out.println(firstMinutes + " minutos en formato 'horas:minutos:segundos' es: " + (int)hours + ":" + (int)minutes + ":" + (int)seconds);
  }
}