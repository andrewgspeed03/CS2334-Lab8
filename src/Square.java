/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public class Square extends Rectangle{
	
	public Square(double side) {
		super(side, side);
	}
	public double getSide() {
		return getWidth();
	}
}
