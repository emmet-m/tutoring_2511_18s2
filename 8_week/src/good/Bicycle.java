package good;

import java.util.List;

public class Bicycle extends BicycleComponent {

	private List<BicycleComponent> parts;
	private float assemblyCost;
	
	public Bicycle(float cost,float assemblyCost) {
		super(cost);
		this.assemblyCost = assemblyCost;
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
