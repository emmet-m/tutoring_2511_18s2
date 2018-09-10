package good;

public class Hub extends BicycleComponent {
	
	private float weight;
	public Hub(float cost, float weight) {
		super(cost);	
	}

	@Override
	public float getWeight() {
		return weight;
	}

}
