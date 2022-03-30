package heroicfantasy;

import java.util.ArrayList;
import java.util.List;

public abstract class Personnage extends Individu {

	private static boolean nbSauron = false;


	private int sous;

	private boolean visible = true;
	private Familier monture = null;

	

	public Personnage(String n, int x, int y, int v) {
		super(n, x, y, v);
		this.setSous(0);

	}

	public int getSous() {
		return this.sous;
	}

	public void setSous(int s) {
		this.sous = s;
	}


	public void setVisible(boolean b) {
		this.visible = b;
	}

	public boolean getVisible() {
		return this.visible;
	}

	public int getVitesse() {
		if(this.monture != null) {
			return (int) Math.round(this.monture.getVitesse());
		}else {
			return this.vitesse;
		}
	}
	

	
	public Anneau creeAnneauDeSauron() {
		if (!nbSauron) {
			nbSauron = true;
			return new AnneauDeSauron(this);
		}
		return null;
	}
	
	public Familier getMonture() {
		return this.monture;
	}

	public void setMonture(Familier f) {
		if (f == null) {
			this.monture.setCavalier(null);
			this.monture = null;
		}else {
			this.monture = f;
			f.setCavalier(this);
			
		}

	}



}
