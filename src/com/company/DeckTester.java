package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "jack"};

		String[] suits = {"blue", "red", "red"};

		int[] pointValues = {11, 12, 11};

		Deck d = new Deck(ranks, suits, pointValues);

		String[] ranks2 = {"jack", "queen", "king"};

		String[] suits2 = {"blue", "red", "blue"};

		int[] pointValues2 = {11, 12, 13};

		Deck d2 = new Deck(ranks2, suits2, pointValues2);

		String[] ranks3 = {"jack", "ten", "king"};

		String[] suits3 = {"blue", "red", "blue"};

		int[] pointValues3 = {11, 10, 13};

		Deck d3 = new Deck(ranks3, suits3, pointValues3);
	}
}
