package heroicfantasy;

import java.util.ArrayList;
import java.util.List;



public class Testeur {

	public static void main(String[] args) {
		
		List<Personnage> personnages = new ArrayList<Personnage>();
		
		Humanoide gandalf = new Humain("Gandalf",1,1);
		Humanoide aragorn = new Humain("Aragorn",1,1);
		Humanoide legolas = new Elfe("Legolas",1,1);
		NainGuerrier gimli = new NainGuerrier("Gimli",1,1,5);
		Humanoide fili = new NainGuerrierVoleur("Fili",1,1,3,2);
		Humanoide frodon = new Hobbit("Frodon",200,100);
		

		Anneau sauron = frodon.creeAnneauDeSauron();
		sauron.metAuDoigt();
		
		Anneau anneau = gimli.creeAnneauDeSauron();
		sauron.metAuDoigt();
		
		personnages.add(gandalf);
		personnages.add(aragorn);
		personnages.add(legolas);
		personnages.add(gimli);
		personnages.add(fili);
		personnages.add(frodon);
		
		for (Personnage heros : personnages) {
			System.out.print(heros.parler() + "! Je suis " + heros.getNom());
			System.out.print(". Ma vitesse est de " + heros.getVitesse() + " km/h. " + heros);
			System.out.println(". Je suis " + (heros.getVisible() ? "visible" : "invisible"));
		}
		
		Arme anduril = new Arme("Anduril", 1000, 10);		
		System.out.println("Aragorn acquire Anduril");
		aragorn.acquiertObjet(anduril);		
		frodon.setPointsVie(100);
		System.out.println("Frodon à " + frodon.getPointsVie() + " pv");
		System.out.println("Aragorn attaque \"par erreur\" Frodon");
		aragorn.attaque(frodon, anduril);
		System.out.println("Frodon à " + frodon.getPointsVie() + " pv");
		
		//fenetre
		//JFrame forge = new Scene("Forge du Poney");

	}
}
