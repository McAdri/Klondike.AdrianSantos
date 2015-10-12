package klondike;

import java.util.ArrayList;

public class Turn {

	private Deck deck;
	private Waste waste;
	private ArrayList<Foundation> foundations;
	private ArrayList<TableauPile> tableauPiles;
	
	private Coordinate coordinate;
	
	public Turn(Deck deck,Waste waste,ArrayList<Foundation> foundations,ArrayList<TableauPile> tableauPiles){
		this.deck = deck;
		this.waste = waste;
		this.foundations = foundations;
		this.tableauPiles = tableauPiles;
		tableauSituation();
		coordinate = new Coordinate();
		coordinate.optionsWrite();
	}
	
	public void tableauSituation(){
		System.out.println("Baraja: "+deck.toString());
		System.out.println("Descarte: "+waste.toString());
		for(int i=0;i<foundations.size();i++){
			System.out.println(foundations.get(i).toString());;
		}
		for(int i=0;i<tableauPiles.size();i++){
			System.out.println(tableauPiles.get(i).toString());
		}
		
		System.out.println("---------------------");
	}
	
	
	
}
