/**
 * PointGuard : meneur de jeu est au centre est a comme capacité de faire beaucoup de passe(plus que la plupart des autre joueurs )
 */
public class PointGuard extends Player implements Guard {
	
	/**
	 * [Attack previens que le joueur est en attaque]
	 * @return [une chaine de caractere]
	 */
	public String attack(){

		return "le joueur "+super.name+" attaque !!";
	}

	/**
 	* [Defense on previens que le meneur defend sur un joueur donner]
 	* @param  p [le joueur qui est bloquer par le meneur]
 	* @return   [une chaine de caractere sur le nom du joueur qui defend et le defendu]
 	*/
	public String defense(Player p){

		return "le joueur " + super.name + " defend sur le joueur "+p.getNom()+" !!!";
	}


	/**
	 * [hasTheBall renvoie si le joueur à la balle (surcharge)]
	 * @return [boolean]
	 */
	public boolean hasTheBall(){
    	return hasTheBall;
	}	


	/**
	 * 
	 * @param  b [boolean qui renvoie true si le joeur possede la bballe sinon false]
	 * @return   [true ou false]
	 */
	
	public boolean hasTheBall(boolean b){
		return b;
	}

	/**
	 * retourne rien mais  notice que le meneur de jeu a passer la balle
	 */
	public void passTheBall(){
		this.hasTheBall(false);
	}


	/**
	 * [crossover retourne quand le meneur à crosser (passer en dribblan) un joueur adverse]
	 * @return [String]
	 */
	public String crossover(Player p){
		return "le joueur " + super.name + " à fait un crosser le joueur "+p.getNom()+" !!!";
	}
	


}

