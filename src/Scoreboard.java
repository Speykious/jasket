public class Scoreboard {
  /** Longueur d'un scoreboard en caractères. */
  private static final int width = 80;
  /** Hauteur d'un scoreboard en caractères. */
  private static final int height = 20;

  /** Équipe "Guest". */
  public Team guest;
  /** Équipe "Home". */
  public Team home;
  /** Temps restant du match courant. */
  public Time time;

  public Scoreboard(Team guest, Team home) {
    this.guest = guest;
    this.home = home;
    this.time = new Time();
  }
}