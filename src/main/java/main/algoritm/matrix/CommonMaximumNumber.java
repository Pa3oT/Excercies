package main.algoritm.matrix;

public class CommonMaximumNumber {
    public static void main(String s[]) {
        int firstArray[] = {-100, -1000, -1};
        int secondArray[] = {-100, -1, -1000};
        int number = getCommonMaximumNumber(firstArray, secondArray);
        int number1 = getCommonMinimumNumber(firstArray, secondArray);
        System.out.println("The number is " + number);
        System.out.println("The number is " + number1);

    }

    public static int getCommonMaximumNumber(int firstSeries[], int secondSeries[]) {
        int maximum = 0;
        int preMaximum = Integer.MIN_VALUE;

        for (int i = 0; i < firstSeries.length; i++) {
            for (int j = 0; j < secondSeries.length; j++) {
                if (firstSeries[i] == secondSeries[j]) {
                    preMaximum = firstSeries[i];
                    if (preMaximum > maximum) {
                        maximum = preMaximum;
                    }
                }
            }
        }
        return maximum;
    }

    public static int getCommonMinimumNumber(int firstSeries[], int secondSeries[]) {
        int minimum = 0;
        int mid = Integer.MAX_VALUE;
        int temp = 0;

        for (int i = 0; i < firstSeries.length; i++) {
            for (int j = 0; j < secondSeries.length; j++) {
                if (firstSeries[i] == secondSeries[j]) {
                    temp = firstSeries[i];
                    break;
                }
            }
            if (temp < mid) {
                mid = temp;
            }
            minimum = mid;

        }
        return minimum;
    }
}
