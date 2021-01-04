public class Time {
  /** Les minutes. */
  private int minutes;
  /** Les secondes. */
  private int seconds;

  /** La minute maximale à ne pas dépasser. */
  private int maxMins;
  /** Les secondes maximales à ne pas dépasser à la limite de la minute maximale. */
  private int maxSecs;

  public Time() {
    this(0, 0);
  }

  public Time(int s) {
    this(0, s);
  }

  public Time(int m, int s) {
    setTime(m, s);
    setMaxTime();
  }

  public Time(int m, int s, int maxm, int maxs) {
    setTime(m, s);
    setMaxTime(maxm, maxs);
  }

  /** Initialise le temps maximal à 59:59. */
  public void setMaxTime() {
    setMaxTime(59, 59);
  }

  /** Initialise le temps maximal à l'aide d'une valeur en secondes. */
  public void setMaxTime(int s) {
    setMaxTime(0, s);
  }

  /** Initialise le temps maximal à m:s. */
  public void setMaxTime(int m, int s) {
    maxMins = m + s / 60;
    maxSecs = s % 60;
  }

  /** Initialise le temps à 00:00. */
  public void setTime() {
    setTime(0, 0);
  }

  /** Initialise le temps à l'aide d'une valeur en secondes. */
  public void setTime(int s) {
    setTime(0, s);
  }

  /** Initialise le temps à m:s. */
  public void setTime(int m, int s) {
    minutes = m + s / 60;
    seconds = s % 60;
  }

  /** Ajoute des secondes au temps. */
  public void addTime(int s) {
    setTime(minutes, seconds + s);
  }
  
  /** Ajoute des minutes et secondes au temps. */
  public void addTime(int m, int s) {
    setTime(minutes + m, seconds + s);
  }

  /** Augmente la valeur du temps d'une seconde. */
  public void increment() {
    if (seconds == 59) {
      minutes++;
      seconds = 0;
    } else
      seconds++;
  }

  /** Diminue la valeur du temps d'une seconde. */
  public void decrement() {
    if (seconds == 0) {
      minutes--;
      seconds = 59;
    } else
      seconds--;
  }

  /**
   * Valide les valeurs des minutes et secondes.
   * 
   * @throws TimeOutOfBoundsException lorsque les valeurs sont hors des limites posées.
   */
  public void checkValidTime() throws TimeOutOfBoundsException {
    if (minutes < 0 || seconds < 0 || minutes > maxMins || seconds > maxSecs) {
      throw new TimeOutOfBoundsException(minutes, seconds, maxMins, maxSecs);
    }
  }
}
