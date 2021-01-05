public abstract class Forward extends MovingPlayer {
  
  public Forward(String name) {
    super(name);
  }

  public String screen(Guard g, Player p) {
    return name + " a screen " + p.name + " grâce à " + g.name + " !";
  }
  
  /**
   * [toString affiche la "fiche" du joueurs]
   * @return [la fiche du joueurs]
   */
  public String position(){
    return "Forward";
  }
  
}