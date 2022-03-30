package heroicfantasy;

public class NainGuerrier extends Nain implements Guerrier {
	private int force;

	public NainGuerrier(String nom, int x, int y, int force) {
		super(nom, x, y);
		this.force = force;
	}

	public void attaque(Individu i) {
		i.setPointsVie((i.getPointsVie() * (100 - this.force)) / 100);
	}

	public int getForce() {
		return this.force;
	}
	
	// methode surcharge Override
	public String toString() {
		
		return super.toString() + " guerrier de force " + this.force;
		
	}
}
