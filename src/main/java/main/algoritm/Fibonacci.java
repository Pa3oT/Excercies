package main.algoritm;

import java.util.HashMap;

public class Fibonacci {
	public static void main(String args[]) {
		int j = 35;
		//System.out.println(fib(j));
		System.out.println(getFibonacciNumberBottomUpWithCache(j));
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

	public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	public static int getFibonacciNumberBottomUpWithCache(int n) {
		hm.put(0, 0);
		hm.put(1, 1);
		for(int i = 2; i <= n; i++) {
			hm.put(i, hm.get(i - 1) + hm.get(i - 2));
		}
		return hm.get(n);
	}
}
