package usantatecla.movies.v24;

public class MovieBuilder {

	private String title;

	private int price;

	public MovieBuilder() {
		title = "movieName";
	}

	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}


}
