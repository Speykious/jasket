public class Scoreboard {
  /** Longueur d'un scoreboard en caractères. */
  public static final int width = 80;
  /** Hauteur d'un scoreboard en caractères. */
  public static final int height = 20;

  /** Équipe "Guest". */
  public Team guest;
  /** Équipe "Home". */
  public Team home;
  /** Temps restant du match courant. */
  public Time time;
  private int period;

  /**
   * [Scoreboard description]
   * @param guest [description]
   * @param home  [description]
   */
  public Scoreboard(Team guest, Team home) {
    this.guest = guest;
    this.home = home;
    time = new Time();
    resetPeriod();
  }

  /** Réinitialise la période. */
  public void resetPeriod() {
    period = 1;
  }

  /** Passe à la période suivante. */
  public void nextPeriod() throws PeriodOutOfBoundsException {
    if (period == 4) throw new PeriodOutOfBoundsException(period + 1);
    period++;
  }
}