package refactoring.original;

public class RegularPrice implements Price {

	public int getPrice(int daysRented) {
		int amount = 2;
		if (daysRented > 2)
			amount += (daysRented - 2) * 1.5;
		return amount;
	}
}
