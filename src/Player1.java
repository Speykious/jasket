/**
 * Créateur de la classe : SPAAK Nelson
 * Représente un joueur de Basket.
 * Classe abstraite car un joueur de basket a besoin d'avoir un rôle assigné en jeu.
 */
public abstract class Player {
  /** Le nom du joueur. */
  protected String name;
  /** Indique si le joueur a le ballon. */
  protected boolean hasTheBall;
  /** Le nombre de paniers que le joueur a marqué. */
  protected int goals = 0;

  /** conteurs de paniers du joueurs */
  protected int goals = 0 ;
  
  /** conteurs de fautes du joueurs */
  protected int faults = 0;

  
  public Player(String name) {
    this(name, false);
  }
  public Player(String name, boolean hasTheBall) {
    this.name = name;
    this.hasTheBall = hasTheBall;
  }

  public String getName() {
    return this.name;
  }

  public int getGoals() {
    return this.goals;
  }

  /** Le joueur courant marque des points */
  public void score() {
    goals += 2;
  }
  
  public abstract String getType();
  
  /**
   * Établit le comportement d'un joueur.
   * Celui-ci dépend de son rôle dans l'équipe.
   */
  //public abstract void update(Team own, Team opposite);
  
  /** Passe le ballon à un joueur. */
  public void pass(Player p) {
    if (hasTheBall) {
      if (p.hasTheBall)
        throw new IllegalArgumentException("Trying to pass the ball to Player "+p+" who has the ball");
      p.hasTheBall = true;
      hasTheBall = false;
    } else
      throw new IllegalStateException("Trying to pass the ball which Player "+this+" doesn't have");
  }
}
