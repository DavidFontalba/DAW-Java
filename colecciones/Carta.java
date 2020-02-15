package colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
  // Atributos de la clase
  private static ArrayList<Carta> cartasRobadas = new ArrayList<Carta>();
  private static int numCreated = 0;
  private static String[] PALOS = {"oros", "copas", "espadas", "bastos"};
  private static String[] FIGURAS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Sota", "Caballo", "Rey"};
  
  // Atributos de la carta
  private String palo, cara;
  
  // Constructor sin parámetros, carta aleatoria
  /**
   *
   */
  public Carta() {
    
    do {
      this.palo = PALOS[ (int)(Math.random() * 4) ];
      this.cara = FIGURAS[ (int)(Math.random() * 12) ];
    } while (this.yaExiste());
      
    
    
    numCreated++;
    cartasRobadas.add(this);
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
    cartasRobadas.add(this);
  }
  
  //Método estático para comprobar que una carta no se ha repetido
  private boolean yaExiste() {
    for (int i=0; i<cartasRobadas.size(); i++) {
      if (cartasRobadas.get(i).palo == this.palo && cartasRobadas.get(i).cara == this.cara) {
        return true;
      }
    }
    return false;
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