package arrays;
/*
Ejercicio 4
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.

Autor: David Galván Fontalba
Fecha: 26/11/2019

*/
public class libroEj04 {
  public static void main(String[] args) {
    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];
    System.out.println("Bienvenido a este programa para que introduzcas veinte números y te muestre sus números al cuadrado y sus números al cubo.\n");

    for (int i=0; i< numero.length; i++){
      numero[i] = (int) (Math.random()*101);
    }
    
    for (int i=0; i< cuadrado.length; i++){
      cuadrado[i] = (int) Math.pow(numero[i], 2);
    }

    for (int i=0; i< cubo.length; i++){
      cubo[i] = (int) Math.pow(numero[i], 3);
    }
    System.out.println("Num | Cuadrado | Cubo");
    System.out.println("---------------------");
    for (int i=0; i< 20; i++) {
      System.out.println(" "+numero[i]+" |   "+cuadrado[i]+"   | "+cubo[i]);
      System.out.println("---------------------");
    }
  }
}