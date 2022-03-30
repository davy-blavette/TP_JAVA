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

		//2. Parcourir tous les �l�ments d�un ArrayList, en utilisant la boucle for.
		for (String lang : languages) {
			System.out.println(lang);
		}
		
		// 3. Ins�rer l'�l�ment en troisi�me position
		languages.add(2, "Pascal");
		
		// 4. R�cup�rer le troisi�me �l�ment
		String lang = languages.get(2);
		System.out.println("Le troisi�me �l�ment: " + lang);

		// 5. Mettre � jour le troisi�me �l�ment avec "COBOL"
		languages.set(2, "COBOL");
		System.out.println(languages);
		
		// 6. Supprimer le troisi�me �l�ment
		languages.remove(2);
		System.out.println("Apr�s la suppression : " + languages);
		
		// 7. Trouver la valeur Java
		if (languages.contains("Java")) {
			System.out.println("L'�l�ment existe dans la liste");
		} else {
			System.out.println("L'�l�ment n'existe pas dans la liste");
		}
	}
}
