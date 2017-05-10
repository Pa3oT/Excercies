package main.algoritm;

public class Fibonacci {
	public static void main(String args[]) {
		int j = 5;
		System.out.println(fib(j));
}

	public static boolean ehFibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		do {
			int tempFibFirst = fib1;
			fib1 = fib2;
			fib2 = tempFibFirst + fib2;
		}
		while (fib2 < n);
		return fib2 == n;
	}

	public static int fib(int arg) {
		//System.out.print(" " + arg);
		if (arg <= 1) {
			return 1;
		} else {
			return fib(arg - 2) + fib(arg - 1);
		}
	}
}
