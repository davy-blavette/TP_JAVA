package algorithme;

public class Tp02_reverse {

	public static void main(String[] args) {
		String rev = reverse("WayToLearnX");
		System.out.print(rev);
	}

	public static String reverse(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res += str.charAt(str.length() - i - 1);
		}
		return res;
	}
}
