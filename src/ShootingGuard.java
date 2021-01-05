/**
 * Arrière de jeu sur le côté.
 */
public class ShootingGuard extends Guard {
	public ShootingGuard(String name) {
		super(name);
	}

	/** Le joueur arrière courant marque 3 points */
	@Override
	public void score() {
		score += 3;
	}

	/** Le joueur arrière marque 2 points */
	public String dunk() {
		score += 2;
		return name + " à DUNKÉÉÉ !";
	}
	
	/**
	 * [toString affiche la "fiche" du joueurs]
	 * @return [la fiche du joueurs]
	 */
	public String toString(){
		return super.name + " \n Poste : " + position() + " \n  Nombre de fautes :  " + super.fouls ;
	}
}
