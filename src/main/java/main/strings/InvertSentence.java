package main.strings;

public class InvertSentence {

    public static void main(String[] args) {
        String s1 = "acb12";
        String s2 = "acb121";
		/*System.out.println("Original string is " + s1 +
                ", Inverted string is " + invertWorld(s1));
		System.out.println("Original string is " + s2 +
				", Inverted string is " + reverseRecursion(s2));*/
    }

    public static String invertWorld(String s) {
        char[] chars = s.toCharArray();
        if (!s.isEmpty() && s != null) {
            for (int i = 0; i < s.length() / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[s.length() - 1 - i];
                chars[s.length() - 1 - i] = temp;
            }
        }
        return String.valueOf(chars);
    }

    /*
    reverse("Hello")
    (reverse("ello")) + "H"
    ((reverse("llo")) + "e") + "H"
    (((reverse("lo")) + "l") + "e") + "H"
    ((((reverse("o")) + "l") + "l") +"e")+"H"
    (((("o") + "l") + "l") + "e") + "H"
    "olleH"
    */
    public static String reverseRecursion(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverseRecursion(str.substring(1)) + str.charAt(0);
    }
}