public class SmallForward extends Player implements Forward{
	/**
	 * Prévient que le joueur est en attaque
	 * @return Le message de notification
	 */
	public String attack() {
		return "Le joueur " + super.name + " attaque !";
	}

	/**
 	 * Prévient que le meneur défend sur un joueur adverse
 	 * @param p Le joueur adverse
 	 * @return Le message de notification
 	 */
	public String defense(Player p) {
		return "le joueur " + super.name + " defend sur le joueur " + p.getName() + " !";
	}

	public boolean rebound() {
 		// Wtf?? --> // "le joueur " + super.name + " a fait un rebond !!!";
		if (Math.random() * 10 == 1) return true;
		else return false;	
	}

	public String ballTakin() {
		if (this.rebound())
      return "rebond pris par le joueur " + super.name;
    else
      return "bruh";
	}
	/* je ne sais pas si on le fait ou pas donc je laisse */
}
