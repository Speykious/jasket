/**
 * Représente un joueur de basket capable d'attaquer et de défendre.
 * 
 * @author SPAAK Nelson
 */
public abstract class MovingPlayer extends Player {
  protected MovingPlayer(String name) {
    super(name);
  }

	/**
	 * Prévient que le joueur est en attaque.
	 * 
	 * @return Le message de notification
	 */
	public String attack() {
		return name + " attaque !";
	}

	/**
	 * Prévient que le joueur défend sur un joueur adverse.
	 * 
	 * @param p Le joueur adverse
	 * @return Le message de notification
	 */
	public String defense(Player p) {
		return name + " défend sur le joueur " + p.name + " !";
	}
	
	public String dribble() {
		return name + " dribble !";
	}
}