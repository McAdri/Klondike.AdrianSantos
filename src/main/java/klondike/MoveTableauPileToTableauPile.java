package klondike;

import java.util.ArrayList;

public class MoveTableauPileToTableauPile extends Controller{

	protected MoveTableauPileToTableauPile(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Coordinate coordinate = new Coordinate();
		coordinate.optionsWriteTableauPileToTableauPile();
		
		Card cardDestiny = tableau.getTableauPiles().get(coordinate.getOption3()-1).getLastCard(); 
		Card cardToMove = tableau.getTableauPiles().get(coordinate.getOption()-1).getCard(coordinate.getOption2()-1);
		String cad = "";
				
		if(cardDestiny.getSuit() == cardToMove.getSuit() && (cardDestiny.getNum()-1)==cardToMove.getNum()){
			for(int i = 0;i<coordinate.getOption2();i++){
				cardToMove = tableau.getTableauPiles().get(coordinate.getOption()-1).getRemoveCard();
				tableau.getTableauPiles().get(coordinate.getOption3()-1).addCard(cardToMove);
			}
		}
		else{
			cad = "Error, movimeinto no permitido";
		}
		
		return cad;
	};
}
