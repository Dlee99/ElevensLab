/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "nine"};

		String[] suits = {"blue", "red"};

		int[] pointValues = {11, 12, 11};

		Deck d = new Deck(ranks, suits, pointValues);

		String[] ranks2 = {"jack", "queen", "king"};

		String[] suits2 = {"blue", "red",};

		int[] pointValues2 = {11, 12, 13};

		Deck d2 = new Deck(ranks2, suits2, pointValues2);

		String[] ranks3 = {"jack", "ten", "king"};

		String[] suits3 = {"blue", "red"};

		int[] pointValues3 = {11, 10, 13};

		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println(d3.deal().toString());
		System.out.println(d.isEmpty());
		System.out.println(d2.toString());
	}
}
