package main.algoritm.sort;

import java.util.Arrays;

public class BubbleSorter {
    static int[] mas = new int[]{6, 5, 4, 3, 2, 1};

    public static void main(String args[]) {
        iteratorBubbleSort();
        //bubbleSorted(mas, 0, mas.length - 1);
        System.out.println(Arrays.toString(mas));
        int[] arr = {-1, 10, -999, 20, 1, 2, 3, -100, 200, 20000, 99999, -99999};
        System.out.println(Arrays.toString(recursiveBubbleSort(arr, arr.length-1)));
    }

    static void iteratorBubbleSort() {
        for (int barrier = mas.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (mas[index] > mas[index + 1]) {
                    swap(index, index + 1);
                }
            }
        }
    }

    private static void bubbleSorted(int[] arg, int first, int last) {
        if(first < last && last > 0){
            if(arg[first] > arg[first+1]) {
                swap(first, first + 1);
            }
            bubbleSorted(arg, first+1, last);
            bubbleSorted(arg, first, last-1);
        }
    }

    static int[] recursiveBubbleSort(int[] list, int n) {
        if (n == 0) {
            return list; //finished sorting
        }

        int temp;
        for (int i = 0; i < n; i++) {
            if (list[i] > list[i+1]) {
                temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }
        }
        return recursiveBubbleSort(list, n-1);
    }

    static void swap(int first, int second) {
        int temp = mas[first];
        mas[first] = mas[second];
        mas[second] = temp;
    }
}
