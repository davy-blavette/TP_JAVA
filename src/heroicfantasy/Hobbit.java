package heroicfantasy;

public class Hobbit extends Humanoide {
	
	public Hobbit(String nom, int x, int y) {
		super(nom, x, y, 5);
	}

	public String parler() {
		return "Belle journée ma foi";
	}
	
	public String toString() {
		
		return "Hobbit";
		
	}
}
