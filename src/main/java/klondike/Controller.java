package klondike;

public abstract class Controller {

	protected Tableau tableau;
	
	protected Controller(Tableau tableau){
		assert tableau != null;
		this.tableau = tableau;
	}

	public Tableau getTableau(){
		return tableau;
	}
	
	public abstract String action();
}
