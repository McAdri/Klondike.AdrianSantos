package klondike;

public class Card {
	private Suit suit;
	private int num;
	private boolean covered;
	
	public Card(Suit suit,int num){
		this.suit = suit;
		this.num = num;
	}
}
