package otros;
import funciones.matematicas.Matematicas;
/**
 * Para probar que las funciones realizadas funcionan
 * 
 *	@author David Galván Fontalba
 *	Fecha: 06/12/2019
 */
public class pruebaMatematicas {
  public static void main(String[] args) {
  	System.out.println("1. potencia 2^12");
  	System.out.println(Matematicas.potencia(2, 12));
  	
  	System.out.println("2. voltea 123");
  	System.out.println(Matematicas.voltea(123));
  	
  	System.out.println("3. esPrimo 13 y 14");
  	System.out.println(Matematicas.esPrimo(13));
  	System.out.println(Matematicas.esPrimo(14));
  	
  	System.out.println("4. digitos 12345");
  	System.out.println(Matematicas.digitos(12345));
  	
  	System.out.println("5. esCapicua 121 y 123");
  	System.out.println(Matematicas.esCapicua(121));
  	System.out.println(Matematicas.esCapicua(123));
  	
  	System.out.println("6. siguientePrimo 9 y 13");
  	System.out.println(Matematicas.siguientePrimo(9));
  	System.out.println(Matematicas.siguientePrimo(13));
  	
  	System.out.println("7. digitoN 1201 2 y 1201 0");
  	System.out.println(Matematicas.digitoN(1201, 2));
  	System.out.println(Matematicas.digitoN(1201, 0));
  	
  	System.out.println("8. posicionDeDigito 1202 2 1202 0");
  	System.out.println(Matematicas.posicionDeDigito(1202, 2));
  	System.out.println(Matematicas.posicionDeDigito(1202, 0));
  	
  	System.out.println("9. trozoDeNumero 55005 1 3");
  	System.out.println(Matematicas.trozoDeNumero(55005, 1, 3));
  	
  	System.out.println("10. juntaNumeros 10 10");
  	System.out.println(Matematicas.juntaNumeros(10, 10));
  	
  	System.out.println("11. pegaPorDetras 10 5");
  	System.out.println(Matematicas.pegaPorDetras(10, 5));
  	
  	System.out.println("12. pegaPorDelante 10 5");
  	System.out.println(Matematicas.pegaPorDelante(10, 5));
  	
  	System.out.println("11. quitaPorDetras 12345 2");
  	System.out.println(Matematicas.quitaPorDetras(12345, 2));
  	
  	System.out.println("12. quitaPorDelante 12345 2");
  	System.out.println(Matematicas.quitaPorDelante(12345, 2));

  }
}