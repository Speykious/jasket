public abstract class Guard extends MovingPlayer {
  public Guard(String name) {
    super(name);
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

  public String position() {
    return "Guard";
  }
}