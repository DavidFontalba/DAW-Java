package secuenciales;
/*
Programa para saber cuántos minutos tardará un vehiculo en alcanzar a otro, teniéndo en cuénta que el de atrás irá más rápido.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido la distancia, la velocidad del de atrás, y la del primero.
Calculo 
tiempomin <-- (distancia/(velocidad1-velocidad2))*60
Muestro el resultado
*/
import java.util.Scanner;

public class Ej16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double speed1;
    double speed2;
    double distance;

    System.out.println("Bienvenido a este programa para averiguar cuánto tardará un vehículo X que va más rápido y por detrás de otro vehículo Y.");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------");

    System.out.print("Inserta un valor en km/h para la velocidad del vehículo, X, que va detrás...............: ");
    speed1 = s.nextDouble();

    System.out.print("Inserta un valor en km/h para la velocidad del primer vehículo, Y, menor que la anterior: ");
    speed2 = s.nextDouble();

    System.out.print("Inserta una valor en km para la distancia que separa ambos vehículos....................: ");
    distance = s.nextDouble();

    System.out.println("El vehículo X alcanzará al Y en " + (distance/(speed1-speed2))*60 + " minutos.");
  }
}