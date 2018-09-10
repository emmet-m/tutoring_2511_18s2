package good;

public class Spoke extends BicycleComponent {

	private float weight;
	public Spoke(float cost, float weight) {
		super(cost);	
	}

	@Override
	public float getWeight() {
		return weight;
	}

	
}
