package klondike;

import java.util.ArrayList;

public class MoveWasteToFoundation extends Controller{

	protected MoveWasteToFoundation(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Card cardToMove = tableau.getWaste().getFirstCard(); 
		String cad = "";
		
		ArrayList<Foundation> foundations = tableau.getFoundations();
		for(int i = 0;i<foundations.size();i++){
			if(cardToMove.getSuit() == foundations.get(i).getSuit()){
				if(cardToMove.getNum()-1 == foundations.get(i).getNumLastCard()){
					tableau.getWaste().removeCard();
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
