package constructeurs;

public class TesteDate {

	public static void main(String[] arguments) {
		Date d1 = new Date();
		Date d2 = new Date(2, 12, 2000);
		d1.afficherDate();
		d2.afficherDate();
		d2.passerAuLendemain();
		d2.afficherDate();

	}
}
