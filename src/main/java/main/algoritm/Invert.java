package main.algoritm;

import java.util.Arrays;

public class Invert {

	public static void main(String args[]) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		String s = "abcdefg";
		char [] mas = s.toCharArray();
		//inversion(mas);
		//System.out.println(Arrays.toString(mas));
		recursion(array, 0);
		//inversion(array);
		System.out.println(Arrays.toString(array));
	}

	public static void inversion(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int x = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = x;
		}
	}

	public static void recursion(int[] array, int i) {
		if (i < array.length / 2) {
			int x = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = x;
			recursion(array, i + 1);
		}
	}

	public static void inversion(char[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			char x = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = x;
		}
	}
}
