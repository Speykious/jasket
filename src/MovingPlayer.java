/**
 * Représente un joueur de basket capable d'attaquer et de défendre.
 * 
 * @author SPAAK Nelson
 */
public abstract class MovingPlayer extends Player {
	protected boolean attacking;

  protected MovingPlayer(String name) {
		super(name);
		attacking = false;
	}
	
	/** Indique si le joueur attaque. */
	public boolean isAttacking() {
		return attacking;
	}

	/**
	 * Prévient que le joueur est en attaque.
	 * 
	 * @return Le message de notification
	 */
	public String attack() {
		attacking = true;
		return defendedBy == null
			? name + " attaque !"
			: name + " est bloqué par " + defendedBy.name + " !";
	}

	/**
	 * Prévient que le joueur défend sur un joueur adverse.
	 * 
	 * @param p Le joueur adverse
	 * @return Le message de notification
	 */
	public String defense(Player p) {
		p.defendedBy = this;
		return name + " défend sur le joueur " + p.name + " !";
	}
	
	public String dribble() {
		return name + " dribble !";
	}
}
