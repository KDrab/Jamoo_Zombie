import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Game {

	//The game manager manages all game components
	private GameManager gm;
	//Listen for key presses
	private KeyListener listener;
	//Holds graphics
	private JFrame frame;
	
	//the game is currently running
	private boolean running = true;
	
	//setup the game including the map, key listeners, graphics
	public void initialize() {
		
		// TODO - choose map size (maybe make #define)
		int width = 10;
		int height = 10;
		gm.initialize(width, height);
		
		// TODO - anything else that needs to be initialized
		//	- Graphics and key listener
	}
	
	//start running the game, this starts the main game loop
	public void start() {
		while(running) {
			//TODO - do stuff
		}
	}
	
	//progress the game one tick - move characters, take actions, etc..
	private void tick() {
		//tell the Game Manager to move all the NPCs
		gm.moveNPCs();
		// TODO - handle player actions
	}
	
	// TODO - anything else the Game needs to do?
}
