package klondike;

import java.util.ArrayList;

public class Turn {

	private Deck deck;
	private Waste waste;
	private ArrayList<Foundation> foundations;
	private ArrayList<TableauPile> tableauPiles;
	
	public Turn(Deck deck,Waste waste,ArrayList<Foundation> foundations,ArrayList<TableauPile> tableauPiles){
		this.deck = deck;
		this.waste = waste;
		this.foundations = foundations;
		this.tableauPiles = tableauPiles;
		tableauSituation();
		optionsWrite();
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
	
	public void optionsWrite(){
		System.out.println("1. Mover de baraja a descarte");
		System.out.println("2. Mover de descarte a baraja");
		System.out.println("3. Mover de descarte a palo");
		System.out.println("4. Mover de descarte a escalera");
		System.out.println("5. Mover de escalera a palo");
		System.out.println("6. Mover de escalera a escalera");
		System.out.println("7. Mover de palo a escalera");
		System.out.println("8. Voltear en escalera");
		System.out.println("9. Salir");
		System.out.print("Opcion [1-9]:");;
	}
	
}
