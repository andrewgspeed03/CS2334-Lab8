/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public class Rectangle extends IsoscelesTrapezoid {
	
	public Rectangle(double width, double height) {
		super(width, width, height);
	}
	
	public double getWidth() {
		return getTop();
	}
	public double getHeight() {
		return getLeg();
	}
}
