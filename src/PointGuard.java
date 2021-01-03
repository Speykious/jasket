/**
 * Meneur de jeu est au centre est a comme capacité de faire beaucoup de passe
 * (plus que la plupart des autre joueurs)
 */
public class PointGuard extends Player implements Guard {
  public PointGuard(String name) {
    super(name);
  }

  public PointGuard(String name, boolean hasTheBall) {
    super(name, hasTheBall);
  }

  /**
   * Prévient que le joueur attaque
   * 
   * @return Le message de notification
   */
  public String attack() {
    return "le joueur " + super.name + " attaque !";
  }

  /**
   * Prévient que le meneur défend sur le joueur adverse
   * 
   * @param p Le joueur adverse
   * @return Le message de notification
   */
  public String defense(Player p) {
    return "Le joueur " + super.name + " défend sur le joueur " + p.getName() + " !";
  }

  /**
   * crossover retourne quand le meneur a crossé (passer en dribblant) un joueur
   * adverse
   * 
   * @param p Le joueur adverse
   * @return String
   */
  public String crossover(Player p) {
    return "Le joueur " + super.name + " a crossé le joueur " + p.getName() + " !";
  }
}
