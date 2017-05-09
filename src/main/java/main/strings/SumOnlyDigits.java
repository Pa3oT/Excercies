package main.strings;


public class SumOnlyDigits {

    public static void main(String args []) {
        System.out.println(sum("12as3aa"));
    }

    public static int sum(String s) {
        char[] charArray = s.toCharArray();
        int firsDigit = -1;
        int result = 0;
        for(int i = 0; i < charArray.length -1; i ++) {
            if(Character.isDigit(charArray[i])) {
                if(firsDigit == -1) {
                    firsDigit = i;
                }
            } else {
                if(firsDigit >=0) {
                    int digit = Integer.valueOf(s.substring(firsDigit, i));
                    result = result + digit;
                    firsDigit = -1;
                }
            }
        }
        return result;
    }
}
