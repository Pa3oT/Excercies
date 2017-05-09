package main.algoritm;

import java.util.*;

public class FrequencySorter {
    public static void main(String[] args) {
        int nums[] = {0, 0, 0, 1, 3, 3, 2, 1, 3, 5, 6, 0};
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (Integer element : nums) {
            if (counts.containsKey(element)) {
                counts.put(element, counts.get(element) + 1);
            } else {
                counts.put(element, 1);
            }
        }


        ValueComparator<Integer, Integer> bvc = new ValueComparator<Integer, Integer>(counts);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(bvc);
        sortedMap.putAll(counts);

        ArrayList<Integer> output = new ArrayList<Integer>();
        for (Integer i : sortedMap.keySet()) {
            for (int c = 0; c < sortedMap.get(i); c++) {
                output.add(i);
            }
        }

        System.out.println(output.toString());

    }
}

class ValueComparator<T1,T2 extends Comparable<T2>> implements Comparator<T1> {
    Map<T1,T2> base;
    public ValueComparator(Map<T1,T2> base) {
        this.base = base;
    }

    @Override
    public int compare(T1 k1, T1 k2) {
        T2 val1 = base.get(k1);
        T2 val2 = base.get(k2);

        return val1.compareTo(val2);
    }
}
