/**
 * @author Danny Ba
 * Rassemble les joueurs remplaçants et titulaires
 **/
public class Team {
  private Player[] holders;
  private Player[] substitutes;
  private int realL;
  
  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * @param holders Les titulaires
   * @param substitutes Les remplaçants
   */
  public Team(Player[] holders, Player[] substitutes) {
    this.holders = holders;
    this.substitutes = substitutes;
    realL = holders.length;
  }

  // À revoir, vu qu'il semblerait qu'il y ait toujours exactement un PointGuard, un ShootingGuard, un PowerForward, etc.
  // Il vaudrait mieux à mon avis séparer les attributs au lieu de les rassembler dans un tableau
  public Team() {
    holders = new Player[] {
      new PointGuard(),
      new ShootingGuard(),
      new PowerForward(),
      new Center(),
      new SmallForward()
    };
    substitutes = new Player[5];
  }

  public void addSubstitute(Player p) {
    if (realL >= substitutes.length) {
      throw new SubstitutePlayerPleinException("on ne peu plus d'ajouter de joueur remplaçant");
    } else {
      substitutes[realL] = p;
      realL++;
    }
  }
}
