package algorithme;

public class Tp04_fibonacci {

	public static void main(String[] args) {
		int nbr = 8;
		System.out.print(fibonacci(nbr));
	}

	public static int fibonacci(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
