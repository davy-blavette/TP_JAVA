package algorithme;

public class Fibonacci_02 {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));
	}

	public static int fibonacci(int nb) {
		int[] result = new int[nb + 1];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i <= nb; i++) {

			result[i] = result[i - 1] + result[i - 2];
		}
		return result[nb];
	}

}