package ArrayLists;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("7", "Clubs", 7);
		Card card2 = new Card("Ace", "Hearts", 1);
		Card card3 = new Card("King", "Spades", 0);
		card1.suit();
		card2.suit();
		card3.suit();
		card1.rank();
		card2.rank();
		card3.rank();
		card1.pointValue();
		card2.pointValue();
		card3.pointValue();
		
		card1.matches(card3);
		card2.matches(card1);
		card3.matches(card2);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		}
}
