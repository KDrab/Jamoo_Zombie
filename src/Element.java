import java.awt.Point;

public class Element {
	
	//the x- y- position of the element
	Point position;
	
	//default constructor
	public Element() {
		//set the position to an invalid position so it must be changed later
		position = new Point(-1,-1);
	}
	
	//constructor w/ given point
	public Element(Point p) {
		position = p;
	}
	
	//returns the position of the element
	public Point getPosition() {
		return position;
	}
	
	//sets the position of the element
	public void setPosition(Point p) {
		position = p;
	}
}
