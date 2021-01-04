/**
 * Représente un joueur de Basket. Classe abstraite car un joueur de basket a
 * besoin d'avoir un rôle assigné en jeu.
 * 
 * @author SPAAK Nelson
 */
public abstract class Player {
  /** Le nom du joueur. */
  protected String name;
  /** Indique si le joueur a le ballon. */
  protected boolean hasTheBall;
  /** Score du joueur. */
  protected int score;
  /** Le nombre de fautes du joueur. */
  protected int fouls;
  
  /** Joueur adverse qui défend sur le joueur courant. */
  protected Player defendedBy;

  protected Player(String name) {
    this.name = name;
    hasTheBall = false;
    score = 0;
    fouls = 0;
    defendedBy = null;
  }

  /** Nom du joueur. */
  public String getName() {
    return name;
  }

  /** Score du joueur. */
  public int getScore() {
    return score;
  }

  /** Le joueur courant marque des points */
  public void score() {
    score += 2;
  }

  /** Passe le ballon à un joueur. */
  public void pass(Player p) {
    if (hasTheBall) {
      if (p.hasTheBall)
        throw new IllegalArgumentException("Trying to pass the ball to Player " + p + " who has the ball");
      p.hasTheBall = true;
      hasTheBall = false;
    } else
      throw new IllegalStateException("Trying to pass the ball which Player " + this + " doesn't have");
  }
}
