package klondike;

import java.util.ArrayList;

public class Turn {

	private Tableau tableau;
	private int option;
	private Coordinate coordinate;
	
	public Turn(Tableau tableau){
		assert tableau != null;
		
		this.tableau = tableau;
		tableauSituation();
		coordinate = new Coordinate();
		coordinate.optionsWrite();
		this.option=coordinate.getOption();
	}
	
	public void tableauSituation(){
		System.out.println("Baraja: "+tableau.getDeck().toString());
		System.out.println("Descarte: "+tableau.getWaste().toString());
		for(int i=0;i<tableau.getFoundations().size();i++){
			System.out.println(tableau.getFoundations().get(i).toString());;
		}
		for(int i=0;i<tableau.getTableauPiles().size();i++){
			System.out.println(tableau.getTableauPiles().get(i).toString());
		}
		
		System.out.println("---------------------");
	}
	
	public int getOption(){
		return option;
	}
	
}
