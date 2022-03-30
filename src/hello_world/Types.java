package hello_world;

public class Types {

	
	public static void testeur() {
		
		
		// declarations
				int entier;
				double avirgule;
				char carac;
				boolean b;
				String ch;

				// affectation de valeurs
				entier = 17;
				avirgule = 14.369;
				carac = 'u';
				b = true;
				ch = "Bonjour";


				// affectation d�expressions avec op�rateurs
				entier = 4 * entier + 12;
				avirgule = avirgule / 12.36;
				b = b || true; // ou logique
				ch = "salut " + "les copains"; // concatenation de chaines

				// affichage console methode traditionnelle
				System.out.println(entier);
				System.out.println(avirgule - 1.1);
				System.out.println(b);
				System.out.println(ch + " !");
				
				// saisie au clavier
				Terminal.ecrireStringln("Saisir un entier :");
				entier = Terminal.lireInt();
				Terminal.ecrireStringln("Saisir un nombre � virgule :");
				avirgule = Terminal.lireDouble();
				Terminal.ecrireStringln("Saisir un caract�re :");
				carac = Terminal.lireChar();
				Terminal.ecrireStringln("Saisir un boolean :");
				b = Terminal.lireBoolean();
				Terminal.ecrireStringln("Saisir un string :");
				ch = Terminal.lireString();
				
				// affichage � l��cran m�thode class Terminal
				Terminal.ecrireIntln(entier);
				Terminal.ecrireDoubleln(avirgule - 1.1);
				Terminal.ecrireCharln(carac);
				Terminal.ecrireBooleanln(b);
				Terminal.ecrireStringln(ch + " !");
		
	}
	
}
