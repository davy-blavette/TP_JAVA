package cocktail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cocktail {

	private String name;
	public List<Ingredient> ingredients;

	public Cocktail(String name) {
		this.name = name;
		this.ingredients = new ArrayList<Ingredient>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addIngredient(Ingredient ing) {
		this.ingredients.add(ing);
	}

	public Ingredient getIngredient(int index) {
		return this.ingredients.get(index);
	}

	// methode surcharge Override
	public String toString() {
		
		
		String s = this.name + "[";
		for (int i = 0; i < this.ingredients.size(); i++) {
			if (i > 0)
				s += ", ";
			s += this.ingredients.get(i);
		}
		s += "]";
		return s;
	}

}
