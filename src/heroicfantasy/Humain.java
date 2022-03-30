package heroicfantasy;

public class Humain extends Humanoide {
	
	public Humain(String nom, int x, int y) {
		super(nom, x, y, 5);
		
	}

	public String parler() {
		return "Bonjour";
	}

	public String toString() {
		
		return "Humain";
		
	}

}