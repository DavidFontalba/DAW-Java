package otros;
import funciones.arrays.Vectores;
/**
 * Para probar que las funciones realizadas funcionan
 * 
 *	@author David Galván Fontalba
 *	Fecha: 07/12/2019
 */
public class pruebaVectores {
  public static void main(String[] args) {
  	int[] arrayPrueba = new int[10];
  	arrayPrueba = Vectores.generaArrayInt(10, 1, 10);
  	System.out.println("Array generado");
  	for (int i=0; i<arrayPrueba.length; i++) {
  		System.out.print(arrayPrueba[i]+" ");
  	}
  	System.out.println();
  	
  	System.out.println("Mínimo");
  	System.out.println(Vectores.minimoArrayInt(arrayPrueba));
  	
  	System.out.println("Máximo");
  	System.out.println(Vectores.maximoArrayInt(arrayPrueba));
  	
  	System.out.println("Media");
  	System.out.println(Vectores.mediaArrayInt(arrayPrueba));
  	
  	System.out.println("esta en array 1, 3, 5");
  	System.out.println(Vectores.estaEnArrayInt(1, arrayPrueba));
  	System.out.println(Vectores.estaEnArrayInt(3, arrayPrueba));
  	System.out.println(Vectores.estaEnArrayInt(5, arrayPrueba));
  	
  	System.out.println("posicion en array");
  	System.out.println(Vectores.posicionEnArray(1, arrayPrueba));
  	System.out.println(Vectores.posicionEnArray(3, arrayPrueba));
  	System.out.println(Vectores.posicionEnArray(5, arrayPrueba));
  	
  	System.out.println("Voltea");
  	int[] arrayVolteado = new int[arrayPrueba.length];
  	arrayVolteado = Vectores.volteaArrayInt(arrayPrueba);
  	for (int i=0; i<arrayVolteado.length; i++) {
  		System.out.print(arrayVolteado[i]+" ");
  	}
  	System.out.println();
  	
  	System.out.println("Rota derecha");
  	int[] arrayRotDer = new int[arrayPrueba.length];
  	arrayRotDer = Vectores.rotaDerechaArrayInt(3, arrayPrueba);
  	for (int i=0; i<arrayRotDer.length; i++) {
  		System.out.print(arrayRotDer[i]+" ");
  	}
  	System.out.println();

  	System.out.println("Rota izquierda");
  	int[] arrayRotIzq = new int[arrayPrueba.length];
  	arrayRotIzq = Vectores.rotaIzquierdaArrayInt(3, arrayPrueba);
  	for (int i=0; i<arrayRotIzq.length; i++) {
  		System.out.print(arrayRotIzq[i]+" ");
  	}
  	System.out.println();

  	
  }
}