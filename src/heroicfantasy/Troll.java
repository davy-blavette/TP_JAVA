package heroicfantasy;

public class Troll extends Personnage implements Monstre {
	private int force;

	public Troll(String n, int x, int y, int v, int force) {
		super(n, x, y, v);
		this.force = force;
	}

	public int getPuanteur() {
		return 200;
	}

	public void attaque(Individu i) {
		if (!(i instanceof Troll))
			i.setPointsVie(Math.max(0, i.getPointsVie() - this.force - this.getPuanteur() / 10));
	}

	public String parler() {
		return "Hiark";
	}
}