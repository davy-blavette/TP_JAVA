package heroicfantasy;

public class Arme extends Objet {
	private int puissance;

	public Arme(String n, int p, int pui) {
		super(n, p);
		this.puissance = pui;
	}

	public int getPuissance() {
		return this.puissance;
	}
}
