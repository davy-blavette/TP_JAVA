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
			throw new IllegalArgumentException("Un montant ne peut pas �tre n�gatif");
		} else {
			decouvertAutorise = decouv;
		}
	}

	public void retirer(double montant) {
		if (montant < 0) {
			throw new IllegalArgumentException("Un montant ne peut pas �tre n�gatif");
		} else if (solde - montant < -decouvertAutorise) {
			throw new IllegalArgumentException("D�passement du d�couvert autoris�");
		} else {
			solde = solde - montant;
		}
	}
}
