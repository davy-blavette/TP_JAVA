package heroicfantasy;

import java.util.LinkedList;

public abstract class Humanoide extends Personnage {
	private LinkedList<Objet> objets;
	private LinkedList<Document> lus;

	public Humanoide(String n, int x, int y, int v) {
		super(n, x, y, v);
		this.objets = new LinkedList<Objet>();
		this.lus = new LinkedList<Document>();
	}

	public void acquiertObjet(Objet o) {
		this.objets.add(o);
	}

	public void perdObjet(Objet o) {
		this.objets.remove(o);
	}

	public void donnneObjet(Objet o, Humanoide h) {
		if (this.objets.remove(o))
			h.acquiertObjet(o);
	}

	public void attaque(Individu i, Arme a) {
		if (this.objets.contains(a))
			i.setPointsVie(Math.max(0, i.getPointsVie() - a.getPuissance()));
	}

	public void lit(Document d) {
		if (this.objets.contains(d) && !this.lus.contains(d)) {
			this.setExperience(this.getExperience() + d.getExperience());
			this.lus.add(d);
		}
	}

}