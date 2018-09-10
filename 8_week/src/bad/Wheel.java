package bad;

public class Wheel {
	private float assemblyCost;
	private Spoke spokes;
	private Hub   hub;
	
	public float weight() {
		return hub.getWeight() + spokes.getWeight();
	}

	public float cost() {
		return assemblyCost + hub.getCost() + spokes.getWeight();
	}
}
