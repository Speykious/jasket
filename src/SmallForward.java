public class SmallForward extends Forward {
  /** Probabilité que le joueur réussisse son rebond. */
  private double pRebound;

  public SmallForward(String name) {
    this(name, 0.1);
  }

  public SmallForward(String name, double pRebound) {
    super(name);
    this.pRebound = pRebound;
  }

  /** Le joueur effectue un rebond. */
  public String rebound() {
    if (Math.random() < pRebound)
      return name + " a fait un rebond !";
    else
      return name + " a raté son rebond !";
  }
  
  @Override
  public String toString() {
    return "SF " + super.toString();
  }

}
