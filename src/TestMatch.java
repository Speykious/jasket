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
      System.out.println("Le constructeur de Team fonctionne correctement :)\n");
    }
    Team teamFrance = new Team("France",
               pg, sg, pf, c, sf, spg, ssg, spf, sc, ssf);
    System.out.println(teamFrance);
    System.out.println();
    
    SmallForward  sf2 = new SmallForward("Tatum Jayson");
    PowerForward  pf2 = new PowerForward("Barnes Harrison");
    Center        c2  = new Center("Plumlee Mason");
    PointGuard    pg2 = new PointGuard("White Derrick");
    ShootingGuard sg2 = new ShootingGuard("Mitchell Donovan");

    SmallForward  ssf2 = new SmallForward("Brown Jaylen");
    PowerForward  spf2 = new PowerForward("Middleton Khris");
    Center        sc2  = new Center("Turner Myles");
    PointGuard    spg2 = new PointGuard("Harris Joe");
    ShootingGuard ssg2 = new ShootingGuard("Smart Marcus");
    
    Team teamUSA = new Team("USA",
               pg2, sg2, pf2, c2, sf2, spg2, ssg2, spf2, sc2, ssf2);
    System.out.println(teamUSA);
    System.out.println();

    Scoreboard scoreboard = new Scoreboard(teamFrance, teamUSA);
    System.out.println(scoreboard);
  }
}