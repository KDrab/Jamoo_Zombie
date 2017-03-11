import java.awt.Point;
import java.util.ArrayList;

public class Map {
	
	private Element[][] grid;
	private int cols;
	private int rows;
	
	public Map(int widthIn, int heightIn) {
		cols = widthIn;
		rows = heightIn;
		grid = new Element[cols][rows];
		
		for (int i = 0; i < widthIn; ++i) {
			for (int j = 0; j < heightIn; ++j) {
				grid[i][j] = new Element(new Point(i,j));
			}
		}
		//generate the walls on the map
		generateWalls();
	}

	//generate the locations of all walls
	private void generateWalls() {
		//choose the starting point, pass it and it's neighbors to generate the next walls
		Element start = grid[0][0];
		ArrayList<Element> neighbors = new ArrayList<Element>();
		neighbors.add(grid[1][0]);
		neighbors.add(grid[0][1]);
		generateNextWall(start, neighbors);
	}

	//take the current spot, randomly turn some neighbors into walls, recurse on open neighbors
	private void generateNextWall(Element currentIn, ArrayList<Element> neighborsIn) {
		
		//Turn the current element into a floor
		currentIn = new Floor(currentIn.getPosition());
		//Turn each neighbor into a floor. 
		//For each neighbor we turn into a floor, for each tile on either side - have a 50% chance of turning that tile into a wall.
		for (Element e: neighborsIn) {
			e = new Floor(currentIn.getPosition());
			ArrayList<Element> neighbors = new ArrayList<Element>();
			//check if we went up/down/left/right from the current tile
			int eX = e.getPosition().x;
			int eY = e.getPosition().y;
			if(eX > currentIn.getPosition().x) {
				//right
				//if position above is not out of bounds, 50% chance of turning into wall
				if (eX - 1 >= 0 && Math.round(Math.random()) == 1) {
					grid[eX-1][eY] = new Wall(new Point(eX-1,eY));
				} else {
					neighbors.add(grid[eX-1][eY]);
				}
				//if the position below is not out of bounds, 50% chance of turning into wall
				if (eX + 1 < heightIn && Math.round(Math.random()) == 1) {
					grid[eX-1][eY] = new Wall(new Point(eX-1,eY));
				} else {
					neighbors.add(grid[eX-1][eY]);
				}
			} else if (eX < currentIn.getPosition().x) {
				//left
				
			} else if (eY > currentIn.getPosition().y) {
				//down
				
			} else if (eY < currentIn.getPosition().y) {
				//up
				
			}
			
		}
 		
	}

	public Element getElement(int i, int j) {
		return grid[i][j];
	}
}
