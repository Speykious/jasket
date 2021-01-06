/**
 * Rassemble les joueurs remplaçants et titulaires.
 * 
 * @author Danny Ba
 **/
public class Team {
  private PointGuard pointGuard;
  private ShootingGuard shootingGuard;
  private PowerForward powerForward;
  private Center center;
  private SmallForward smallForward;

  private PointGuard subPointGuard;
  private ShootingGuard subShootingGuard;
  private PowerForward subPowerForward;
  private Center subCenter;
  private SmallForward subSmallForward;

  public final String name;
  private int timeouts;

  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * 
   * @param pg PointGuard
   * @param sg ShootingGuard
   * @param pf PowerForward
   * @param c  Center
   * @param sf SmallForward
   * @param p  Le score
   */
  public Team(String name,
              PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf,
              PointGuard spg, ShootingGuard ssg, PowerForward spf, Center sc, SmallForward ssf) {
    if (name.length() > 13)
      throw new IllegalArgumentException("Name has to have 13 characters or less");
    this.name = name;

    pointGuard = pg;
    shootingGuard = sg;
    powerForward = pf;
    center = c;
    smallForward = sf;

    subPointGuard = spg;
    subShootingGuard = ssg;
    subPowerForward = spf;
    subCenter = sc;
    subSmallForward = ssf;

    timeouts = 0;
  }

  /** Ajoute le remplacant en prenant la place d'un des membres de l'équipe */
  public void addSubstitute(Player p) {
    if (p instanceof PointGuard)
      subPointGuard = (PointGuard)p;
    else if (p instanceof ShootingGuard)
      subShootingGuard = (ShootingGuard)p;
    else if (p instanceof PowerForward)
      subPowerForward = (PowerForward)p;
    else if (p instanceof Center)
      subCenter = (Center)p;
    else if (p instanceof SmallForward)
      subSmallForward = (SmallForward)p;
    else
      throw new IllegalArgumentException("Player has to be a more specific child");
  }

  /** Échange les point guards. */
  public void switchPointGuard() {
    PointGuard temp = subPointGuard;
    subPointGuard = pointGuard;
    pointGuard = temp;
  }

  /** Échange les point guards. */
  public void switchShootingGuard() {
    ShootingGuard temp = subShootingGuard;
    subShootingGuard = shootingGuard;
    shootingGuard = temp;
  }

  /** Échange les point guards. */
  public void switchPowerForward() {
    PowerForward temp = subPowerForward;
    subPowerForward = powerForward;
    powerForward = temp;
  }

  /** Échange les point guards. */
  public void switchCenter() {
    Center temp = subCenter;
    subCenter = center;
    center = temp;
  }

  /** Échange les point guards. */
  public void switchSmallForward() {
    SmallForward temp = subSmallForward;
    subSmallForward = smallForward;
    smallForward = temp;
  }

  /** Retourne le nombre de timeouts. */
  public int getTimeouts() {
    return timeouts;
  }

  /** Réinitialise les timeouts de l'équipe à 0. */
  public void resetTimeouts() {
    timeouts = 0;
  }

  /** Ajoute un timeout. */
  public void addTimeout() {
    timeouts++;
  }

  /**
   * Retourne le score courant de l'équipe.
   * 
   * @return le score de l'équipe
   */
  public int getScore() {
    return pointGuard.getScore()
         + shootingGuard.getScore()
         + powerForward.getScore()
         + center.getScore()
         + smallForward.getScore();
  }
  
  /**
   * Retourne les fautes totales de l'équipe.
   * 
   * @return les fautes totales de l'équipe
   */
  public int getFouls() {
    return pointGuard.getFouls()
         + shootingGuard.getFouls()
         + powerForward.getFouls()
         + center.getFouls()
         + smallForward.getFouls();
  }
}
