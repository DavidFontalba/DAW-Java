package condicionales;
/*
Una compañía de transporte internacional tiene servicio en algunos países de América del Norte,
América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se
basa en el peso del paquete y la zona a la que va dirigido.

Lo anterior se muestra en la tabla:
ZONA	UBICACIÓN	        COSTO/GRAMO
1	    América del Norte	24.00 euros
2	    América Central	    20.00 euros
3	    América del Sur	    21.00 euros
4	    Europa	            10.00 euros
5	    Asia	            18.00 euros

Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados,
esto por cuestiones de logística y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso,
el rechazo de la entrega.

Autor: David Galván Fontalba
Fecha: 9/11/2019

Algoritmo:
Pido los datos del peso en gramos y la zona a la que va dirigido
En función de la zona escogida calcular el precio y mostrar el resultado
1 <-- weight * 24
2 <-- weight * 20
3 <-- weight * 21
4 <-- weight * 10
5 <-- weight * 18
*/

import java.util.Scanner;

public class Ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido a este programa para calcular el costo del servicio de transporte.");
    System.out.println("-----------------------------------------------------------------------------");

    System.out.println("1 --- América del Norte.  2 --- América Central.  3 --- América del Sur.  4 --- Europa. 5 --- Asia.");
    System.out.print("Inserta un valor numérico para la zona de envío: ");
    int zone = s.nextInt();
    System.out.print("Inserta un valor numérico en gramos para el peso del paquete a enviar: ");
    double weight = s.nextDouble();

    // Muestro el resultado correspondiente
    
    if (weight > 5000) {
      System.out.println("Lo lamentamos, por las condiciones de la empresa su paquete excede el peso admitido y no puede ser enviado.");
    } else if (weight <= 0) {
      System.out.println("Para realizar un envío la cantidad tiene que ser mayor que cero.");
    } else if (zone == 1) {
      System.out.println("El precio del paquete será de "+(weight*24)+" euros.");
    } else if (zone == 2) {
      System.out.println("El precio del paquete será de "+(weight*20)+" euros.");
    } else if (zone == 3) {
      System.out.println("El precio del paquete será de "+(weight*21)+" euros.");
    } else if (zone == 4) {
      System.out.println("El precio del paquete será de "+(weight*10)+" euros.");
    } else if (zone == 5) {
      System.out.println("El precio del paquete será de "+(weight*18)+" euros.");
    } else {
      System.out.println("Has introducido un número de zona no válido.");
    }
  }
}
