package POO;
/**
 *
 * Clase Rectangulo versión 4.0. pasada a Java.
 * 
 * Esta clase representa objetos de tipo rectángulo.
 * Acciones: cálculo del perímetro, área, dibujar, comparar.
 * 
 * @author David Fontalba
 *
 */
public class Rectangle {
  
  // Atributos de la clase, el lado máximo y el número de rectángulos creados
  public static int maxSide = 10;
  private static int numCreated = 0;
  
  // Los atributos del rectángulo serán base y altura
  private int base, height;
  
  
  /**
   * Constructor de la clase
   * @param base : base del rectángulo
   * @param height : altura del rectángulo
   */
  public Rectangle(int base, int height) {
    
    // Se otorga un valor inicial por si hubiera algún error con los parámetros.
    this.base = 1;
    this.height = 1;
    
    Rectangle.numCreated += 1;
    
    assert sideIsRight(base) && sideIsRight(height);
    if (sideIsRight(base)) {
      this.base = base;
    }
    
    if (sideIsRight(height)) {
      this.height = height;
    }
    
  }
 
  // Getters y setters
  public int getBase() {
    return this.base;
  }
  
  public void setBase(int value) {
    assert sideIsRight(value);
    this.base = value;
  }

  public int getHeight() {
    return this.height;
  }

	public void setHeight(int value) {
    assert sideIsRight(value);
    this.height = value;
  }
  
  // Métodos de Clase
  public static int getNumCreated() {
    return numCreated;
  }
  
  /**
   * Método estático que comprueba que el lado introducido es correcto
   * @param value : valor a comprobar
   * @return true o false
   */
  public static boolean sideIsRight(int value) {
    return 0 < value && value <= Rectangle.maxSide;
  }
  
  // Resto de métodos
  
  /**
   * @return perímetro del rectángulo.
   */
  public int perimeter() {
    return 2 * (this.base + this.height);
  }
  
  /**
   * @return área del rectángulo.
   */
  public int area() {
    return this.base * this.height;
  }
  
  /**
   * Compara nuestro rectángulo con otro.
   * @param other: objeto con el que comparamos el actual
   * @return >0 si mayor, 0 si igual, <0 si menor.
   */
  public int compare(Rectangle other) {
    return this.area() - other.area();
  }
  
  /**
   * Comprueba si el objeto pasado es el mismo rectángulo, o sea,
   * tiene la misma base y altura
   * @param other: objeto con el que comparamos el actual.
   * @return true o false
   */
  public boolean sameAs(Rectangle other) {
  	return this.base == other.base && this.height == other.base;
  }
  
  /**
   * Muestra en pantalla el rectángulo.
   */
  public void show() {
  	System.out.println(this);
  }
  
  // Métodos sobrecargados
  public String toString() {
  	String str = "";
  	for (int i = 0; i == this.height; i++) {
  		for (int j = 0; j == this.base; j++) {
  			str += "*";
  		}
  		str += "\n";
  	}
  	return str;
  }
  
  @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}
  
  
}
