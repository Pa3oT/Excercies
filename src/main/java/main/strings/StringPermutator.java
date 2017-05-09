package main.strings;

import java.util.ArrayList;

/**
 * Created by user on 5/18/2015.
 */
public class StringPermutator {

    public static void main(String[] args) {
        System.out.println( permutations("12"));
    }

    static ArrayList<String> permutations(String s) {
        if (s == null) {
            return null;
        }

        ArrayList<String> resultList = new ArrayList<String>();

        if (s.length() < 2) {
            resultList.add(s);

            return resultList;
        }

        int length = s.length();
        char currentChar;

        for (int i = 0; i < length; i++) {
            currentChar = s.charAt(i);

            String subString = s.substring(0, i) + s.substring(i + 1);

            ArrayList<String> subPermutations = permutations(subString);

            for (String item : subPermutations) {
                resultList.add(currentChar + item);
            }
        }

        return resultList;
    }
}
