package heroicfantasy;

public class AnneauDeSauron extends Anneau {
	
	public static Personnage porteurAnneauDeSauron = null;
	
	AnneauDeSauron(Personnage p) {
		this.nom = "Anneau de Sauron";
		porteurAnneauDeSauron = p;
	}

	public void metAuDoigt() {
		porteurAnneauDeSauron.setVisible(false);
	}

	public void enleveDuDoigt() {
		porteurAnneauDeSauron.setVisible(true);

	}
	
	
}
