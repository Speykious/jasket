/**
 * [main Exemple d'un match de deux equipe notre client le commentateur souhaite utiliser
 * notre programme pour commenter mais aussi afficher l'avancement du match avec le scoreboard]
 */
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
    System.out.println("Test de la défense de joueur");
    System.out.println(teamFrance.getPointGuard().defense(teamUSA.getCenter()));
    System.out.println(teamUSA);
    

    Scoreboard scoreboard = new Scoreboard(teamFrance, teamUSA);
    System.out.println(scoreboard);

    System.out.println("\nTest du marquage de points et du temps");
    for (int i = 0; i < 100; i++) {
      if (Math.random() < 0.2) teamFrance.getPointGuard().score();
      if (Math.random() < 0.1) teamFrance.getShootingGuard().score();
      if (Math.random() < 0.3) teamUSA.getPowerForward().score();
    }
    try {
      scoreboard.nextPeriod();
    } catch (PeriodOutOfBoundsException e) {
      System.out.println("Problème dans la fonctionnalité des quarts de tour !");
    }
    System.out.println("Test du temps");
    scoreboard.time.addTime(5, 0);
    scoreboard.time.addTime(3, 89);
    scoreboard.time.addTime(203);
    System.out.println(scoreboard);

    try {
      scoreboard.nextPeriod();
      scoreboard.nextPeriod();
      scoreboard.nextPeriod();
    } catch (PeriodOutOfBoundsException e) {
      System.out.println("Limite du nombre de quarts de tour correcte");
    }
    System.out.println(scoreboard);
    
    teamFrance.getPowerForward().addFoul();
    System.out.println("Un joueur français a reçu une faute !");
    System.out.println(scoreboard);
    System.out.println(teamFrance);
    teamUSA.addTimeout();
    System.out.println("Les joueurs américains ont demandé un temps mort !");
    System.out.println(scoreboard);
    System.out.println(teamUSA);
  }
}