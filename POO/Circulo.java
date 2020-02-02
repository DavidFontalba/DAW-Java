package POO;
/**
 * 2. Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar. Decrementa su radio.
 * Un círculo me devuelve su área si se la pido.
 * Un círculo me dice su estado, por ejemplo 
 * “Soy un círculo de radio 0.5 metros. Ocupo un área de 0.7853981633974483 
 * metros cuadrados” (método toString())
 *
 * @author David Galván Fontalba
 *
 */
public class Circulo {
	
  // Atributos de la clase, el radio máximo y el número de círculos creados
  public static double maxRad = 10;
  private static int numCreated = 0;
  
  //El atributo del círculo será el radio
  private double radio;
  
  public Circulo(double radio) {
  	// Se otorga un valor inicial por si hubiera algún error con los parámetros.
    this.radio = 1;
    
    Circulo.numCreated += 1;
    
    assert radio < 0;
    if (radio > 0) {
    	this.radio = radio;
    } else {
    	System.out.println("ERROR: El radio debe ser igual o mayor que 0.");
    }
    
  }
  
  // Métodos ----------------------------------------
  /**
   * Un círculo puede crecer. Aumenta su radio.
   * @param suma
   */
  public void crecer(double suma) {
  	this.radio += suma;
  }
  
  /**
   * Un círculo puede menguar. Decrementa su radio.
   * @param resta
   */
  public void menguar(double resta) {
  	this.radio -= resta;
  }
  
  /**
   * Un círculo me devuelve su área si se la pido.
   * @return área
   */
  public double area() {
  	return Math.PI * Math.pow(this.radio, 2);
  }
  
  
  @Override
  /**
   * “Soy un círculo de radio 0.5 metros. Ocupo un área de 0.7853981633974483 
   * metros cuadrados”
   * @return "Soy un círculo de radio ..."
   */
	public String toString() {
		return "Soy un círculo de radio " + radio + " metros. Ocupo un área de " + this.area() +" metros cuadrados.";
	}

	// getters y setters -------------------------------------
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Métodos de Clase
	public static int getNumCreated() {
		return numCreated;
	}
  
  
}