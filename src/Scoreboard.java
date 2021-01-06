/**
 * Affiche les informations essentielles durant un match.
 *
 * @author SPAAK Nelson
 */
public class Scoreboard {
  public static final String clr = "\033[0m";
  public static final String bld = "\033[1m";
  public static final String red = "\033[31m";
  public static final String grn = "\033[32m";
  public static final String yel = "\033[33m";
  public static final String blu = "\033[34m";
  public static final String mag = "\033[35m";

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

  @Override
  public String toString() {
    int guestScore = guest.getScore();
    int homeScore = home.getScore();
    String cola, colb;
    if (guestScore > homeScore) {
      cola = grn;
      colb = red;
    } else if (guestScore < homeScore) {
      cola = red;
      colb = grn;
    } else {
      cola = blu;
      colb = blu;
    }
    return "\n┌───────────────┬───────────────┐\n"
         + String.format("│ %s%13s%s │ %s%-13s%s │\n",
            yel, guest.name, clr, yel, home.name, clr)
         + "│ ┌─────┐   ┌───┴───┐   ┌─────┐ │\n"
         + String.format("│ │ %s%03d%s │ %s◀%s │ "+time+" │ %s▶%s │ %s%03d%s │ │\n",
            cola, guest.getScore(), clr, cola, clr,
            colb, clr, colb, home.getScore(), clr)
         + "│ └─────┘   └─┬───┬─┘   └─────┘ │\n"
         + String.format("│ %s%02d%s      %d   │ %s%d%s │   %d      %s%02d%s │\n",
            mag, guest.getFouls(), clr, guest.getTimeouts(),
            red, period, clr,
            home.getTimeouts(), mag, home.getFouls(), clr)
         + "└─────────────┴───┴─────────────┘\n";
  }
}