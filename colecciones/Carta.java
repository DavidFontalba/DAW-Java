package colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
  // Atributos de la clase
  private static int numCreated = 0;
  public static String[] PALOS = {"bastos", "copas", "espadas", "oros"};
  public static String[] FIGURAS = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
  
  // Atributos de la carta
  private String palo, cara;
  
  // Constructor sin parámetros, carta aleatoria
  /**
   *
   */
  public Carta() {
    
    this.palo = PALOS[ (int)(Math.random() * PALOS.length) ];
    this.cara = FIGURAS[ (int)(Math.random() * FIGURAS.length) ];
    
    numCreated++;
  }
  
  // Constructor con parámetros
  /**
   * 
   * @param palo
   * @param cara
   */
  public Carta(String palo, String cara) {
    if ( Arrays.asList(PALOS).contains(palo) ) {
      this.palo = palo;
    }
    if ( Arrays.asList(FIGURAS).contains(cara) ) {
      this.cara = cara;
    }
    
    numCreated++;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (cara == null) {
      if (other.cara != null)
        return false;
    } else if (!cara.equals(other.cara))
      return false;
    if (palo == null) {
      if (other.palo != null)
        return false;
    } else if (!palo.equals(other.palo))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return  cara + " de " + palo + ".";
  }

  // Getters y Setters
  public String getPalo() {
    return this.palo;
  }

  public String getCara() {
    return this.cara;
  }

  public int getNumCreated() {
    return this.numCreated;
  }

  public String[] getPALOS() {
    return this.PALOS;
  }

  public String[] getFIGURAS() {
    return this.FIGURAS;
  }

  
  
}