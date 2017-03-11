import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GMap extends JPanel {
	
	private static final Color FLOOR			= new Color (100,100,100);
	private static final Color WALL				= new Color (200,200,200);
	private static final Color PLAYER_HUMAN		= new Color (100, 50,  0);
	private static final Color PLAYER_ZOMBIE	= new Color (  0, 50,100);
	private static final Color NPC_HUMAN		= new Color ( 50,100,  0);
	private static final Color NPC_ZOMBIE		= new Color ( 50,  0,100);
	
	private static final int TILE_SIZE = 20;
	
	private int cols;
	private int rows;
	
	private Color[][] mapGrid;
	
	public GMap(int rowsIn, int colsIn) {
		rows = rowsIn;
		cols = colsIn;
		mapGrid = new Color[cols][rows];
	}
	
	public void parseMap(Map mapIn) {
		for (int i = 0; i < cols; ++i) {
			for (int j = 0; j < rows; ++j) {
				
				Color c;
				
				Element e = mapIn.getElement(i,j);
				String eType = e.getType();
				
				switch (eType) {
					case "Floor"	: c = FLOOR;
					case "Wall"		: c = WALL;
					case "pHuman"	: c = PLAYER_HUMAN;
					case "pZombie"	: c = PLAYER_ZOMBIE;
					case "nHuman"	: c = NPC_HUMAN;
					case "nZombie"	: c = NPC_ZOMBIE;
					default			: c = FLOOR;
				}
				
				mapGrid[i][j] = c;
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//clear board
		int mapWidth	= cols*TILE_SIZE;
		int mapHeight	= rows*TILE_SIZE;
		g.clearRect(0, 0, mapWidth, mapHeight);
		//draw tiles
		for (int i = 0; i < cols; ++i) {
			for (int j = 0; j < rows; ++j) {
				//upper left corner of current tile
				int x = i*TILE_SIZE;
				int y = j*TILE_SIZE;
				Color c = mapGrid[i][j];
				g.setColor(c);
				g.fillRect(x, y, x+TILE_SIZE, y+TILE_SIZE);
			}
		}
		
	}
	
}
