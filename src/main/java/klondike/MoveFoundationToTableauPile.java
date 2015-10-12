package klondike;

import java.util.ArrayList;

public class MoveFoundationToTableauPile extends Controller{

	protected MoveFoundationToTableauPile(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Coordinate coordinate = new Coordinate();
		coordinate.optionsWriteFoundationToTableauPile();
		
		Card cardToMove = tableau.getFoundations().get(coordinate.getOption()).getLastCard(); 
		Card cardDestiny = tableau.getTableauPiles().get(coordinate.getOption2()-1).getLastCard();
		
		String cad = "";
				
		if(cardDestiny.getSuit()!=cardToMove.getSuit() && cardDestiny.getNum()-1==cardToMove.getNum()){
			tableau.getFoundations().get(coordinate.getOption()).getRemoveCard();
			tableau.getTableauPiles().get(coordinate.getOption2()-1).addCard(cardToMove);
		}else{
			cad = "Error, movimimiento no permitido";
		}
		
		return cad;
	};
}
