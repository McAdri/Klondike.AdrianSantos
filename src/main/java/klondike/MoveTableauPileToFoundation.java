package klondike;

import java.util.ArrayList;

public class MoveTableauPileToFoundation extends Controller{

	protected MoveTableauPileToFoundation(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Coordinate coordinate = new Coordinate();
		coordinate.optionsWriteTableauPileToFoundation();
		
		Card cardToMove = tableau.getTableauPiles().get(coordinate.getOption()-1).getLastCard(); 
		
		String cad = "";
				
		ArrayList<Foundation> foundations = tableau.getFoundations();
		for(int i = 0;i<foundations.size();i++){
			if(cardToMove.getSuit() == foundations.get(i).getSuit()){
				if(cardToMove.getNum()-1 == foundations.get(i).getNumLastCard()){
					tableau.getTableauPiles().get(coordinate.getOption()-1).getRemoveCard();
					foundations.get(i).addCard(cardToMove);
				}
				else{
					cad = "Error, movimiento no posible";
				}
			}
		}
		
		return cad;
	};
}
