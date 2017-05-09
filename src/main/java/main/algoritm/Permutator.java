package main.algoritm;

import java.util.*;

public class Permutator {
	public static int[] arr = {3,2,1};

	public static void main(String args[]) {
		try {
			permute(arr,3);
			//System.out.println(permuteUnique(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void permute(int[] arr, int size) {
		if (size < 2) {
			System.out.println(Arrays.toString(arr));
		}	else	{
			for (int k = 0; k < size; k++) {
				swap(arr, k, size);
				permute(arr, size - 1);
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : returnList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> newArray = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(newArray);
				}
			}
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);
		}

		return returnList;
	}

	private static void swap(int[] arr, int index1, int index2) {
		try {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		} catch (RuntimeException e) {
		}
	}
}