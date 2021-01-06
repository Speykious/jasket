/**
 * Représente un joueur de Basket. Classe abstraite car un joueur de basket a
 * besoin d'avoir un rôle assigné en jeu.
 * 
 * @author SPAAK Nelson
 * @author BA Danny
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
  /** Numéro du joueur. */
  protected int number;
  /** Joueur adverse qui défend sur le joueur courant. */
  protected Player defendedBy;
  
  /** Compteur qui donne le numéro d'un joueur. */
  protected static int lastNumber = 0;

  protected Player(String name) {
    this.name = name;
    hasTheBall = false;
    score = 0;
    fouls = 0;
    number = lastNumber++;
    defendedBy = null;
  }

  /** Donne le premier nombre libre à être donné à un joueur. */
  public static int getLastNumber() {
    return lastNumber;
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

  /** Retourne le nombre de fautes du joueur. */
  public int getFouls() {
    return fouls;
  }

  /** Ajoute une faute au joueur. */
  public void addFoul() {
    fouls++;
  }

  /** Réinitialise le nombre de fautes du joueur. */
  public void resetFouls() {
    fouls = 0;
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

  /** Intercepte le ballon d'un joueur adverse. */
  public void intercept(Player p) {
    p.pass(this);
  }

  @Override
  public String toString() {
    String s = name + " (f=" + fouls + ", s=" + score + ")";
    if (defendedBy != null) s = ANSI.red + s + ANSI.clr;
    return s;
  }
}
