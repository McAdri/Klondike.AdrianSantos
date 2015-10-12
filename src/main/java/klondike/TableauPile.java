package klondike;

import java.awt.event.ContainerAdapter;
import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TableauPile {

	private int num;
	private int maxCardsBeginning;
	private Stack<Card> cards;
	
	public TableauPile(int num){
		this.num = num;
		this.maxCardsBeginning = num;
	}
	
	public String toString(){
		String situation = "Escalera "+num+": ";
		for(int i=0; i<cards.size();i++){
			situation.concat(cards.get(i).toString());
		}
		return situation;
	}
	
	public int getMaxCardsBeginning(){
		return maxCardsBeginning;
	}
	
	public void setCards(Card card){
		this.cards.add(card);
	}
	
	public Card getLastCard(){
		return cards.get(cards.size()-1);
	}
	
	public Card getRemoveCard(){
		return cards.pop();
	}
	
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public Card getCard(int i){
		return cards.get(i);
	}
}
