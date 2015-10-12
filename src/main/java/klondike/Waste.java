package klondike;

import java.awt.event.ContainerAdapter;
import java.util.Stack;

import org.junit.experimental.theories.Theories;

public class Waste {

	private Stack<Card> cards;
	
	public Waste(){
		cards = null;
	}
	
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public String toString(){
		String situation = "";
		if(cards==null){
			situation = "<vacio>";
		}
		else{
			for(int i=0;i<3;i++){
				situation.concat(cards.get(i).toString());
			}
		}
		return situation;
	}
	
	public int getSize(){
		return cards.size();
	}
	
	public Card getFirstCard(){
		return this.cards.get(0);
	}
	
	public Card removeCard(){
		return this.cards.pop();
	}
}
