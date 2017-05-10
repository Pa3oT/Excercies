package main.algoritm;

public class Factorial {
	public static void main(String args[]) {
		System.out.println(calculate(4));
		//System.out.println(iterableFact(4));
	}

	public static int calculate(int n) {
		if (n <= 1) return 1;
		return n * calculate(n - 1);
	}

	public static int iterableFact(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result = i * result;
		}
		return result;
	}
}
