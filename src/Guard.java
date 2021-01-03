/**
 * Création de l'interface qui donnera les capacités que doit avoir un meneur et
 * un arrière au basket
 **/
public interface Guard {
  /** notification que le joueurs à attaquer */
  public String attack();

  /** notification que le joueur defend */
  public String defense(Player p);
}
