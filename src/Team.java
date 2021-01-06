/**
 * Rassemble les joueurs remplaçants et titulaires.
 * 
 * @author Danny Ba
 **/
public class Team {
  /** Tableau des joueurs sur le terrain. */
  private Player[] players;
  /** Tableau des remplaçants. */
  private Player[] substitutes;
  /** Nom de l'équipe. */
  public final String name;
  /** Nombre de temps morts de l'équipe pendant le match. */
  private int timeouts;

  /**
   * Création de l'équipe avec les titulaires et les remplaçants
   * 
   * @param players Joueurs qui seront sur le terrain.
   * @param substitutes Joueurs remplaçants.
   */
  public Team(String name, Player[] players, Player[] substitutes) {
    if (name.length() > 13)
      throw new IllegalArgumentException("`name` has to have 13 characters or less");
    this.name = name;

    if (players.length != 5)
      throw new IllegalArgumentException("`players` has to have exactly 5 players");
    if (substitutes.length != 5)
      throw new IllegalArgumentException("`players` has to have exactly 5 players");
    
    if (!(players[0] instanceof PointGuard))
      throw new IllegalArgumentException("`players[0]` has to be a PointGuard");
    if (!(players[1] instanceof ShootingGuard))
      throw new IllegalArgumentException("`players[1]` has to be a ShootingGuard");
    if (!(players[2] instanceof PowerForward))
      throw new IllegalArgumentException("`players[2]` has to be a PowerForward");
    if (!(players[3] instanceof Center))
      throw new IllegalArgumentException("`players[3]` has to be a Center");
    if (!(players[4] instanceof SmallForward))
      throw new IllegalArgumentException("`players[4]` has to be a SmallForward");

    timeouts = 0;
  }
  
  /** Retourne le joueur point guard de l'équipe. */
  public PointGuard getPointGuard() {
    return (PointGuard)players[0];
  }

  /** Retourne le joueur shooting guard de l'équipe. */
  public ShootingGuard getShootingGuard() {
    return (ShootingGuard)players[1];
  }

  /** Retourne le joueur power forward de l'équipe. */
  public PowerForward getPowerForward() {
    return (PowerForward)players[2];
  }

  /** Retourne le joueur center de l'équipe. */
  public Center getCenter() {
    return (Center)players[3];
  }

  /** Retourne le joueur smallForward de l'équipe. */
  public SmallForward getSmallForward() {
    return (SmallForward)players[4];
  }

  /** Ajoute le remplacant en prenant la place d'un des membres de l'équipe */
  public void addSubstitute(Player p) {
    if (p instanceof PointGuard)
      substitutes[0] = (PointGuard)p;
    else if (p instanceof ShootingGuard)
      substitutes[1] = (ShootingGuard)p;
    else if (p instanceof PowerForward)
      substitutes[2] = (PowerForward)p;
    else if (p instanceof Center)
      substitutes[3] = (Center)p;
    else if (p instanceof SmallForward)
      substitutes[4] = (SmallForward)p;
    else
      throw new IllegalArgumentException("Player has to be a more specific child");
  }

  /** Méthode interne pour échanger un joueur et son remplaçant correspondant. */
  private void switchAtIndex(int i) {
    players[i].switchWith(substitutes[i]);
    Player ptemp = substitutes[i];
    substitutes[i] = players[i];
    players[i] = ptemp;
  }

  /** Échange les point guards. */
  public void switchPointGuard() {
    switchAtIndex(0);
  }

  /** Échange les point guards. */
  public void switchShootingGuard() {
    switchAtIndex(1);
  }

  /** Échange les point guards. */
  public void switchPowerForward() {
    switchAtIndex(2);
  }

  /** Échange les point guards. */
  public void switchCenter() {
    switchAtIndex(3);
  }

  /** Échange les point guards. */
  public void switchSmallForward() {
    switchAtIndex(4);
  }

  /** Retourne le nombre de timeouts. */
  public int getTimeouts() {
    return timeouts;
  }

  /** Réinitialise les timeouts de l'équipe à 0. */
  public void resetTimeouts() {
    timeouts = 0;
  }

  /** Ajoute un temps mort. */
  public void addTimeout() {
    timeouts++;
  }

  /**
   * Retourne le score courant de l'équipe.
   * 
   * @return le score de l'équipe
   */
  public int getScore() {
    int total = 0;
    for (int i = 0; i < players.length; i++)
      total += players[i].getScore();
    return total;
  }
  
  /**
   * Retourne les fautes totales de l'équipe.
   * 
   * @return les fautes totales de l'équipe
   */
  public int getFouls() {
    int total = 0;
    for (int i = 0; i < players.length; i++)
      total += players[i].getFouls();
    return total;
  }

  @Override
  public String toString() {
    String s = "Team " + ANSI.bld + name + ANSI.clr + "\n";
    for (int i = 0; i < players.length; i++)
      s += players[i].toString() + "\n";
    return s;
  }
}
