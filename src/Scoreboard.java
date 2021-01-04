public class Scoreboard {
  /** Longueur d'un scoreboard en caractères. */
  private static final int width = 80;
  /** Hauteur d'un scoreboard en caractères. */
  private static final int height = 20;

  /** Équipe "Guest". */
  public Team guest;
  /** Équipe "Home". */
  public Team home;
  /** Minutes restantes du match. */
  private int minutes;
  /** Secondes restantes du match. */
  private int seconds;

  public Scoreboard(Team guest, Team home) {
    this.guest = guest;
    this.home = home;
    this.minutes = 0;
    this.seconds = 0;
  }

  
}