package main.algoritm;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(divisor(75, 30));
	}

	public static int divisor(int first, int second) {
		int divisor = 0;
		int counter = 0;
		if(first < second) {
			counter = first;
		} else {
			counter = second;
		}

		for(int i = counter; i > 0; i --) {
			if (first % i == 0 && second % i == 0) {
				divisor = i;
				//if delete this break operator we take smallest common divisor
				break;
			}
		}
		return divisor;
	}
}

class GreatestCommonDivisorRec {
	public static void main(String[] args) {
		System.out.println(gcd(75, 30));
	}

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		int x = a % b;
		return gcd(b, x);
	}
}
