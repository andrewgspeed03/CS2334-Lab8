/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public class IsoscelesTrapezoid extends Polygon {
	
	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(top, base, leg, leg);
		this.top = top;
		this.base = base;
		this.leg = leg;
		triangleBase =(Math.abs(base - top)) / 2;
		height = Math.sqrt(Math.pow(leg, 2) - Math.pow(triangleBase, 2));
		area = (top + base) * height / 2;
	}
	
	public double getTop(){
		return top;
	}
	public double getBase() {
		return base;
	}
	public double getLeg() {
		return leg;
	}
	public double getArea() {
		return area;
	}
	public Rectangle getCenterRectangle() {
		double temp = 0;
		
		if (base < top)
			temp = base;
		else 
			temp = top;
		
		Rectangle output = new Rectangle(temp, height);
		return output;
	}
	
}
