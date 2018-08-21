package shapes;

public class Rectangle extends Shape  {
	
	private int width;
	private int height;
	
	public Rectangle(String color) {
		super(color);
	}	
	
	public Rectangle(String color, int height, int width) {
		super(color);
		this.height = height;
		this.width  = width;
	}

    public void setWidth(int width) {
        this.width = width;
    }    

    public void setHeight(int height) {
        this.height = height;
    }

	@Override
	public double getArea() {
		
		return this.width * this.height;
	}

	@Override
	public String toString() {
		return super.toString() 
		+ " and my area is: " + this.getArea();
	}	
}
