package klondike;


public class Coordinate {

	private int option;
	private int option2;
	private int option3;
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
	
	public void optionsWriteWasteToTableauPile(){
		String title = "¿A que escalera? [1-7]: ";
		
		this.option = new LimitedIntDialog(title,7).read();
	}
	
	public void optionsWriteTableauPileToFoundation(){
		String title = "¿De que escalera? [1-7]: ";
		
		this.option = new LimitedIntDialog(title,7).read();
	}
	
	public void optionsWriteTableauPileToTableauPile(){
		String title = "¿De que escalera? [1-7]: ";
		
		this.option = new LimitedIntDialog(title,7).read();
		
		title = "¿Cuantas cartas?: ";
		this.option2 = new LimitedIntDialog(title,7).read();
		
		title = "¿A que escalera? [1-7]: ";
		this.option3 = new LimitedIntDialog(title,7).read();
	}
	
	public void optionsWriteFoundationToTableauPile(){
		String title = "¿De que palo? [1-4]: ";
		
		this.option = new LimitedIntDialog(title,4).read();
		
		title = "¿A que escalera? [1-7]: ";
		
		this.option = new LimitedIntDialog(title,7).read();
	}
	
	public void optionsFlip(){
		String title = "¿De que escalera? [1-7]: ";
		
		this.option = new LimitedIntDialog(title,7).read();
	}
	
	public int getOption(){
		return option;
	}
	
	public int getOption2(){
		return option2;
	}
	
	public int getOption3(){
		return option3;
	}

}
