package main.strings;

import java.util.Arrays;
import java.util.Collections;

public class SameString {

    public static boolean check(String s1, String s2) {
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        Arrays.asList(1,2,3);
        Arrays.sort(chars);
        Arrays.sort(chars1);

        return new String(chars).equals(new String(chars1));
    }

    public static void main(String[] args) {
        System.out.println(check("123", "213"));
    }
}
