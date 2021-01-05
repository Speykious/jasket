public abstract class Forward extends MovingPlayer {
  
  public Forward(String name) {
    super(name);
  }

  public String screen(Guard g, Player p) {
    return name + " a screen " + p.name + " grâce à " + g.name + " !";
  }
  
  public String position(){
    return "Forward";
  }
  
}