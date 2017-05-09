package main.algoritm;

public class UniqueElementFromArray {
	public static void main(String a[]) {
		int[] numbers = {5, 2, 7, 2, 4, 7, 8, 2, 3};
		UniqueElementFromArray.printUniqueEle(numbers);
	}

	public static void printUniqueEle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
