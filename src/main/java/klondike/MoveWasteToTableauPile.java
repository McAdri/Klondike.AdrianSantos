package klondike;

public class MoveWasteToTableauPile extends Controller{

	protected MoveWasteToTableauPile(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		Coordinate coordinate = new Coordinate();
		coordinate.optionsWriteWasteToTableauPile();
		
		String cad = "";
		
		TableauPile tableauPile = tableau.getTableauPiles().get(coordinate.getOption()-1);
		
		if(tableauPile.getLastCard().getNum() == tableau.getWaste().getFirstCard().getNum()-1){
			if(tableauPile.getLastCard().getSuit() == tableau.getWaste().getFirstCard().getSuit()){
				tableauPile.addCard(tableau.getWaste().removeCard());
			}
			else{
				cad = "Error, movimiento no posible";
			}
		}
		
		return "";
	};
}
