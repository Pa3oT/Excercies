package main.algoritm.sort;

import java.util.Arrays;

public class InsertionSorter {
	public static int[] mas = new int[]{6, 5, 4, 3, 2, 1};

	public static void main(String args[]) {
		for (int barrier = 1; barrier < mas.length; barrier++) {
			int newElement = mas[barrier];
			int location = barrier - 1;
			while(location >= 0 && mas[location] > newElement) {
				mas[location + 1] = mas[location];
				location--;
			}
			mas[location + 1] = newElement;
		}
		System.out.println(Arrays.toString(mas));
	}
}
