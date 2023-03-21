/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public class Circle extends Ellipse {
	
	public Circle(double radius) {
		super(radius, radius);
	}
	
	public double getRadius() {
		return getA();
	}
	
}
