package main.strings;

public class ReturnOnlyDigits {

    public static void main(String args[]) {
        System.out.println(onlyDigits("123sa34sdf"));
    }

    public static int onlyDigits(String s) {
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        int firstDigit = -1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size -1; i ++) {
            if(Character.isDigit(charArray[i])) {
                if(firstDigit == -1)
                    firstDigit = i;
            } else {
                if(firstDigit >= 0)
                    sb.append(s.substring(firstDigit, i));
                firstDigit = -1;
            }
        }
        return Integer.valueOf(sb.toString());
    }
}
