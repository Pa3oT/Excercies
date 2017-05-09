package main.strings;

public class StringRecursion {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(insertInto("*", s.length(), s));
    }

    public static String insertInto(String c, int i, String s) {
        if (s.isEmpty()) {
            return "";
        }
        return s.charAt(0) + c + insertInto(c, i - 1, s.substring(1));
    }
}
