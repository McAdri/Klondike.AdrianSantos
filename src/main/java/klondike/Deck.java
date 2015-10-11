package klondike;

import java.util.Stack;

public class Deck {

	public static final int NUM_CARDS_PER_SUIT = 12;
	private Stack<Card> cards;
	
	public Deck(){
		startDeck();
	}
	
	public void startDeck(){
		for(Suit suit: Suit.values()){
			for(int i=1; i <= NUM_CARDS_PER_SUIT; i++){
				cards.push(new Card(suit,i));
			}
		}
	}
}
