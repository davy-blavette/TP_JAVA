package cocktail;

import java.util.ArrayList;
import java.util.List;

public class Stock extends Ingredient {
	
	private static List<Stock> stocks = new ArrayList<Stock>();
	
	
	public Stock(String name, int quantity) {
		super(name, quantity);		
		Stock.stocks.add(this);
	}
	
	public static String afficherStock() {
		String s = "";
		for (int i = 0; i < Stock.stocks.size(); i++) {
			s += "[" + Stock.stocks.get(i).getName() + ", " + Stock.stocks.get(i).getQuantity() + " cl],";
		}
		return s;
	}
	
	public void addStock(Stock quantity) {
		Stock.stocks.set(0, quantity);
	}
	
	public static String nombreCocktail(Cocktail cocktail) {
		int nb = 0;
		int nbmini = 0;
		String message = "";
		for (int i = 0; i < cocktail.ingredients.size(); i++) {
			for (int j = 0; j < Stock.stocks.size(); j++) {

				if (Stock.stocks.get(j).getName() == cocktail.ingredients.get(i).getName()) {
					nb = Stock.stocks.get(j).getQuantity() / cocktail.ingredients.get(i).getQuantity();
					if (i == 0 || nb < nbmini) {
						nbmini = nb;
						message = "Vous pouvez réaliser " + nbmini + " " + cocktail.getName()
								+ " Il vous manque une bouteille de " + Stock.stocks.get(j).getName();
					}
				}

			}

		}
		return message;
	}
	
}
