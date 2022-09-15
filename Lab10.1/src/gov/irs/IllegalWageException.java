package gov.irs;

public class IllegalWageException extends Exception {

  public IllegalWageException() {
    super(); //don't need this because it happens automatically
  }

  public IllegalWageException(String message) {
    super(message);
  }

  public IllegalWageException(String message, Throwable cause) {
    super(message, cause);
  }

  public IllegalWageException(Throwable cause) {
    super(cause);
  }
}
