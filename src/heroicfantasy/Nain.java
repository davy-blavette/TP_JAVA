package heroicfantasy;

public class Nain extends Humanoide {
	
	public Nain(String nom, int x, int y) {
		super(nom, x, y, 2);
	}

	public String parler() {
		return "Groumpf";
	}
	
	// methode surcharge Override
	public String toString() {
		
		return "Nain";
		
	}
	
}
