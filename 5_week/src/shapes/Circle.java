package shapes;

public class Circle extends Shape {

	private double radius;
	
	public Circle(String color) {
		super(color);
		// What should I do here?
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
}

