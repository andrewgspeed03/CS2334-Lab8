/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
public abstract class Shape implements Comparable<Shape> {

	
	
	private int id;
	private static int nextID = 0;

	protected Shape() {
		id = nextID;
		nextID++;
	}
	
	public int getID() {
		return id;
	}
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public int compareTo(Shape other) {
		int compName = getClass().getName().compareTo(other.getClass().getName());
		
		Double perm = getPerimeter();
		Double otherPerm = other.getPerimeter();
		int compPerm = perm.compareTo(otherPerm);
		
		Double area = getArea();
		Double otherArea = other.getArea();
		int compArea = area.compareTo(otherArea);
		
		if (compName == 0)
			if (compPerm == 0) 
				if (compArea == 0) 
					return 0;
				else if (compArea > 0) 
					return 1;
				else 
					return -1;
			else if (compPerm > 0)
				return 1;
			else 
				return -1;
		else if (compName > 0)
			return 1;
		else 
			return -1;
		
	}
	
	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}