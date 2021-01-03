/**
 * Center bouge peu pendant le match voila pourquoi il a peu de fonction
 * principalement defensif il reste dans la zone de son camps
 */
public class Center extends Player {
	public Center(String name) {
		super(name);
	}

	public Center(String name, boolean hasTheBall) {
		super(name, hasTheBall);
	}

	public String bash(Player p) {
		if (Math.random() * 10 == 9)
			return "le joueurs " + super.name + "viens de faire un magnifique bashh !!!";
		else {
			p.score();
			return "le joueurs " + super.name + "viens de rater son  bashh !!!";
		}
	}
}