package heroicfantasy;

public class Elfe extends Humanoide {
	public Elfe(String nom, int x, int y) {
		super(nom, x, y, 7);
	}

	public String parler() {
		return "Eldarie";
	}
	
	public String toString() {
		
		return "Elfe";
		
	}
}