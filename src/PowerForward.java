public class PowerForward extends Player implements Forward {
	/**
	 * Attack previens que le joueur est en attaque
	 * 
	 * @return Le message de notification
	 */
	public String attack() {
		return "le joueur " + super.name + " attaque !";
	}

	/**
	 * Defense on previens que le meneur defend sur un joueur donner
	 * 
	 * @param p le joueur qui est bloquer par L'arrière
	 * @return Le message de notification
	 */
	public String defense(Player p) {
		return "le joueur " + super.name + " defend sur le joueur " + p.getName() + " !";
	}

	public String getType() {
		return "PowerForward";
	}
}
