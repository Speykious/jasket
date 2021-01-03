/**
 * @author Danny Ba Rassemble les joueurs remplaçants et titulaires
 **/
public class Team {
  /** Team older les titulaire et les remplaçants */
  private PointGuard pg;
  private ShootingGuard sg;
  private PowerForward pf;
  private Center c;
  private SmallForward sf;

  private int totalP;

  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * 
   * @param holders Les titulaires chacun de leurs postes sont integrer
   */
  public Team(PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf, int p) {
    this.pg = pg;
    this.sg = sg;
    this.pf = pf;
    this.c = c;
    this.sf = sf;

    totalP = p;
  }

  /**
   * [Team initialise l'équipe sans donner le nombre de point qu'il ont à la base
   * et donc est à 0]
   * 
   * @method Team
   * @param pg [PointGuard]
   * @param sg [ShootingGuard]
   * @param pf [PowerForward]
   * @param c  [Center]
   * @param sf [SmallForward]
   */
  public Team(PointGuard pg, ShootingGuard sg, PowerForward pf, Center c, SmallForward sf) {
    this.pg = pg;
    this.sg = sg;
    this.pf = pf;
    this.c = c;
    this.sf = sf;

    totalP = 0;
  }

  /** ajouter le remplacant en prenant la place d'un des membre de l'equipe */
  public void addSubstitute(Player p) {

    if (p.getType() == "PointGuard")
      pg = (PointGuard) p;
    if (p.getType() == "ShootingGuard")
      sg = (ShootingGuard) p;
    if (p.getType() == "PowerForward")
      pf = (PowerForward) p;
    if (p.getType() == "Center")
      c = (Center) p;
    if (p.getType() == "SmallForward")
      sf = (SmallForward) p;

  }

  /**
   * [getCurrentScore retourne le score courrent ]
   * 
   * @method getCurrentScore
   * @return [le score de l'équipe]
   */
  public int getCurrentScore() {
    return totalP;
  }

  /**
   * [scoreUpdate si il y a modification du score]
   * 
   * @method scoreUpdate
   * @return [rien du tout car c'est juste un update ]
   */
  public void scoreUpdate() {
    totalP += pg.getGoals() + sg.getGoals() + pf.getGoals() + c.getGoals() + sf.getGoals();
  }
}
