package heroicfantasy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import heroicfantasy_interface.Scene;

public class Run {

	public static void main(String[] args) {

			
		Humain aragorn = new Humain("Aragorn",1,0);
		Elfe legolas = new Elfe("Legolas",5,5);
		Nazgul isildur = new Nazgul("Isildur", 7, 4, 50);
		Fellbeast fellbeast = new Fellbeast("Fellbeast",7,4,30,100);
		Hobbit frodon = new Hobbit("Frodon",8,1);
		
		
		//Monture
		isildur.setMonture(fellbeast);
		System.out.println(isildur.getVitesse());
		System.out.println(fellbeast.getVitesse());
		//Descendre monture
		isildur.setMonture(null);	
		

		aragorn.setSkin(Scene.assetPath + "heros\\aragorn.png");
		legolas.setSkin(Scene.assetPath + "heros\\legolas.png");
		isildur.setSkin(Scene.assetPath + "heros\\nazgul.png");
		frodon.setSkin(Scene.assetPath + "heros\\frodon.png");

		
		Anneau sauron = frodon.creeAnneauDeSauron();
		sauron.metAuDoigt();
		

		//Start scene
		Scene forge = new Scene("Bree - Forge du Poney", "forge");
		forge.addIndividu(aragorn);
		forge.addIndividu(legolas);
		forge.addIndividu(isildur);
		forge.addIndividu(frodon);
		// Ajout Grid
		forge.setGrid();
		
		// Afficher Scene
		forge.setVisible(true);
	}

}
