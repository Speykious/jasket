public class PowerForward extends Forward {
  
  public PowerForward(String name) {
    super(name);
  }
  
  public String toString(){
    return super.name + " \n Poste : " + position() + " \n  Nombre de fautes :  " + super.fouls ;
  }
  
}
