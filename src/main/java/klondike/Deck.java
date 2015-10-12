package klondike;

import java.util.Random;
import java.util.Stack;

public class Deck {

	private static final int NUM_TIMES_SHUFFLE = 300;
	public static final int NUM_CARDS_PER_SUIT = 12;
	private Stack<Card> cards;
	
	public Deck(){
		startDeck();
		shuffle();
	}
	
	public void startDeck(){
		for(Suit suit: Suit.values()){
			for(int i=1; i <= NUM_CARDS_PER_SUIT; i++){
				cards.push(new Card(suit,i));
			}
		}
	}
	
	public void shuffle(){
		Random randomGenerator = new Random();
		for(int i = 0;i<NUM_TIMES_SHUFFLE;i++){
			int randomInt = randomGenerator.nextInt(NUM_CARDS_PER_SUIT * Suit.values().length);
			Card extratedCard = cards.get(randomInt);
			cards.add(extratedCard);
		}
	}
	
	public String toString(){
		String situation = null;
		if(cards==null){
			situation = "<vacio>";
		}
		else{
			situation = "[X,X]";
		}
		return situation;
	}
	
	public Stack<Card> getCards(){
		return cards;
	}
	
	public void addCard(Card card){
		this.cards.add(card);
	}
}
