package klondike;

import java.util.ArrayList;

public class ControllerFactory {

	private ArrayList<Controller> controllers;
	private Tableau tableau;
	
	public ControllerFactory(Tableau tableau){
		assert tableau != null;
		this.tableau = tableau;
		
		this.controllers = new ArrayList<Controller>();
		controllers.add(new MoveDeckToWaste(tableau));
		controllers.add(new MoveWasteToDeck(tableau));
		controllers.add(new MoveWasteToFoundation(tableau));
		controllers.add(new MoveWasteToTableauPile(tableau));
		controllers.add(new MoveTableauPileToFoundation(tableau));
		controllers.add(new MoveTableauPileToTableauPile(tableau));
		controllers.add(new MoveFoundationToTableauPile(tableau));
		controllers.add(new MoveFlip(tableau));
	}
	
	public Controller getControllerFactory(int i){
		return controllers.get(i);
	}
}
