public class Team {

/**
 * @author Danny Ba
 *
 * Classe team qui rassemble les joueurs remplaçants et titulaires
 **/

	/**
	 * creation de l'equipe les titulaires et les remplaçant
	 */
	public  Team {
	
		private Player[] holder = new Player[5];
		private Player[] substitute = new Player[5];
		private int realL = 0;
	}


	public Team(){
		this.holder[0] = new PointGuard();
		this.holder[1] = new ShootingGuard();
		this.holder[2] = new PowerForward();
		this.holder[3] = new Center();
		this.holder[4] = new SmallForward();
	}

	public subcreate(Player p){

		if(realL >= substitute.length){
			throw new SubstitutePlayerPleinException("on ne peu plus d'ajouter de joueur remplaçant")
		}
		else{
			substitute[realL] = p;
			realL++;
		}
	}

}