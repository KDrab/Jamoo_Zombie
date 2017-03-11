import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Game implements KeyListener {

	private static final int MAP_WIDTH	= 10;
	private static final int MAP_HEIGHT	= 10;
	
	private GameManager gm;		//The game manager manages all game components
	private JFrame frame;
	
	private boolean running = true;	

	public void initialize() {
		gm = new GameManager();
		gm.initialize(MAP_WIDTH, MAP_HEIGHT);
		initializeGraphics();
	}
	
	private void initializeGraphics() {
		frame = new JFrame("Jamoo Zombie Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addKeyListener(this);
		
		GMap gMap = new GMap(MAP_WIDTH, MAP_HEIGHT);
		gMap.parseMap(gm.getMap());
		frame.add(gMap);
		
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}

	//start running the game, this starts the main game loop
	public void start() {
		while(running) {
			tick();
			//TODO - do stuff
		}
	}
	
	//progress the game one tick - move characters, take actions, etc..
	private void tick() {
		//tell the Game Manager to move all the NPCs
		gm.moveNPCs();
		// TODO - handle player actions
	}
	
	private void parseKey(KeyEvent keyIn) {
		
		char keyPressed = keyIn.getKeyChar();
		switch(keyPressed) {
			case 'w' : //move player up
			case 'a' : //move player left
			case 's' : //move player down
			case 'd' : //move player right
			case 'e' : //place block
		}
	}

	@Override
	public void keyPressed(KeyEvent keyIn) {
		parseKey(keyIn);
	}

	@Override
	public void keyReleased(KeyEvent keyIn) {
		
	}

	@Override
	public void keyTyped(KeyEvent keyIn) {
		
	}
	
	// TODO - anything else the Game needs to do?
}
