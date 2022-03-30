package arraylist;

import java.util.ArrayList;
import java.util.List;

public class TP_arraylist {
	public static void main(String[] args) {

		List<String> languages = new ArrayList<String>();

		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");


		//1. Affichez la collection
		System.out.println(languages);

		//2. Parcourir tous les éléments d’un ArrayList, en utilisant la boucle for.
		for (String lang : languages) {
			System.out.println(lang);
		}
		
		// 3. Insérer l'élément en troisième position
		languages.add(2, "Pascal");
		
		// 4. Récupérer le troisième élément
		String lang = languages.get(2);
		System.out.println("Le troisième élément: " + lang);

		// 5. Mettre à jour le troisième élément avec "COBOL"
		languages.set(2, "COBOL");
		System.out.println(languages);
		
		// 6. Supprimer le troisième élément
		languages.remove(2);
		System.out.println("Aprés la suppression : " + languages);
		
		// 7. Trouver la valeur Java
		if (languages.contains("Java")) {
			System.out.println("L'élément existe dans la liste");
		} else {
			System.out.println("L'élément n'existe pas dans la liste");
		}
	}
}
