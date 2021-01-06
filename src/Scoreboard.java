/**
 * Affiche les informations essentielles durant un match.
 *
 * @author SPAAK Nelson
 */
public class Scoreboard {
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
      cola = ANSI.grn;
      colb = ANSI.red;
    } else if (guestScore < homeScore) {
      cola = ANSI.red;
      colb = ANSI.grn;
    } else {
      cola = ANSI.blu;
      colb = ANSI.blu;
    }
    return "\n┌───────────────┬───────────────┐\n"
         + String.format("│ %s%13s%s │ %s%-13s%s │\n",
            ANSI.yel, guest.name, ANSI.clr, ANSI.yel, home.name, ANSI.clr)
         + "│ ┌─────┐   ┌───┴───┐   ┌─────┐ │\n"
         + String.format("│ │ %s%03d%s │ %s◀%s │ "+time+" │ %s▶%s │ %s%03d%s │ │\n",
            cola, guest.getScore(), ANSI.clr, cola, ANSI.clr,
            colb, ANSI.clr, colb, home.getScore(), ANSI.clr)
         + "│ └─────┘   └─┬───┬─┘   └─────┘ │\n"
         + String.format("│ %s%02d%s      %d   │ %s%d%s │   %d      %s%02d%s │\n",
            ANSI.mag, guest.getFouls(), ANSI.clr, guest.getTimeouts(),
            ANSI.red, period, ANSI.clr,
            home.getTimeouts(), ANSI.mag, home.getFouls(), ANSI.clr)
         + "└─────────────┴───┴─────────────┘\n";
  }
}