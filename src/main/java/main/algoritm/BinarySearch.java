package main.algoritm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 3));
        recBinarySearch(3, array, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int key) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length;
        int mid = 0;

        while (!(left >= right)) {
            mid = left + (right - left) / 2;
            if (array[left] == key) {
                return left;
            }
            if (array[mid] == key) {
                if (mid == left + 1) {
                    return mid;
                } else {
                    right = mid + 1;
                }
            } else if ((array[mid] > key) ^ array[0] > array[array.length - 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -(1 + left);
    }

    private static int recBinarySearch(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi + lo) / 2;
        if (key < a[mid]) {
            return recBinarySearch(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return recBinarySearch(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
