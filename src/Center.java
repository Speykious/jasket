/**
 * Joueur qui bouge peu pendant le match.
 * Principalement défensif, il reste dans la zone de son camp.
 */
public class Center extends Player {
	/** Probabilité de faire un bash. */
	private double pBash;

	public Center(String name) {
		this(name, 0.1);
	}

	public Center(String name, double pBash) {
		super(name);
		this.pBash = pBash;
	}

	/** Le joueur courant bash un joueur adverse. */
	public String bash(Player p) {
		if (Math.random() < pBash)
			return name + " vient de faire un magnifique bash !";
		else {
			p.score();
			return name + " vient de rater son bash !";
		}
	}
	
	public String getPosition(){
		return "Center";
	}
	
	/**
	 * [toString affiche la "fiche" du joueurs]
	 * @return [la fiche du joueurs]
	 */
	public String toString(){
		return super.name + " \n Poste : " + getPosition() + " \n  Nombre de fautes :  " + super.fouls ;
	}
	
	
}