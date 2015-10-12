package klondike;

import java.util.ArrayList;

public class MoveFlip extends Controller{

	protected MoveFlip(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Coordinate coordinate = new Coordinate();
		coordinate.optionsFlip();
		
		Card cardToMove = tableau.getTableauPiles().get(coordinate.getOption()-1).getLastCard(); 
		assert cardToMove != null;
		
		String cad = "";
				
		if(cardToMove.getCovered()){
			tableau.getTableauPiles().get(coordinate.getOption()-1).getRemoveCard();
			cardToMove.setCovered(false);
			tableau.getTableauPiles().get(coordinate.getOption()-1).addCard(cardToMove);
		}
		
		return cad;
	};
}
