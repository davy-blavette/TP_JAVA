package poo;

import java.util.ArrayList;
import java.util.List;

public class Compte {

	
	private double solde = 0;
	private String nom = "";
	public static double capital = 0;
	public static List<Compte> comptes = new ArrayList<Compte>();
	

	Compte(String nom){
		
		this.nom = nom;
		comptes.add(this);
		
	}
	
	private String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		
		this.solde = solde;
	}
	
	public double credit(double montant) {
		
		this.solde +=  montant;
		capital += montant;
		return solde;
		
	}
	
	public String toString() {
		
		return "Ce compte est au nom de " + this.getNom();
		
	}
	
}
