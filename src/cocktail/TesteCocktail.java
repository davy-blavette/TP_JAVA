package cocktail;

public class TesteCocktail {

	public static void main(String[] args) {
		
		// Ajouter les stocks
		Stock rhum = new Stock("rhum cubain", 150);
		new Stock("citrons verts", 200);
		new Stock("sucre de canne", 100);
		new Stock("eau gazeuse", 1000);
		
		//Afficher stock
		System.out.println(Stock.afficherStock());
		
		Cocktail mojito = new Cocktail("Mojito");

		mojito.addIngredient(new Ingredient("rhum cubain", 6));
		mojito.addIngredient(new Ingredient("citrons verts", 3));
		mojito.addIngredient(new Ingredient("sucre de canne", 2));
		mojito.addIngredient(new Ingredient("eau gazeuse", 38));
		
		System.out.println(mojito);
		//Vous pouvez réaliser 25 Mojito Il vous manque une bouteille de rhum cubain 
		System.out.println(Stock.nombreCocktail(mojito));		
		
		//Ajout Rhum
		rhum.setQuantity(300);
		//Afficher stock
		System.out.println(Stock.afficherStock());
		System.out.println(Stock.nombreCocktail(mojito));	
	}

}
