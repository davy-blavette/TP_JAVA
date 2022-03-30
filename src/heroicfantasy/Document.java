package heroicfantasy;

public class Document extends Objet {
	private int experience;

	public Document(String n, int p, int con) {
		super(n, p);
		this.experience = con;
	}

	public int getExperience() {
		return this.experience;
	}
}