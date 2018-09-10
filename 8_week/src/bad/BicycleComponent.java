package bad;

public abstract class BicycleComponent {
	
	private float cost;
	private float weight;
	public float getWeight() {return weight; }
	public float getCost() { return cost; }
	public BicycleComponent(float cost, float weight) {
		this.cost = cost;
		this.weight = weight;
	}
}
