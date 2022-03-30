package algorithme;

public class Tp03_maximum {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 9, 4 };
		int max = maximum(tab);
		System.out.print(max);
	}

	public static int maximum(int[] tab) {
		int max = tab[0];
		for (int i : tab) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

}
