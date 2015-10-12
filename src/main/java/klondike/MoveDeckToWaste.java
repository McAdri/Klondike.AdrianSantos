package klondike;

public class MoveDeckToWaste extends Controller{

	private static final int NUM_CARDS_TO_MOVE = 3;
	
	protected MoveDeckToWaste(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		for(int i=0;i<NUM_CARDS_TO_MOVE;i++){
			Card card = tableau.getDeck().getCards().pop();
			card.setCovered(false);
			 tableau.getWaste().addCard(card);
		}
		
		return "";
	};
}
