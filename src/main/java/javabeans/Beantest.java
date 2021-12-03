package javabeans;

import java.util.ArrayList;

class BeanTest {

	public static void main(String[] args) {

		Album Hits = new Album(1, "Eagles", "Their Greatest Hits", 1973, 38000000, "rock");
		Album Thriller = new Album(2, "Michael Jackson", "Thriller", 1982, 34000000, "pop");
		Album Cali = new Album(3, "Eagles", "Hotel California", 1976, 26000000, "soft rock");

		Author Nin = new Author(1, "Anaïs", "Nin");
		Author Toni = new Author(2, "Toni", "Morrison");
		Author Lewis = new Author(3, "C.S.", "Lewis");

		Quote quote1 = new Quote(1, Nin, "We write to taste life twice, in the moment and in retrospect.");
		Quote quote2 = new Quote(2, Toni, "If there's a book that you want to read, but it hasn't been written yet, then you must write it.");
		Quote quote3 = new Quote(3, Lewis, "You can make anything by writing.");

		System.out.println(quote1.getText());

		ArrayList<Quote> quotes = new ArrayList<>();
		quotes.add(quote1);
		quotes.add(quote2);
		quotes.add(quote3);

		for (Quote quote : quotes) {
			System.out.println("Author: " + (quote.getAuthor()).getFirst_name() + " " + (quote.getAuthor()).getLast_name());
			System.out.println("Quote: " + quote.getText() + "\n");
		}

	}
}