package cocktail;

public class Ingredient {
	
	//protected heritage
	protected String name;
	//quantité en cl
	protected int quantity;

	public Ingredient(String name, int quantity) {
		this.name = name;
		this.quantity  =  quantity;
	}
	public String getName() {
		return this.name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}

	//Surcharge 
	public String toString() {
		return this.name + " " + this.quantity + " cl";
	}

}
