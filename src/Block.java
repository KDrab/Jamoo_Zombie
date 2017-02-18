
public class Block extends Element {
	//the health of the block. Destroyed if dropped to zero (0)
	private int health;
	
	//reduce the health of the block by the given amount
	//return remaining health
	public int reduceHealth(int damage) {
		health -= damage;
		if (health < 0) {
			health = 0;
		}
		return health;
	}
}
