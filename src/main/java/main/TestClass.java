package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass implements  Cloneable{
    static String s[] = {"java", "test", "lets", "see", "what", "happens"};

    static String s1 = "123455";
    static String reversedString ="";
    public static void main(String args[]) {

       // System.out.println(reverse(s1));
        findDublicate(s1);
    }



    public static String reverse(String string) {
        if(string.length() == 1) {
            return string;
        } else {
          reversedString  = reversedString + string.charAt(string.length() -1) +
                    reverse(string.substring(0, string.length() -1));
            return reversedString;
        }
    }

     static void findDublicate(String rawString) {
        Map<Character, Integer> map = new HashMap<>(rawString.length());
        for(int i =0; i < rawString.length(); i++) {
            char simbol = rawString.charAt(i);
            if(map.containsKey(simbol)) {
                map.put(simbol, map.get(simbol) + 1);
            } else {
                map.put(simbol, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
