package main.algoritm;

public class Factorial {
	public static void main(String args[]) {
		//System.out.println(calculate(4));
		//System.out.println(iterableFact(4));

		int i = -2;
		int j = -30;

		i = i + j; //5
		j = i - j; //2
		i = i - j; //3
		System.out.println("i = " + i);
		System.out.println("j = " + j);
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
