package klondike;

public class MoveFinishcGame extends Controller{
	
	protected MoveFinishcGame(Tableau tableau) {
		super(tableau);
	}
	
	@Override
	public String action(){
		System.out.println("Adios");
		System.exit(0);
		return "";
	};
}
