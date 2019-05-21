package main.algoritm.sort;

import java.util.Arrays;

public class MergeTwoSortedList {
    static int[] first = {2,10,100,101,102,103,104,105,106};
    static int[] second = {1,4,7,9,10,20,30,40};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(first, second)));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];
        while (i < a.length)
            answer[k++] = a[i++];
        while (j < b.length)
            answer[k++] = b[j++];
        return answer;
    }
}
