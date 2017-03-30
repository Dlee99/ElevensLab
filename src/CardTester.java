/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1, c2, c3;
		c1 = new Card("Jack", "Hearts", 11);
		c2 = new Card("Jack", "Hearts", 11);
		c3 = new Card("Ace", "Spade", 1);
		System.out.println(c1.toString());
		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
	}
}
