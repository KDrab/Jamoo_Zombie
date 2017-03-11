import java.awt.Point;

public class Wall extends Element {

	public Wall(Point position) {
		super(position);
	}
	
	public String getType() {
		return "Floor";
	}
	
}
