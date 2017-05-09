package main.algoritm;

import java.util.Random;

public class RandomIntGenerator {
	public static final void main(String[] args) {
		log("Generating random integers in the range 1..10.");
		int START = 1;
		int END = 10;
		Random random = new Random();
		for (int i = 1; i <= 15; i++) {
			showRandomInteger(START, END, random);
		}
		log("Done.");
	}

	private static void showRandomInteger(int nStart, int nEnd, Random aRanNum) {
		if (nStart > nEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
//get the range, casting to long to avoid overflow problems
		long range = (long) nEnd - (long) nStart + 1;
		long fraction = (long) (range * aRanNum.nextDouble());
		int randomNumber = (int) (fraction + nStart);
		log("Generated : " + randomNumber);
	}

	private static void log(String aMessage) {
		System.out.println(aMessage);
	}
}
