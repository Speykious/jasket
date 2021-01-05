public class PowerForward extends Forward {
  
  public PowerForward(String name) {
    super(name);
  }
  
  
  /**
   * [toString affiche la "fiche" du joueurs]
   * @return [la fiche du joueurs]
   */
  public String toString(){
    return super.name + " \n Poste : " + position() + " \n  Nombre de fautes :  " + super.fouls ;
  }
  
}
