package main.strings;

public class MyIndexOf {
   static String string = "01011111101";
   static String subString = "01";


    private static String  subString (int pos1, int pos2) {
        StringBuilder sb = new StringBuilder();
        for (int i = pos1; i < pos2 + 1; i++) {
            sb.append(string.charAt(i));
        }
        return String.valueOf(sb);
    }
    private  static int indexOf(String subString) {
        int ret = -1;
        for (int i = 0;i < string.length() - 1; i++) {
            if (string.charAt(i) == subString.charAt(0)) {
                String subStractString = subString(i, i + subString.length() - 1);
                if (subStractString.equalsIgnoreCase(subString)) {
                    ret = i;
                    break; //если убрать то, станет lastIndexOf
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
            System.out.println("String = " + string );
            System.out.println("SubString = " + subString );
            int subStringPosition = indexOf(subString);
            System.out.println("The subString position is " + subStringPosition);
    }
}
