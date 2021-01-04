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
		return name + " a DUNKÉÉÉ !";
	}
}
