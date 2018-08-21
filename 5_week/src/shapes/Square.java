package shapes;

public class Square extends Rectangle {

	public Square(String color) {
		super(color);
	}

	@Override
	public void setWidth(int aWidth) {
		super.setWidth(aWidth);
		super.setHeight(aWidth);
	}

	@Override
	public void setHeight(int aHeight) {
		super.setWidth(aHeight);
		super.setHeight(aHeight);
	}	
}
