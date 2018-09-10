package good;

import java.util.List;

public class Wheel extends BicycleComponent {
	
	private float assemblyCost;
	private List<BicycleComponent> parts;

	public Wheel(float cost, List<BicycleComponent> parts) {
		super(cost);
		this.parts = parts;
	}

	@Override
	public float getWeight() {
		float totalWeight = 0;
		for (BicycleComponent part: parts) {
			totalWeight += part.getWeight();
		}
		return totalWeight;
	}
	
	@Override
	public float getCost() {
		float partsCost = 0;
		for (BicycleComponent part: parts) {
			partsCost += part.getCost();
		}
		return assemblyCost + partsCost;
	}
}
