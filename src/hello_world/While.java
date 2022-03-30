package hello_world;

public class While {

	public static void main(String[] args) {
		int note;
		Terminal.ecrireString("Entrez votre note: ");
		note = Terminal.lireInt();
		while (note < 0 || note > 20) {
			Terminal.ecrireStringln("Vous vous êtes trompé");
			Terminal.ecrireStringln("La note doit être comprise entre 0 et 20");
			Terminal.ecrireStringln("Veuillez recommencer");
			Terminal.ecrireString("Entrez votre note: ");
			note = Terminal.lireInt();
		}
		Terminal.ecrireStringln("Votre note est " + note);

		for (int i = 1; i < 10; i = i + 1) {
			Terminal.ecrireStringln(i + " kilomètre(s) à pied, ça use, ça use");
			Terminal.ecrireStringln("ça use les souliers");
		}

		int[] tab;
		tab = new int[8];
		tab[0] = 1;
		for (int i = 1; i < 8; i++) {
			tab[i] = tab[i - 1] * 2;
		}
		// affichage du tableau
		for (int i = 0; i < 8; i++) {
			Terminal.ecrireIntln(tab[i]);
		}

		boolean[][] pres = new boolean[7][24];
// les trois premiers jours, la personne est la de 4H00 à 12H00
		for (int jour = 0; jour < 3; jour++) {
			for (int heure = 4; heure < 12; heure++) {
				pres[jour][heure] = true;
			}
		}
// enseuite, deux jours de repos et deux jours du soir
		for (int jour = 5; jour < 7; jour++) {
			for (int heure = 16; heure < 24; heure++) {
				pres[jour][heure] = true;
			}
		}
// affichage
		for (int heure = 0; heure < 24; heure++) {
			for (int jour = 0; jour < 7; jour++) {
				if (pres[jour][heure]) {
					Terminal.ecrireString("XXX");
				} else {
					Terminal.ecrireString("	");
				}
			}
			Terminal.ecrireStringln("");
		}

	}

	double moyenne(double[] tab) {
		double somme = 0.0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		return somme / tab.length;
	}
}
