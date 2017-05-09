package main.algoritm.sort;

import java.util.Arrays;

public class SelectionSorter {
	public static int[] mas = new int[]{6, 5, 4, 3, 2, 1};

	public static void main(String[] args) {
		for (int barrier = 0; barrier < mas.length - 1; barrier++) {
			for (int index = barrier + 1; index < mas.length; index++) {
				if(mas[barrier] > mas[index])
				swap(barrier, index);
			}
		}
		System.out.println(Arrays.toString(mas));
	}

	public static void swap(int first, int second) {
		int temp = mas[first];
		mas[first] = mas[second];
		mas[second] = temp;
	}
}
