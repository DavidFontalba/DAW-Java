package funciones.estadisticas;
import java.util.ArrayList;

/**
 * @author David Galván Fontalba
 *
 */


public class Arrays {
  /**
   * Esta función devuelve la media de los valores de <code>array</code>
   * El ciclo for para recorrer este array es genérico, sería mejor usar
   * el for que hace de foreach
   * 
   * @param array
   * @return media
   */
  static public double media(double[] array) {
    double suma = 0;

    for (int i=0; i<array.length; i++) {
      suma += array[i];
    }
    return suma/array.length;
  }
  
  /**
   * Misma función aplicada a un ArrayList
   * @param array
   * @return media
   */
  static public double media(ArrayList<Integer> array) {
    int miSuma = suma(array);
    return miSuma/array.size();
  }

  /**
   * Esta funcion devuelve la  varianza de los elementos del array
   * 
   * @param array
   * @return varianza
   */
  static public double varianza(double[] array) {
    double m = media(array);
    double suma = 0;

    for (double elemento:array) {
      suma += Math.pow(elemento-m, 2);
    }
    return suma/array.length;
  }
  
  /**
   * 
   * @param array
   * @return maximo
   */
  static public int maximo(ArrayList<Integer> array, int minimo) {
    int max = minimo;
    for (int i=0; i < array.size(); i++) {
      if (array.get(i) > max) {
        max = array.get(i);
      }
    }
    return max;
  }
    
  /**
   * 
   * @param array
   * @return minimo
   */
  static public int minimo(ArrayList<Integer> array, int maximo) {
    int min = maximo;
    for (int i=0; i < array.size(); i++) {
      if (array.get(i) < min) {
        min = array.get(i);
      }
    }
    return min;
  }
  
  /**
   * 
   * @param array
   * @return suma
   */
  static public int suma(ArrayList<Integer> array) {
    int suma = 0;
    for (int i=0; i < array.size(); i++) {
      suma += array.get(i);  
    }
    return suma;
  }
  

}