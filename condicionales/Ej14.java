package condicionales;
/*
La asociación de vinicultores tiene como política fijar un precio 
inicial al kilo de uva, la cual se clasifica en tipos A y B, y 
además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta 
es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un 
productor por la uva que entrega en un embarque, considerando lo siguiente:
 
si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es 
de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 
30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
Realice un algoritmo para determinar la ganancia obtenida.

Autor: David Galván Fontalba
Fecha: 8/11/2019

Algoritmo:
Pedir cuántos kilos de uva, el precio por kilo, qué tipo y qué tamaño
A y t1 <-- +20 centimos
A y t2 <-- +30 centimos
B y t1 <-- -30 centimos
B y t2 <-- -50 centimos
Hacer los cálculos en función de a qué tipos y tamaños pertenecen
y mostrar el resultado al usuario

Considero que la carga del precio se suma (o resta) por kilo, y no al total
*/

import java.util.Scanner;

public class Ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Bienvenido vinicultor, en este programa podrás calcular el precio total de tus uvas en función de su tipo y tamaño.");
    System.out.println("-------------------------------------------------------------------------------------------------------------------");

    System.out.print("Inserte cuántos kilos de uva quieres vender....: ");
    double kOfGrapes = s.nextDouble();
    System.out.print("Inserta, en céntimos, el precio del kilo de uva: ");
    double pricePerK = s.nextDouble(); s.nextLine();
    System.out.print("Inserta el tipo de uva (A o B).................: ");
    String grapeType = s.nextLine();
    System.out.print("Inserta el tamaño de la uva (1 o 2)............: ");
    double grapeSize = s.nextDouble();

    // Cálculos de las 4 combinaciones
    double grapeA1 = kOfGrapes * (pricePerK + 20);
    double grapeA2 = kOfGrapes * (pricePerK + 30);
    double grapeB1 = kOfGrapes * (pricePerK - 30);
    double grapeB2 = kOfGrapes * (pricePerK - 50);
    
    if (grapeType.equals("A") && grapeSize == 1) {
      System.out.println("El precio total será de "+grapeA1);
    } else if (grapeType.equals("A") && grapeSize == 2) {
      System.out.println("El precio total será de "+grapeA2);
    } else if (grapeType.equals("B") && grapeSize == 1) {
      System.out.println("El precio total será de "+grapeB1);
    } else if (grapeType.equals("B") && grapeSize == 2) {
      System.out.println("El precio total será de "+grapeB2);
    }
  }
}