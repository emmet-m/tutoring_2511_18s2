package equals.badexample;
/*
 * A point class defined with two coordinates x,y
 * This class demonstrates an incorrect definition of equals()
 */
public class Point {

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// What happens if I uncomment this?
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) return true;
		if (!obj.getClass().equals(this.getClass())) return false;
		Point p = (Point) obj;
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		}
		return false;
	}
	
	public static void main (String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1.equals(p2));

		// Why is p3 not equal to p1 ?
		Object p3 = p2;
		System.out.println(p3.equals(p1));
		
	}
	
}
