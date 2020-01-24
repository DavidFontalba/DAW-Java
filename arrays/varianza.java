package arrays;

/*
Introducir diez notas, de ellas sacar la nota m�xima, la m�nima, la media y la varianza.

Autor: David Galv�n Fontalba
Fecha: 18/11/2019
*/
import java.util.Scanner;

import funciones.estadisticas.Arrays;

public class varianza {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double[] notes;      //Array (vector) de notas
  
    System.out.println("Bienvenido a este programa para sacar la nota m�xima, la m�nima, la media y la varianza de las notas introducidas");
    System.out.println("-----------------------------------------------------------------------------------------------------------------");

    System.out.print("Introduce el n�mero de notas que vas a insertar: ");
    int numberOfNotes = s.nextInt();

    notes = new double[numberOfNotes]; //Creo un vector y reservo el espacio correspondiente
    
    do {
      System.out.print("Introduce la " + (1) +"� nota: ");
      notes[0] = s.nextDouble();
        
      if (notes[0] > 100 || notes[0] < 0) {
        System.out.println("ERROR: Has introducido una nota no v�lida. La nota ha de estar entre 0 y 100.");
      }
    } while (notes[0] > 100 || notes[0] < 0);
    
    double maxNote = notes[0];			//Le doy el primer valor introducido al max y al min
    double minNote = notes[0];
    
    for (int i = 1; i < numberOfNotes; i++) {
      do {
        System.out.print("Introduce la " + (i+1) +"� nota: ");
        notes[i] = s.nextDouble();
        
        if (notes[i] > 100 || notes[i] < 0) {
          System.out.println("ERROR: Has introducido una nota no v�lida. La nota ha de estar entre 0 y 100.");
        }
      } while (notes[i] > 100 || notes[i] < 0);
      
      if (notes[i] > maxNote) {  //M�ximo
        maxNote = notes[i];
      } else if (notes[i] < minNote) {  //M�nimo
        minNote = notes[i];
      }
    }

    //Muestro resultados
    System.out.println("De las notas introducidas:");
    System.out.println("La nota m�xima es: "+maxNote);
    System.out.println("La nota m�nima es: "+minNote);
    System.out.println("La nota media es.: "+ Arrays.media(notes) );
    System.out.println("La varianza es...: "+ Arrays.varianza(notes));
  }
}
