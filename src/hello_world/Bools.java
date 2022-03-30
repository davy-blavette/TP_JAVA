package hello_world;

public class Bools {

	public static void testeur() {

		boolean b1 = true;
		boolean b2;
		Terminal.ecrireString("Entrez la valeur de b2 (true ou false): ");
		b2 = Terminal.lireBoolean();
		int x = 3;
		b1 = b1 && (b1 || b2);
		b1 = x < 10;
		b1 = (x == 10); // test si X est egal a 10
		b2 = (x != 10) && b1;
		b1 = ('a' < 'Z') || (1.2 * 38 == 57.6);
		Terminal.ecrireBooleanln(b1);
		Terminal.ecrireBooleanln(b2);

	}
}
