package condicionales;
/*
La política de cobro de una compañía telefónica es: cuando se realiza 
una llamada, el cobro es por el tiempo que ésta dura, de tal forma que 
los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 
céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo 
minuto, 50 céntimos. 
Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día,
en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo
para determinar cuánto debe pagar por cada concepto una persona que 
realiza una llamada.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pedimos al usuario el tiempo de la llamada, el día de la semana y el turno
del día -si no es domingo-
Calculo
 De 0 a 5 -> 1€
 De 5 a 8 -> 0.8€
 De 8 a 10 -> 0.7€
 A partir de 10 -> 0.5€
 Dia semana: 
    +3% domingo
    si no
        por la mañana 15%
        por la tarde 10%
Si la llamada es mayor de 10 minutos, 3€
Si la llamada es mayor de 8 minutos, 2.5€
Si la llamada es mayor de 5 minutos, 1.8€
Si la llamada es menor de 5 minutos, 1€
Si el dia es domingo aplicamos un 3%, si no lo es, preguntamos si es
por la mañana o por la tarde, para aplicar un 15% o un 10%
*/

import java.util.Scanner;

public class Ej16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double price = 1;
    String hour = "A";

    System.out.println("Bienvenido a este programa para calcular el coste de tu llamada.");
    System.out.println("----------------------------------------------------------------");

    System.out.print("Inserta la duración en minutos de tu llamada: ");
    double time = s.nextDouble(); s.nextLine();
    System.out.print("Inserta el día de la semana (L, M, X, J, V, S o D): ");
    String day = s.nextLine();
    if (!day.equals("D")) {
      System.out.print("Inserta 'M' si tu llamada fue por la mañana, 'T' si fue por la tarde: ");
    hour = s.nextLine();
    }

    // Calculo el precio segun los minutos
    if (time >= 10) {
      price = 3;
    } else if (time >= 8) {
      price = 2.5;
    } else if (time >= 5) {
      price = 1.8;
    } else if (time > 0) {
      price = 1;
    }
    
    if (time <= 0) {
      System.out.println("La llamada ha de tener una duración válida");
    } else if (day.equals("D")) {
      System.out.println("Tu llamada ha costado "+ (price*0.3 + price));
    } else if (hour.equals("M")) {
      System.out.println("Tu llamada ha costado "+ (price*0.15 + price));
    } else if (hour.equals("T")) {
      System.out.println("Tu llamada ha costado "+ (price*0.1 + price));
    } else {
      System.out.println("Reinicia el programa e inserte un valor válido");
    }
  }
}