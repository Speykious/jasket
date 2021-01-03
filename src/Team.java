/**
 * Rassemble les joueurs remplaçants et titulaires.
 * @author Danny Ba
 **/
public class Team {
  private PointGuard pg;
  private ShootingGuard sg;
  private PowerForward pf;
  private Center c;
  private SmallForward sf;

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
  public Team(PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf, int p) {
    this.pg = pg;
    this.sg = sg;
    this.pf = pf;
    this.c = c;
    this.sf = sf;

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
  public Team(PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf) {
    this(pg, sg, pf, c, sf, 0);
  }

  /** Ajoute le remplacant en prenant la place d'un des membres de l'équipe */
  public void addSubstitute(Player p) {
    if      (p instanceof PointGuard)    pg = (PointGuard)p;
    else if (p instanceof ShootingGuard) sg = (ShootingGuard)p;
    else if (p instanceof PowerForward)  pf = (PowerForward)p;
    else if (p instanceof Center)        c  = (Center)p;
    else if (p instanceof SmallForward)  sf = (SmallForward)p;
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
    score = pg.getGoals() + sg.getGoals() + pf.getGoals() + c.getGoals() + sf.getGoals();
  }
}
