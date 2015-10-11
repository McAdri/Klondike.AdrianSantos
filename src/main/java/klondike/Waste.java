package klondike;

import java.util.Stack;

public class Waste {

	private Stack<Card> cards;
	
	public Waste(){
		cards = null;
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
}
