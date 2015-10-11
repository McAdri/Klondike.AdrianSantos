package klondike;

public class Card {
	private Suit suit;
	private int num;
	private boolean covered;
	
	public Card(Suit suit,int num){
		this.suit = suit;
		this.num = num;
	}
	
	public String toString(){
		String card = null;
		if(covered){
			card = "["+numToCard()+","+this.suit.toString().substring(0, 1)+"]";
		}
		else{
			card = "[";
		}
		return card;
	}
	
	private String numToCard(){
		String num = null;
		if(this.num < 9){
			num = String.valueOf(this.num);
		}
		else if (this.num == 10){
			num = "J";
		}
		else if(this.num == 11){
			num = "Q";
		}
		else if(this.num == 12){
			num = "K";
		}
		return num;
	}
}
