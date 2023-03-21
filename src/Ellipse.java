/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public class Ellipse extends Shape{
	
	private double a;
	private double b;
	
	public Ellipse(double a, double b) {
		if(a <= 0 || b <= 0) 
			throw new IllegalArgumentException("Nonpositive value(s) provided for the constructor");
		else if(a < b)
			throw new IllegalArgumentException("Semi-major axis length cannot be less than semi-minor axis length");
		this.a = a;
		this.b = b;		
	}
	
	public double getArea() {
		double area = Math.PI * a * b;
		return area;
	}
	public double getPerimeter() {
		double perm = 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
		return perm;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
}
