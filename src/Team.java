/**
 * Rassemble les joueurs remplaçants et titulaires.
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
  private int score;
  

  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * 
   * @param pg PointGuard
   * @param sg ShootingGuard
   * @param pf PowerForward
   * @param c  Center
   * @param sf SmallForward
   * @param p Le score
   */
  public Team(String name,
              PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf,
              PointGuard spg, ShootingGuard ssg, PowerForward spf, Center sc, SmallForward ssf,
              int p) {
    this.name = name;

    pointGuard    = pg;
    shootingGuard = sg;
    powerForward  = pf;
    center        = c;
    smallForward  = sf;

    subPointGuard    = spg;
    subShootingGuard = ssg;
    subPowerForward  = spf;
    subCenter        = sc;
    subSmallForward  = ssf;
    
    score = p;
  }

  /**
   * Initialise l'équipe sans donner le nombre de points qu'ils ont à la base
   * et donc est à 0
   * 
   * @param pg PointGuard
   * @param sg ShootingGuard
   * @param pf PowerForward
   * @param c  Center
   * @param sf SmallForward
   */
  public Team(String name,
              PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf,
              PointGuard spg, ShootingGuard ssg, PowerForward spf, Center sc, SmallForward ssf) {
    this(name, pg, sg, pf, c, sf, spg, ssg, spf, sc, ssf, 0);
  }

  /** Ajoute le remplacant en prenant la place d'un des membres de l'équipe */
  public void addSubstitute(Player p) {
    if      (p instanceof PointGuard)    subPointGuard    = (PointGuard)p;
    else if (p instanceof ShootingGuard) subShootingGuard = (ShootingGuard)p;
    else if (p instanceof PowerForward)  subPowerForward  = (PowerForward)p;
    else if (p instanceof Center)        subCenter        = (Center)p;
    else if (p instanceof SmallForward)  subSmallForward  = (SmallForward)p;
    else throw new IllegalArgumentException("Player has to be a more specific child");
  }

  /** Échange les point guards. */
  public void switchPointGuard() {
    PointGuard temp = subPointGuard;
    subPointGuard = pointGuard;
    pointGuard = temp;
  }

  /**
   * Retourne le score courant de l'équipe.
   * 
   * @return le score de l'équipe
   */
  public int getCurrentScore() {
    return score;
  }

  /** Met le score de l'équipe à jour. */
  public void scoreUpdate() {
    score = pointGuard.getScore()
          + shootingGuard.getScore()
          + powerForward.getScore()
          + center.getScore()
          + smallForward.getScore();
  }
}
