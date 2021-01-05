/**
 * Meneur de jeu est au centre est a comme capacité de faire beaucoup de passe
 * (plus que la plupart des autre joueurs)
 */
public class PointGuard extends Guard {
  public PointGuard(String name) {
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
