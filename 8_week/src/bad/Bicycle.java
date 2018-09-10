package bad;

public class Bicycle {
	
	private Wheel wheels;
	private Frame frame;
	private float assemblyCost;
	
	private float getCost() {
		return wheels.cost() * 2 + frame.getCost() + assemblyCost;
	}

}
