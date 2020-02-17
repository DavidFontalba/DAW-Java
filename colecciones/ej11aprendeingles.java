package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 11
 * Realiza un programa que escoja al azar 5 palabras en español del mini-
 * diccionario del ejercicio anterior. El programa irá pidiendo que el usuario teclee
 * la traducción al inglés de cada una de las palabras y comprobará si son
 * correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
 * y cuántas erróneas.
 * 
 * @author DavidFontalba
 */
public class ej11aprendeingles {
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
        
    //Ejercicio 11
    //Coger 5 palabras al azar
    ArrayList<String> keys = new ArrayList<String>();
    //Bucle que almacena las keys del diccionario en un arraylist
    for (String i : miniDiccionario.keySet()) {
      keys.add(i);
    }
        
    //Genero una palabra aleatoria del array
    int NUMPALABRAS = 5;
    int aleatorio;
    ArrayList<String> preguntas = new ArrayList<String>();
        
    //Bucle por número de palabras
    for (int i=0;i<NUMPALABRAS;i++) {
      //Genero un número aleatorio
      aleatorio = (int)(Math.random() * (keys.size()+1) );
      //Almaceno en todo el array preguntas los resultados aleatorios del arraylist keys
      preguntas.add(keys.get(aleatorio) );
    }
     
    //Preguntar las palabras
    ArrayList<Boolean> soluciones = new ArrayList<Boolean>();
    String respuesta;
    System.out.println("Voy a mostrar "+NUMPALABRAS+" palabras en español por pantalla, después de cada una escribe su traducción en inglés");
    for (int i=0;i<preguntas.size();i++) {
      System.out.print(preguntas.get(i) + " = ");
      respuesta = s.nextLine();
      soluciones.add(miniDiccionario.get(preguntas.get(i) ).contains(respuesta) );
      
    }
    //Mostrar el resultado
    int validas=0;
    for (boolean i:soluciones) {
       if (i) {
         validas++;
       }
    }
    System.out.println("Has acertado "+validas+" palabras y fallado "+(preguntas.size() - validas));
  }
}