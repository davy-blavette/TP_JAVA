package heroicfantasy;

public class NainGuerrierVoleur extends NainGuerrier implements Voleur {
	private int dexterite;

	public NainGuerrierVoleur(String nom, int x, int y, int force, int dexterite) {
		super(nom, x, y, force);
		this.dexterite = dexterite;
	}

	public void voler(Personnage p) {
		if (p.getSous() >= this.dexterite) {
			p.setSous(p.getSous() - this.dexterite);
			this.setSous(this.getSous() + this.dexterite);
		} else {
			this.setSous(this.getSous() + p.getSous());
			p.setSous(0);
		}
	}

	public int getDexterite() {
		return this.dexterite;
	}
	
	public String toString() {
		
		return super.toString() + " et voleur de dexterité " + this.dexterite;
		
	}
}