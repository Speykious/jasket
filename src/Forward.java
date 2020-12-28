public class interface Forward {

/**
 * notification que le joueurs à attaquer
 **/

public String attack();

/**
 * notification que le joueur defend 
 **/

public String defense();

/**
 * [rebound reception en plein vole la balle apres un shoot de l'adversaire ou de son camp]
 * @return [String]
 */
public String rebound();

}