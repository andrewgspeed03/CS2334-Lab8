/*
 * @author Andrew Chen-Goodspeed
 * CS 2334 - Fall
 */
import java.util.Comparator;

public class ShapeIDComparator implements Comparator<Shape>{

	public int compare(Shape s1, Shape s2) {
		int ID_1 = s1.getID();
		int ID_2 = s2.getID();
		
		if (ID_1 < ID_2)
			return -1;
		else if (ID_2 < ID_1)
			return 1;
		else
			return 0;
	}
}
