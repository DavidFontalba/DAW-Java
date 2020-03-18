package exceptions;

public class BasicError extends Exception {
  private String message;

  /**
   * Clase para excepciones con mensajes.
   * @author David Galván Fontalba
   * @version v1
   * @param message
   */
  public BasicError(String message) {
    this.setMessage(message);
  }

  public String getMessage() {
    return message;
  }

  private void setMessage(String message) {
    this.message = message;
  }


}