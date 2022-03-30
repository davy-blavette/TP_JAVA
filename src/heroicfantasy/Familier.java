package heroicfantasy;

public abstract class Familier extends Individu {

	
	public Personnage cavalier = null;

	public Familier(String n, int x, int y, int v) {
		super(n, x, y, v);
	}
	
	protected void setCavalier(Personnage p) {
		
		this.cavalier = p;
		
	}
	
	public int getVitesse() {
		if(this.cavalier != null) {
			return (int) Math.round(this.vitesse * 0.9);
		}else {
			return this.vitesse;
		}
	}

}
