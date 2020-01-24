package repetitivos;
/*
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente.
Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.

Autor: David Galván Fontalba
Fecha: 11/11/2019

Algoritmo:
price <-- 10
i <-- 1
month <-- pedir mes que quiere averiguar (1-20)
mientras i < month
    price * 2
*/
import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Pido qué mes quiere averiguar
    System.out.print("Inserta un valor numérico para el precio del mes que quieres saber (Del 1 al 20): ");
    double month = s.nextInt();

    double price = 10; //Cantidad a pagar por el primer mes
    double i = 1;
    double total = 0; //Donde guardare el cálculo del total
    while (i < 21) {
      i++;
      total = total + price; //Sumo el precio en cada ciclo para calcular el total de los 20 meses
      if (i == month) {
        System.out.println("Este mes tendrás que pagar "+price+" euros.");
      }
      price = price*2; //Cada mes se duplica el precio
    }
    System.out.println("En total habrás pagado "+total+" euros.");
  }
}
