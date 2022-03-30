package heroicfantasy;

public class Nazgul extends Personnage implements Guerrier, Monstre {
	private int force;

	public Nazgul(String n, int x, int y, int force) {
		super(n, x, y, 5);
		this.force = force;
	}

	public int getForce() {
		return this.force;
	}

	public void attaque(Individu i) {
			i.setPointsVie(Math.max(0, i.getPointsVie() - this.force));
			this.setPointsVie(Math.max(0, this.getPointsVie() + (i.getPointsVie() / 10)));
	}

	public String parler() {
		return "Les ténèbres et l'ombre de la mort";
	}


	public int getPuanteur() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		
		return "Nazgul";
		
	}
}