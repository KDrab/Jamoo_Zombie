import java.util.List;

public class GameManager {

	//the game map - a 2D array of elements
	private Element[][] map;
	//a list of all NPCs
	private List<Player> npcs;
	//players 1 and 2
	private Player p1;
	private Player p2;
	
	//initialize a map of size width X height
	public void initialize(int width, int hieght) {
		// TODO - choose a percentage of walls (maybe make #define)
		int wallPercentage = 10;
		//generate the walls on the map
		generateWalls(wallPercentage);
		// TODO - choose a number of NPCs (maybe make #define)
		int numNPCs = 10;
		//generate the npcs on the map
		generateNPCs(numNPCs);
		//place the players
		placePlayers();
	}

	//generate the locations of all walls, called by initailize
	private void generateWalls(int numWalls) {
		// TODO - generate the walls based on some pattern
	}
	
	//generate the locations of all NPCs
	private void generateNPCs(int numNPCs) {
		// TODO - generate the NPCs in valid positions
	}

	//place the players on the map
	private void placePlayers() {
		// TODO - place the players in valid positions
	}

	//move the npcs one tick
	public void moveNPCs() {
		// TODO - loops through list of NPCs and move each/take actions
		//      - Using generateMove() and takeAction()
	}
	
	//generate a move for the character - output the direction they move
	private String generateMove(Player p) {
		// TODO - generate a move for the given character based on
		//		- the location of walls and A* algorithm
		//		- Humans move away from zombies and dead ends
		//		- Zombies move towards players
		return null;
	}
	
	//Have the given player take an action if there's one availabe
	// Includes zombies attacking (and maybe Humans placing blocks)
	private void takeAction(Player p) {
		// TODO - figure out if the player should take an action,
		//		- and execute it if so
	}
	
	//move the given player in the given direction
	private void moveCharacter(Player p, String dir) {
		//TODO - move the given player in the given direction
	}
	
	//have the given player attack what's in front of them
	private void attack(Player p) {
		// TODO - have the given player attack what's in front of them
		//		- do damage to the player or block in front of them
	}
	
	//place a bock in front of the given human player
	private void placeBlock(Human h) {
		// TODO - place a block element into the space in front of the human player
	}
}
