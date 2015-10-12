package klondike;

public class MoveWasteToDeck extends Controller{
	
	protected  MoveWasteToDeck(Tableau tableau) {
		super(tableau);
	}

	@Override
	public String action(){
		for(int i=0;i<tableau.getWaste().getSize();i++){
			Card card = tableau.getWaste().removeCard();
			card.setCovered(true);
			tableau.getDeck().addCard(card);
		}
		return "";
	};
}
