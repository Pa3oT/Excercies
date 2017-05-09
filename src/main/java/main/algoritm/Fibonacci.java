package main.algoritm;

public class Fibonacci {
	public static void main(String args[]) {
		int j = 5;
		fib2(j);
		/*fib(j);
		fib1(j);
			if (ehFibonacci(j)) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
		}*/
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
		System.out.print(" " + arg);
		if (arg == 0) {
			return 1;
		}	else if (arg == 1) {
			return 1;
		}	else {
			return fib(arg - 2) + fib(arg - 1);
		}
	}

	public static int fib1(int arg) {
		int result = 0;
		if (arg == 0) {
			return 1;
		}	else if (arg == 1) {
			return 1;
		}	else {
			result = fib(arg - 2) + fib(arg - 1);
		}
		System.out.print(" " + arg);
		return result;
	}

	public static  int fib2(int arg) {
		return 	arg < 2 ? 1 : fib2(arg - 2) + _(arg) + fib2(arg - 1);
	}

	public static int  _(int arg) {
		System.out.print(" " + arg);
		return 0;
	}
}
