package main.algoritm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloseNumber {
    private List<Integer> integerList;
    private int primeNumber;

    public CloseNumber(int primeNumber) {
        this.primeNumber = primeNumber;
    }

    public CloseNumber(List<Integer> integerList, int primeNumber) {
        this.integerList = integerList;
        this.primeNumber = primeNumber;
    }

    public void findCloseNumber() {
        findCloseNumber(integerList);
    }

    public void findCloseNumber(List<Integer> integerList) {
        int number1 = 0;
        int number2 = 0;
        Collections.sort(integerList);
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i).equals(primeNumber)) {
                if (i > 0) {
                    number1 = integerList.get(i - 1);
                }
                if (i < integerList.size() - 1) {
                    number2 = integerList.get(i + 1);
                }
                break;
            }
        }
        System.out.println(compareNumbers(number1, number2));
    }

    public int compareNumbers(int number1, int number2) {
        int result1 = primeNumber - number1;
        int result2 = Math.abs(primeNumber - number2);
        if (result1 < result2) {
            return number1;
        } else if (result1 > result2) {
            return number2;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        integers.add(1);
        integers.add(200);
        integers.add(-200);
        integers.add(-1400);
        integers.add(1400);
        integers.add(1000);
        integers.add(-1);
        integers.add(998);
        integers.add(-999);
        integers.add(999);
        integers.add(1001);
        integers.add(1002);
        integers.add(-1002);
        integers.add(-1001);
        integers.add(-998);
        CloseNumber solveProblem1 = new CloseNumber(1000);
        System.out.println(solveProblem1.compareNumbers(999, 1002));

        CloseNumber solveProblem21 = new CloseNumber(integers, 1000);
        solveProblem21.findCloseNumber();

    }
}
