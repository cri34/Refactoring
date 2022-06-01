package refactoritzacions;


public class Main {
	private Player player;
	
	public Main () {
		init();
	}
	
	private void init () {
		player = new Player();
	}

	public int roll () {
		return Player.roll();
	}
}
