package utils;

import exceptions.BasicError;

public class Menu {
  private String title = "";
  private String options[] = null;

  /**
   * Clase que gestiona menús de forma genérica
   * 
   * Muestra las opciones del menú
   * 
   * Recoge y devuelve las opciones de un menú
   * 
   * @author David Galván Fontalba
   * @version v1
   * 
   */
  public Menu(String title, String[] options) {
    this.setTitle(title);
    this.setOptions(options);
  }

  /**
   * Muestra las opciones y recoge la que selecciona el usuario
   * 
   * @return option
   * @throws BasicError 
   */
  public int gestionar() throws BasicError {
    showMenu();
    return chooseOption();
  }


  /**
   * Muestra las opciones del menú
   */
  private void showMenu() {
    int i = 1;
    System.out.println(this.getTitle());
    for (String option : this.getOptions())
      System.out.println(""+(i++)+". " + option);
  }

  /**
   * Recoge una opción del menú, controla que sea válida
   * 
   * @return option
   * @throws BasicError 
   */
  private int chooseOption() throws BasicError {
    int option;
    do {
      option = Keyboard.readInt("Introduce una opción: ");
    } while (option < 1 || option > this.getOptions().length);
    return option;
  }
  
  /**
   * Getters y setters
   */
  private String getTitle() {
    return title;
  }

  private void setTitle(String title) {
    this.title = title;
  }

  
  private String[] getOptions() {
    return options;
  }

  private void setOptions(String[] options) {
    this.options = options;
  }

}
