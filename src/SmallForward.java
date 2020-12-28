public class SmallForward extends Player implements Forward{


		/**
	 * [Attack previens que le joueur est en attaque]
	 * @return [une chaine de caractere]
	 */
	public String attack(){

		return "le joueur "+super.name+" attaque !!";
	}

	/**
 	* [Defense on previens que le meneur defend sur un joueur donner]
 	* @param  p [le joueur qui est bloquer par L'arrière]
 	* @return   [une chaine de caractere sur le nom du joueur qui defend et le defendu]
 	*/
	public String defense(Player p){

		return "le joueur " + super.name + " defend sur le joueur "+p.getNom()+" !!!";
	}

	public boolean rebound(){
 		
 		"le joueur " + super.name + " a fait un rebond !!!";

		if((Math.random())*10 == 1 ) return true;
		else return false;	
	}

	/*public String ballTakin(){
		if(this.rebound() == true) return "rebond pris par le joueur " +super.name ;
		else 
	}
	je ne sais pas si on le fait ou pas donc je laisse */
}