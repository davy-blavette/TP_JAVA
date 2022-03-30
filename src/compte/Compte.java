package compte;

public class Compte {
	double solde = 0;
	String titulaire;
	int numero;

	//constructeur par defaut
	public Compte() {
		
	}
	
	//constructeur avec titulaire
	public Compte(String titulaire) {
		this.titulaire = titulaire;
	}



	//constructeur avec titulaire et numéro
	public Compte(String titulaire, int num) {
		this.titulaire = titulaire;
		this.numero = num;
		
	}
	
	void afficher() {
		System.out.println("solde: " + solde + " nom:" + titulaire);
	}

	void deposer(int montant) {
		solde = solde + montant;
	}

	void retirer(int montant) {
		solde = solde - montant;
	}

	void virerVers(int montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}

	//changer nom du compte
	void changeTitulaire(String titulaire) {
		this.titulaire = titulaire;
		
	}

}


