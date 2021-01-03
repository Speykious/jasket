/**
 * Arriere de jeu est sur le côté
 */
public class ShootingGuard extends Player implements Guard {
	/**
	 * Prévient que le joueur est en attaque
	 * 
	 * @return Le message de notification
	 */
	public String attack() {
		return "le joueur " + super.name + " attaque !!";
	}

	/**
	 * Prévient que le meneur défend sur un joueur adverse
	 * 
	 * @param p Le joueur adverse
	 * @return Le message de notification
	 */
	public String defense(Player p) {
		return "le joueur " + super.name + " defend sur le joueur " + p.getName() + " !";
	}

	/** Le joueur arrière courant marque 3 points */
	@Override
	public void score() {
		goals += 3;
	}

	/** Le joueur arrière marque 2 points */
	public String dunk() {
		goals += 2;
		return "le joueur " + super.name + " à DUNKERRR !";

	}

	public String getType() {
		return "ShootingGuard";
	}
}
