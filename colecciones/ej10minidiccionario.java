package colecciones;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 10
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author DavidFontalba
 */
public class ej10minidiccionario {
  public static void main(String[] args) {
    HashMap<String, String> miniDiccionario = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    String option;
    miniDiccionario.put("llave","key");
    miniDiccionario.put("valor","value");
    miniDiccionario.put("ganador","winner");
    miniDiccionario.put("perdedor","loser");
    miniDiccionario.put("guerra","war");
    miniDiccionario.put("paz","peace");
    miniDiccionario.put("ácido","acid");
    miniDiccionario.put("dulce","sweet");
    miniDiccionario.put("morder","bite");
    miniDiccionario.put("oro","gold");
    miniDiccionario.put("atacar","attack");
    miniDiccionario.put("oveja","sheep");
    miniDiccionario.put("cerdo","pig");
    miniDiccionario.put("pequeño","small");
    miniDiccionario.put("alto","tall");
    miniDiccionario.put("grande","big");
    miniDiccionario.put("inteligente","clever");
    miniDiccionario.put("barro","mud");
    miniDiccionario.put("noche","night");
    miniDiccionario.put("día","day");
    
    System.out.println("Bienvenido a este minidiccionario español-inglés, introduce una palabra en español.\nEscribe H para saber qué palabras puedo traducir.\nEscribe F para salir.");
    boolean salir = false;
    while (!salir) {
      option = s.nextLine();
      
      //Muestro las palabras en castellano -las keys-
      if (option.contains("H")) {
        System.out.print("Las palabras disponibles son: ");
        int j=0;
        for (String i : miniDiccionario.keySet()) {
          if (j+1 != miniDiccionario.size()) {
            System.out.print(i+", ");
          } else {
            System.out.println(i+".");
          }
          j++;
        }
        
        //No vuelve a entrar al bucle
      } else if (option.contains("F")) {
        salir = true;
        
        //Muestra la traducción
      } else {
        System.out.println(option + " en inglés se escribe "+ miniDiccionario.get(option));
      }
      
    }
  }
}