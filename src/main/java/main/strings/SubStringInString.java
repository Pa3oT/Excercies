package main.strings;

public class SubStringInString {
    public static void main(String[] args) {
        System.out.println("\nResult = "
                + findMe(" findMe", "Can you findMe from this String?"));
    }

    public static boolean findMe(String subString, String mainString) {
        boolean foundme = false;
        int max = mainString.length() - subString.length();

        // Java's Default "contains()" Method
        System.out.println(mainString.contains(subString) ? "mainString.contains(subString) Check Passed.."
                : "mainString.contains(subString) Check Failed..");

        // Implement your own Contains Method with Recursion
        checkrecusion:
        for (int i = 0; i <= max; i++) {
            int n = subString.length();

            int j = i;
            int k = 0;

            while (n-- != 0) {
                if (mainString.charAt(j++) != subString.charAt(k++)) {
                    continue checkrecusion;
                }
            }
            foundme = true;
            break checkrecusion;
        }
        System.out
                .println(foundme ? "\nImplement your own Contains() Method - Result: Yes, Match Found.."
                        : "\nImplement your own Contains() Method - Result:  Nope - No Match Found..");
        return foundme;
    }
}

