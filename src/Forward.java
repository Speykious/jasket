public interface Forward {
  /** notification que le joueurs à attaquer */
  public String attack();

  /** notification que le joueur defend */
  public String defense();

  /**
   * Réception en plein vol de la balle après un shoot de l'adversaire
   * 
   * @return Le message de notification
   */
  public boolean rebound();
}
