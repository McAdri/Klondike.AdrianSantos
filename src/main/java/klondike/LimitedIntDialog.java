package klondike;

public class LimitedIntDialog {

	private String title;
	private ClosedInterval limits;

	
	public LimitedIntDialog(String title, int max){
		this.limits = new ClosedInterval(1, max);
		this.title = title + " " + limits + ": ";
	}
	
	public int read(){
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = limits.includes(value);
			if (!ok) {
				io.writeln("El valor debe estar entre " + limits);
			}
		} while (!ok);
		return value;
	}
}
