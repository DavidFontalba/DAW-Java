package funciones.arrays;

/*
 * Ejercicios 20-28
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
 * array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 * un array.
 * 
 *	@author David Galván Fontalba
 *	Fecha: 07/12/2019
 *
*/

public class Vectores {
	
	/**
	 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
	 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
	 * @param n
	 * @param min
	 * @param max
	 * @return vector
	 */
  static public int[] generaArrayInt (int n, int min, int max) {
  	int[] vector = new int[n];
  	for (int i=0; i<n; i++) {
  		vector[i] = (int)(Math.random()*(max+1-min)+min);
  	}
  	return vector;
  }
  
  /**
   * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
   * @param vector
   * @return min
   */
  static public int minimoArrayInt (int[] vector) {
  	int min = vector[0];
  	for (int i=0; i<vector.length; i++) {
  		if (vector[i] < min) {
  			min = vector[i];
  		}
  	}
  	return min;
  }
  
  /**
   * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
   * @param vector
   * @return max
   */
  static public int maximoArrayInt (int[] vector) {
  	int max = vector[0];
  	for (int i=0; i<vector.length; i++) {
  		if (vector[i] > max) {
  			max = vector[i];
  		}
  	}
  	return max;
  }
  
  /**
   * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
   * @param vector
   * @return media
   */
  static public double mediaArrayInt (int[] vector) {
  	double sumatorio=0;
  	for (int i=0; i<vector.length; i++) {
  		sumatorio += vector[i];
  	}
  	double media = sumatorio / vector.length;
  	return media;
  }
  
  
  /**
   * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
   * @param num
   * @param vector
   * @return boolean
   */
  static public boolean estaEnArrayInt (int num, int[] vector) {
  	for (int i=0; i<vector.length; i++) {
  		if (num == vector[i]) {
  			return true;
  		}
  	}
  	return false;
  }
  
  /**
   * 6. posicionEnArray: Busca un número en un array y devuelve la posición
   * (el índice) en la que se encuentra.
   * @param num
   * @param vector
   * @return 
   */
  static public int posicionEnArray (int num, int[] vector) {
  	for (int i=0; i<vector.length; i++) {
  		if (num == vector[i]) {
  			return i;
  		}
  	}
  	return -1;
  }
  
  /**
   * 7. volteaArrayInt: Le da la vuelta a un array.
   * @param vector
   * @return vectorInverso
   */
  static public int[] volteaArrayInt (int[] vector) {
  	int[] vectorInverso = new int[vector.length];
  	for (int i=0; i<vector.length; i++) {
  		vectorInverso[i]= vector[(vector.length-1)-i];
  	}
  	return vectorInverso;
  }
  
  /**
   * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
   * @param n
   * @param vector
   * @return vectorRotadoDerecha
   */
  static public int[] rotaDerechaArrayInt (int n, int[] vector) {
  	int[] vectorRotadoDerecha = new int[vector.length];
  	for (int i=0; i<n; i++) {
  		vectorRotadoDerecha[i] = vector[vector.length-n+i];
  	}
  	for (int i=0; i<vector.length-n; i++) {
  		vectorRotadoDerecha[n+i] = vector[i];
  	}
  	return vectorRotadoDerecha;
  }
  
  /**
   * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
   * @param n
   * @param vector
   * @return vectorRotadoDerecha
   */
  static public int[] rotaIzquierdaArrayInt (int n, int[] vector) {
  	int[] vectorRotadoIzquierda = new int[vector.length];
  	for (int i=0; i<vector.length-n; i++) {
  		vectorRotadoIzquierda[i] = vector[n+i];
  	}
  	for (int i=0; i<n; i++) {
  		vectorRotadoIzquierda[vector.length-n+i] = vector[i];
  	}
  	return vectorRotadoIzquierda;
  }
}