/**
 * shootingGuard : arriere de jeu est sur le cote
 */
public class ShootingGuard extends Player implements Guard{
			

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

	/**
	 * [threePoint point marquer par le joueur arrière]
	 */
	public void threePoint(){
		goals+=3;
	}

	/**
	 * [Dunk point marquer par le joueur arrière]
	 */
	public void Dunk(){
		goals+=2;
	}
}
