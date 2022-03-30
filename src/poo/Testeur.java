package poo;

import java.util.Iterator;

public class Testeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte martin = new Compte("Martin");
		Compte robert = new Compte("Robert");
		Compte luc = new Compte("Luc");
		//robert.setNom("Robert");
		
		System.out.println("Mon Solde de Martin " + martin.getSolde());
		
		martin.credit(1000);
		robert.credit(2000);
		robert.credit(1000);
		
		System.out.println("Mon Solde de Martin " + martin.getSolde());
		System.out.println("Mon Solde de Robert " + robert.getSolde());
		
		System.out.println("Le capital de ma banque " + Compte.capital);
		//System.out.println(robert);

		for (Compte compte : Compte.comptes) {
			System.out.println(compte);
		}
	}

}
