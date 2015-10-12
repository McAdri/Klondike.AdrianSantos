package klondike;

import java.util.ArrayList;

public class Tableau {

	private Deck deck;
	private Waste waste;
	private Turn turn;
	private ArrayList<Foundation> foundations;
	private ArrayList<TableauPile> tableauPiles;
	public static final int NUM_MAX_TABLEAU_PILES = 7;

	
	public Tableau(){
		this.deck = new Deck();
		this.waste = new Waste();
		startFoundations();
		startTableauPiles();
	}
	
	private void startFoundations(){
		for(Suit suit: Suit.values()){
			foundations.add(new Foundation(suit));
		}
	}
	
	private void startTableauPiles(){
		for(int i = 1; i <=NUM_MAX_TABLEAU_PILES; i++){
			tableauPiles.add(new TableauPile(i));
		}
		for(int i = 1; i <=tableauPiles.size(); i++){
			for(int j=0;j<tableauPiles.get(i).getMaxCardsBeginning();j++){
				Card card = deck.getCards().pop();
				if(j+1 == tableauPiles.get(i).getMaxCardsBeginning()){
					card.setCovered(true);
				}
				tableauPiles.get(i).setCards(card);
				
			}
		}
	}
	
	public boolean existKlondike(){
		return emptyDeck() & emptyWaste() & emptyTableauPiles();
	}
	
	private boolean emptyWaste(){
		return waste == null;
	}
	
	private boolean emptyDeck(){
		return deck == null;
	}
	
	private boolean emptyTableauPiles(){
		return tableauPiles.isEmpty();
	}
	
	public Deck getDeck(){
		return deck;
	}
	
	public Waste getWaste(){
		return waste;
	}
	
	public ArrayList<Foundation> getFoundations(){
		return foundations;
	}
	
	public ArrayList<TableauPile> getTableauPiles(){
		return tableauPiles;
	}
}
