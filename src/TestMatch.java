public class TestMatch {
  public static void main(String[] args) {
    SmallForward  sf = new SmallForward("Amath M'Baye");
    PowerForward  pf = new PowerForward("Guerschon Yabusele");
    Center        c  = new Center("Alexandre Chassang");
    PointGuard    pg = new PointGuard("David Michineau");
    ShootingGuard sg = new ShootingGuard("Yabuka Ouattara");

    SmallForward  ssf = new SmallForward("Hugo Invernizzi");
    PowerForward  spf = new PowerForward("Axel Bouteille");
    Center        sc  = new Center("Moustapha Fall");
    PointGuard    spg = new PointGuard("Jonathan Rousselle");
    ShootingGuard ssg = new ShootingGuard("Isaïa Cordinier");
    
    try {
      new Team("France but with more than 13 characters",
               pg, sg, pf, c, sf, spg, ssg, spf, sc, ssf);
      System.out.println("Le constructeur de Team ne fonctionne pas correctement :(");
    } catch (IllegalArgumentException e) {
      System.out.println("Le constructeur de Team fonctionne correctement :)");
    }
    Team teamFrance = new Team("France",
               pg, sg, pf, c, sf, spg, ssg, spf, sc, ssf);

    System.out.println(teamFrance);
  }
}
