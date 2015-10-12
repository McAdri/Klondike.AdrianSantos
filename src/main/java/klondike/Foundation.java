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
	
	public Suit getSuit(){
		return suit;
	}
	
	public int getNumLastCard(){
		return cards.get(cards.size()-1).getNum();
	}
	
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public Card getLastCard(){
		return cards.get(cards.size()-1);
	}
	
	public void getRemoveCard(){
		cards.pop();
	}

}
