package main.algoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		int number;
		boolean isPrime = true;
		try {
			number = Integer.parseInt(br.readLine());
			for (int j = 1; j < number; j++) {
				isPrime = true;
				for (int i = 2; i < j; i++) {
					if (j % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime)
					System.out.println(j + "\n");
			}
		} catch (NumberFormatException nef) {
			System.out.println("invalid number");
		} catch (IOException e) {
			System.out.println("IO error" + e);
		}
	}
}

