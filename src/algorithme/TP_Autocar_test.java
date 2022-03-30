package algorithme;

import java.util.stream.IntStream;

public class TP_Autocar_test {

	static String[] tabVilles = { "Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron", "La Ferté Saint-Aubin",
			"Orléans" };
	static double[] tabPrix = { 3.20, 1.80, 2.30, 4.20, 5.00 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///objet
		//TP_Autocar_test test = new TP_Autocar_test();		
		//System.out.println(test.indiceVille("Lamotte-Beuvron"));
		System.out.println(indiceVille("Lamotte-Beuvron"));
		System.out.println(CalculTrajet(tabVilles[0], tabVilles[5]));
		
	}
	
	public static int indiceVille(String ville) {

		int indice = -1;

		for (int i = 0; i < tabVilles.length; i++) {
			if (ville == tabVilles[i]) {
				indice = i;
			}
		}

		return indice;

	}

	public static float CalculTrajet(String Depart, String Arrivee) {
		int IndexDepart = indiceVille(Depart);
		int IndexArrivee = indiceVille(Arrivee);
		int indexMin = Integer.min(IndexDepart, IndexArrivee);
		int indexMax = Integer.max(IndexDepart, IndexArrivee);

		return (float) IntStream.range(indexMin, indexMax).mapToDouble(i -> tabPrix[i]).sum();
	}
}
