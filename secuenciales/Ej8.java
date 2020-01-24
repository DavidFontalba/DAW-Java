package secuenciales;
/*
Programa para averiguar cuánto cobrara en comisiones por separado, así como junto al resto del sueldo fijo.
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido: sueldofijo, comision1, comision2 y comision3
Cálculos. 
  comisiones <-- 0.1*(comision1+comision2+comision3)
  sueldototal <- sueldofijo+comisiones
Muestro el resultado
*/
import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double totalSalary;

    System.out.println("Bienvenido a este programa para calcular tu sueldo");
    System.out.println("--------------------------------------------------");

    System.out.print("Ingresa, con un valor numérico y en euros, tu sueldo fijo: ");
    double fixedSalary = s.nextDouble(); //Leer el sueldo fijo
    System.out.print("Ingresa, con un valor numérico y en euros, el cobro de tu primera venta: ");
    double commission1 = s.nextDouble(); //Leer primera venta
    System.out.print("Ingresa, con un valor numérico y en euros, el cobro de tu segunda venta: ");
    double commission2 = s.nextDouble(); //Leer segunda venta
    System.out.print("Ingresa, con un valor numérico y en euros, el cobro de tu tercera venta: ");
    double commission3 = s.nextDouble(); //Leer tercera venta

    //Cálculos
    totalSalary = fixedSalary + 0.1 * (commission1 + commission2 + commission3);

    System.out.println("Esta ocasión vas a cobrar en comisiones un total de " + (0.1 * (commission1 + commission2 + commission3)) + " euros, y ganarás un sueldo total de " + totalSalary + " euros.");
  }
}