public class TimeOutOfBoundsException extends Exception {
	private static final long serialVersionUID = 1L;
  
  public TimeOutOfBoundsException(int mins, int secs, int maxMins, int maxSecs) {
    super("Time " + mins + ":" + secs + " is out of range 0:0 to " + maxMins + ":" + maxSecs);
  }
}
