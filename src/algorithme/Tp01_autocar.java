package algorithme;

public class Tp01_autocar {

	static double[] prix = { 0.00, 3.20, 1.80, 2.30, 4.20, 5.00 };
	static String[] villes = { "Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron", "La Ferté Saint-Aubin", "Orléans" };
	static double troncon;

	public static void main(String[] args) {

		System.out.println("Prix du trajet aller normal " + villes[1] + "/" + villes[4] + " : "
				+ trajet(villes[1], villes[4], false));
		System.out.println("Prix du trajet aller degressif " + villes[1] + "/" + villes[4] + " : "
				+ trajet(villes[1], villes[4], true));

		System.out.println("Prix du trajet retour normal " + villes[5] + "/" + villes[0] + " : "
				+ trajet(villes[5], villes[0], false));
		System.out.println("Prix du trajet retour degressif " + villes[5] + "/" + villes[0] + " : "
				+ trajet("Marseille", villes[0], true));
	}

	/*
	 * Méthode pour calculer prix traget avec option degressif
	 */
	public static double trajet(String name1, String name2, boolean degressif) {

		double prixtrajet = 0.00;
		double remise = 0.00;
		boolean ville2 = false;
		troncon = 0;

		try {
			// traget aller
			for (int i = 0; i < villes.length; i++) {
				// trouve la ville1
				if (villes[i] == name1) {
					for (int j = i + 1; j < villes.length; j++) {
						troncon += 1;
						if (degressif && troncon > 1) {
							remise = prix[j] * ((troncon - 1) / 10);
						}
						prixtrajet += prix[j] - remise;

						// trouve la ville2
						if (villes[j] == name2) {
							ville2 = true;
							break;
						}
					}

					// trajet retour
					if (ville2 == false) {
						prixtrajet = troncon = 0;
						for (int j = i; j >= 0; j--) {
							// trouve la ville2
							if (villes[j] == name2) {
								ville2 = true;
								break;
							}
							troncon += 1;
							if (degressif && troncon > 1) {
								remise = prix[j] * ((troncon - 1) / 10);
							}
							prixtrajet += prix[j] - remise;

						}
					}
					break;
				}
			}

			if (prixtrajet == 0 || ville2 == false) {
				// ...ou génére une erreur
				//villes[villes.length] = "Erreur";
				throw new Exception();
				
			}

		} catch (Exception ex) {
			System.out.println("Ville inconnue!");
			//throw ex;
		}

		return prixtrajet;

	}

	/*
	 * Méthode pour trouver l'index d'une ville
	 */
	public static int ville(String name) {

		try {
			for (int i = 0; i < villes.length; i++) {
				// trouve la ville
				if (villes[i] == name) {

					return i;
				}
			}

			// ...ou génére une erreur
			villes[villes.length] = "Erreur";

		} catch (Exception ex) {
			System.out.println("Ville inconnue!");
			throw ex;
		}

		return villes.length;

	}

}