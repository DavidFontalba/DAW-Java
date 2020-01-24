package secuenciales;
/*
Programa para calcular la nota de un examen en el que las respuestas correctas dan 5 puntos, las incorrectas restan 1, y las no contestadas 0
Autor: David Galván Fontalba
Fecha: 6/11/2019

Algoritmo
Pido respuestas correctas, incorrectas y respondidas en blanco
Calculo 
nota <-- correctas * 5 + incorrectas * (-1) + blanco * 0
Muestro el resultado
*/
import java.util.Scanner;

public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int correctAnswer;
    int wrongAnswer;
    int unanswered;

    System.out.println("Bienvenido a este programa para calcular tu nota");
    System.out.println("------------------------------------------------");

    System.out.print("Inserta el número de respuestas correctas....: ");
    correctAnswer = s.nextInt();

    System.out.print("Inserta el número de respuestas falladas.....: ");
    wrongAnswer = s.nextInt();

    System.out.print("Inserta el número de respuestas sin responder: ");
    unanswered = s.nextInt();

    //Calculo
    int note = correctAnswer * 5 - wrongAnswer;
    int ifNoteWereTen = (correctAnswer + wrongAnswer + unanswered)*5;
    double noteOverTen = (note * 10) / ifNoteWereTen; //Una regla de tres

    System.out.println("Has sacado un " + noteOverTen + " en el examen, por haber obtenido " + note + " de " + ifNoteWereTen + " puntos");
  }
}