/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public abstract class Polygon extends Shape{
	
	private double perimeter;
	
	protected Polygon(double... sides) {
		double sum = 0;
		
		if (sides == null) 
			throw new IllegalArgumentException("null sides");
		else if (sides.length < 3)
			throw new IllegalArgumentException("Invalid number of sides: " + sides.length);	
		
		for(double x : sides) {
			if(x <= 0) 
				throw new IllegalArgumentException("Nonpositive side: " + x);
			sum += x;
		}
		
		perimeter = sum;
		
		for(double t : sides) {
			sum -= t;
			if(sum <= t)
				throw new IllegalArgumentException("Polygon inequality violated: " + t + " >= " + sum);
			sum += t;
		}	
		
	}
	public double getPerimeter() {
		return perimeter;
	}
}
