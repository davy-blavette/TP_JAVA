package compte;

public class TesteCompte {

	public static void main(String[] args) {

		// tableau de type compte
		Compte[] tab = new Compte[10];

		for (int i = 0; i < tab.length; i++) {
			// créer successivement les dix comptes
			tab[i] = new Compte();
			// faites un dépot de 200 euros plus une somme égale à 100 fois l’indice du
			// compte dans le tableau.
			tab[i].deposer(200 + (100 * i));
		}

		for (int i = 0; i < tab.length; i++) {

			// virement de 20 euros de chaque compte vers chacun des comptes qui le suivent
			for (int j = i; j < tab.length; j++) {
				tab[i].virerVers(20, tab[j]);
			}

		}

		// soldes de tous les comptes
		for (int i = 0; i < tab.length; i++) {

			System.out.println("Compte : " + i);
			tab[i].afficher();

		}


		Compte compte1 = new Compte();
		Compte compte2 = new Compte();

		compte1.deposer(500);
		compte2.deposer(1000);
		compte2.retirer(10);
		compte1.virerVers(75, compte2);
		System.out.println("Compte test 1 : ");
		compte1.afficher();
		System.out.println("Compte test 2 : ");
		compte2.afficher();
		
		Compte compte3 = new Compte("PAP JAVA");
		compte3.deposer(500);
		System.out.println("Compte test 3 : ");
		compte3.afficher();
		compte3.changeTitulaire("JAVA TP02");
		compte3.afficher();

	}




}
