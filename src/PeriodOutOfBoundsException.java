public class PeriodOutOfBoundsException extends Exception {
	private static final long serialVersionUID = 1L;
  
  public PeriodOutOfBoundsException(int period) {
    super("Period " + period + " is out of range [1;4]");
  }
}
