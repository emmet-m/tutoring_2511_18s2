package refactoring.original;

public class Rental {
	private Movie movie;
	private int daysRented;
	
	private Price price;
	
	public Rental(Movie movie, int daysRented, Price p) {
		this.movie = movie;
		this.daysRented = daysRented;
		this.price = p;
	}
	
	public int getPrice() {
		
		
		int thisAmount = 0;
		int priceCode = movie.getPriceCode();
		switch (priceCode) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (this.daysRented > 2)
					thisAmount += (this.daysRented - 2) * 1.5;
			break;
			case Movie.NEW_RELEASE:
				thisAmount += this.daysRented * 3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (this.daysRented > 3)
					thisAmount += (this.daysRented - 3) * 1.5;
			break;
		}
		return thisAmount;
	}
	
	public int getDaysRented() {
		return daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}
}
