package usantatecla.movies.v24;

public abstract class Movie {

	private static final int FREQUENT_RENTER_POINTS = 1;

	private String title;
	private int price;
	
	public Movie(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return FREQUENT_RENTER_POINTS;
	}
	
	public String getTitle() {
		return title;
	}
	
}
