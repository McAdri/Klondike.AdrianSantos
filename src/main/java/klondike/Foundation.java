package klondike;

import java.util.Stack;

public class Foundation {

	private Suit suit;
	private Stack<Card> cards;
	
	public Foundation(Suit suit){
		this.suit = suit;
		cards = null;
	}
	
	public String toString(){
		return "Palo "+this.suit+": "+cards.get(cards.size()).toString();
	}
}
