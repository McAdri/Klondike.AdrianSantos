package klondike;

import java.util.Stack;

public class TableauPile {

	private int num;
	private int max_cards_beginning;
	private Stack<Card> cards;
	
	public TableauPile(int num){
		this.num = num;
		this.max_cards_beginning = num;
	}
	
	public String toString(){
		String situation = "Escalera "+num+": ";
		for(int i=0; i<cards.size();i++){
			situation.concat(cards.get(i).toString());
		}
		return situation;
	}
}
