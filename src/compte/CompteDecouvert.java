package compte;

public class CompteDecouvert extends Compte {
	private double decouvertAutorise = 500;

	public CompteDecouvert(String tit, int num) {
		super(tit, num);
	}

	public double getDecouvert() {
		return decouvertAutorise;
	}

	public void setDecouvert(double decouv) {
		if (decouv < 0) {
			throw new IllegalArgumentException("Un montant ne peut pas être négatif");
		} else {
			decouvertAutorise = decouv;
		}
	}

	public void retirer(double montant) {
		if (montant < 0) {
			throw new IllegalArgumentException("Un montant ne peut pas être négatif");
		} else if (solde - montant < -decouvertAutorise) {
			throw new IllegalArgumentException("Dépassement du découvert autorisé");
		} else {
			solde = solde - montant;
		}
	}
}
