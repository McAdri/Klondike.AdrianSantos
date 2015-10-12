package klondike;


public class Coordinate {

	private int option;
	private static final int MAX_OPTIONS = 9;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(1,9);
	
	public Coordinate(){
		
	}
	
	public void optionsWrite(){
		String title = "Opcion [1-9]: ";
		System.out.println("1. Mover de baraja a descarte");
		System.out.println("2. Mover de descarte a baraja");
		System.out.println("3. Mover de descarte a palo");
		System.out.println("4. Mover de descarte a escalera");
		System.out.println("5. Mover de escalera a palo");
		System.out.println("6. Mover de escalera a escalera");
		System.out.println("7. Mover de palo a escalera");
		System.out.println("8. Voltear en escalera");
		System.out.println("9. Salir");
		this.option = new LimitedIntDialog(title,MAX_OPTIONS).read();
	}
	
	public void endKlondike(){
		System.out.println("Adios");
		System.exit(0);
	}
}
