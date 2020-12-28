/**
 * Créateur de la classe : SPAAK Nelson
 * Représente une position entière sur une grille en 2D.
 */
public class Position {
  /** Unité de la position sur l'axe des abscises. */
  public int x;
  /** Unité de la position sur l'axe des ordonnées. */
  public int y;
  
  /** Ce constructeur initialise la position à (0, 0). */
  public Position() {
    x = 0;
    y = 0;
  }
  /** Ce constructeur initialise la position à (a, b). */
  public Position(int a, int b) {
    x = a;
    y = b;
  }
  
  /**
   * Donne la distance entre deux positions au carré.
   * Utile pour comparer deux positions sant faire d'opération sur les floats.
   */
  public int distanceSq(Position p) {
    int xx = p.x - x; xx *= xx;
    int yy = p.y - y; yy *= yy;
    return xx + yy;
  }
  /** Donne la distance entre deux positions. */
  public double distance(Position p) {
    return Math.sqrt(distanceSq(p));
  }
  
  /** Déplace la position de dx unités sur l'axe des ordonnées et de dy unités sur l'axe des abscisses. */
  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
  /** Déplace la position courante d'une unité (droit ou diagonale) vers la position p.*/
  public void move(Position p) {
    x += Integer.compare(x, p.x);
    y += Integer.compare(y, p.y);
  }
}
