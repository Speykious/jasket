/**
 * Créateur de la classe : SPAAK Nelson
 * Représente un joueur de Basket.
 * Classe abstraite car un joueur de basket a besoin d'avoir un rôle assigné en jeu.
 */
public abstract class Player {
  /** Le nom du joueur. */
  protected String name;
  /** La position du joueur. */
  protected Position position;
  /** Indique si le joueur a le ballon. */
  protected boolean hasTheBall;

  protected int goals = 0 ;

  
  public Player(String name) {
    this(name, 0, 0, false);
  }
  public Player(String name, int x, int y) {
    this(name, x, y, false);
  }
  public Player(String name, Position position) {
    this(name, position, false);
  }
  public Player(String name, int x, int y, boolean hasTheBall) {
    this(name, new Position(x, y), hasTheBall);
  }
  public Player(String name, Position position, boolean hasTheBall) {
    this.name = name;
    this.position = position;
    this.hasTheBall = hasTheBall;
  }

  public String getNom(){
    return this.name;
  }

  public int getGoals(){
    return this.goals;
  }

    /**
   * [goalMake point marquer par le joueur meneur]
   */
  public void goalMake(){
    goals+=2;
  }
  
  /**
   * Établit le comportement d'un joueur.
   * Celui-ci dépend de son rôle dans l'équipe.
   */
  public abstract void update(Team own, Team opposite);
  
  /** Déplace le joueur vers une position. */
  public void move(Position p) {
    position.move(p);
  }
  /** Déplace le joueur vers un autre joueur. */
  public void move(Player p) {
    position.move(p.position);
  }
  
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
