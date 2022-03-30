package heroicfantasy;

public class Fellbeast extends Familier implements Monstre {
	private int force;

	public Fellbeast(String n, int x, int y, int v, int force) {
		super(n, x, y, 30);
		this.force = force;
	}

	public int getPuanteur() {
		return 50;
	}

	public void attaque(Individu i) {
			i.setPointsVie(Math.max(0, i.getPointsVie() - this.force));
	}

	public String parler() {
		return "Coaaxxxxxx";
	}
}