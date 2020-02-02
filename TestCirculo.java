import POO.Circulo;

/**
 * 3. Crea una clase TestCirculo que cree una instancia de “Circulo”,
 * muestre su estado, lo haga crecer 27 veces, averigüe su área, lo 
 * haga decrecer 10 veces y muestre su estado final.
 */

public class TestCirculo {
	public static void main(String[] args) {
		Circulo circle = new Circulo(Math.random()*10);
		System.out.println(circle);
		
		circle.crecer(27);
		System.out.println(circle);
		
		circle.menguar(10);
		System.out.println(circle);
	}
		
}