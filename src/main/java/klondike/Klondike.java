package klondike;

public class Klondike {

	private Tableau tableau;
	
	public Klondike() {
		tableau = new Tableau();
		while(! tableau.existKlondike()){
			ControllerFactory controllerFactory = new ControllerFactory(tableau);
			Turn turn = new Turn(tableau);
			controllerFactory.getControllerFactory(turn.getOption()).action();
		}
	}
	
	public static void main(String[] args) {
		new Klondike();
	}
}
