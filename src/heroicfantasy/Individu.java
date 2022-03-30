package heroicfantasy;

import java.util.ArrayList;
import java.util.List;

import heroicfantasy_interface.Scene;

public abstract class Individu {

	static List<Individu> individus = new ArrayList<Individu>();
	
	private String nom, skin;
	private int pointsVie, experience, x, y;
	private Scene scene = null;

	protected int vitesse;
	
	public Individu(String n, int x, int y, int v) {
		this.nom = n;
		this.x = x;
		this.y = y;
		this.setVitesse(v);
		this.setExperience(0);
		this.setPointsVie(100);
		individus.add(this);

	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPointsVie() {
		return this.pointsVie;
	}

	public void setPointsVie(int pv) {
		this.pointsVie = pv;
	}

	public String getNom() {
		return this.nom;
	}

	public int getVitesse() {
		return this.vitesse;
	}

	public void setVitesse(int v) {
		this.vitesse = v;
	}
	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int xp) {
		this.experience = xp;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
	
	public String getSkin() {
		return this.skin;
	}
	
	
	
	/** Le personnage se deplace dans la direction (dx,dy) durant un temps t. */
	public void seDeplacer(int dx, int dy, int t) {
		this.x = (int) (this.x + dx * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
		this.y = (int) (this.y + dy * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
	}

	public abstract String parler();

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

}
