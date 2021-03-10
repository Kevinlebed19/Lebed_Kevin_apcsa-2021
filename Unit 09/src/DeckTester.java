/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A", "B", "C"};
		String[] ranks2 = {"Jack", "Queen", "King"};
		String[] ranks3 = {"10", "9", "8"};
		String[] suits1 = {"Spades"};
		String[] suits2 = {"Spades", "Clubs"};
		String[] suits3 = {"Hearts", "Clubs", "Diamonds"};
		int[] vaules1 = {1, 2, 3};
		int[] vaules2 = {4, 5, 6};
		int[] vaules3 = {10, 9, 8};
		Deck deck1 = new Deck(ranks1, suits1, vaules1);
		Deck deck2 = new Deck(ranks2, suits2, vaules2);
		Deck deck3 = new Deck(ranks3, suits3, vaules3);
		deck1.isEmpty();
		deck2.isEmpty();
		deck3.isEmpty();
		deck1.size();
		deck2.size();
		deck3.size();
		deck1.deal();
		deck2.deal();
		deck3.deal();
	}
}
