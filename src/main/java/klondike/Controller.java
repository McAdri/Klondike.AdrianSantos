package klondike;

public class Controller {

	protected Tableau tableau;
	
	protected Controller(Tableau tableau){
		assert tableau != null;
		this.tableau = tableau;
	}

}
