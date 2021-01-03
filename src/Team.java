/**
 * @author Danny Ba
 * Rassemble les joueurs remplaçants et titulaires
 **/
public class Team {
  /**Team older les titulaire et les remplaçants*/
  private  PointGuard  pg ;
  private  ShootingGuard sg;
  private  PowerForward pf;
  private  Center c;
  private  SmallForward sf;
  
  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * @param holders Les titulaires chacun de leurs postes sont integrer
   */
  public Team(PointGuard  pg, ShootingGuard sg , PowerForward pf, Center c, SmallForward sf) {
    this.pg = pg;
    this.sg = sg;
    this.pf = pf ;
    this.c = c;
    this.sf = sf ;
  }
  

  public void addSubstitute(Player p) {
    
    if (p.getType() ==  "PointGuard") pg = (PointGuard)p;
    if (p.getType() == "ShootingGuard") sg = (ShootingGuard)p ;
    if (p.getType() == "PowerForward") pf = (PowerForward)p;
    if (p.getType() == "Center") c = (Center)p ;
    if (p.getType() == "SmallForward") sf= (SmallForward)p;
  
  
  }
}
