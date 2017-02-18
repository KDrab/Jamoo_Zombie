
public class Human extends Player {
	//the human's health. If depleted to zero, turn into zombie
	private int health;
	
	//a human is not a zombie
	public boolean isZombie() {
		return false;
	}
	
	//reduce the health of the human by the given amount
	//return remaining health
	public int reduceHealth(int damage) {
		health -= damage;
		if (health < 0) {
			health = 0;
		}
		return health;
	}
}
