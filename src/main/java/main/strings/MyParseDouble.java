package main.strings;

public class MyParseDouble {

    /**
     * Some tests to run.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(parseDouble(".23"));
    }

    /**
     * A simple implementation that takes a number as a string and converts it
     * to a double method, similar to what <code>Double.parseDouble()</code> does.
     *
     * The following number values are supported,
     * +23
     * -23
     * +0.23
     * +.23
     * 0.23
     * .23
     * 0000.23
     * 0.23000
     *
     * @param string the string representation of the number
     * @return the double value
     * @throws NumberFormatException if the string does not represent a number or is malformed
     */
    private static double parseDouble(String num) {
        if(num == null || "".equals(num.trim())) {
            throw new NumberFormatException("Number cannot be null/empty.");
        }

        // remove any leading or trailing spaces
        num = num.trim();
        final int size = num.length();

        // holds the starting position of the digits
        int index = 0;
        boolean isNegative = false;
        boolean hasDecimal = false;

        // check for unary operators
        char first = num.charAt(0);
        switch(first) {
            case '+':
                index++;
                break;

            case '-':
                index++;
                isNegative = true;
                break;

            case '.':
                index++;
                hasDecimal = true;
                break;

            default:
                throw new NumberFormatException("Number is malformed: " + num);
        }

        // start the parsing logic

        double ip = 0.0, dp = 0.0;
        double fd = 1.0;

        for(int i = index; i < size; i++) {
            char c = num.charAt(i);
            int digit = c - '0';

            if(isNumeric(c) && digit != '0') {
                if(!hasDecimal) {
                    ip *= 10;
                    ip += digit;
                } else {
                    dp *= 10;
                    dp += digit;
                    fd *= 10;
                }
            } else if(c == '.') {
                if(hasDecimal) {
                    throw new NumberFormatException("Number is malformed: " + num);
                }

                hasDecimal = true;
            } else {
                throw new NumberFormatException("Number is malformed: " + num);
            }
        }

        // add the decimal fraction
        dp = dp / fd;
        double number = ip + dp;

        // test for negative
        if(isNegative) {
            number = 0 - number;
        }

        return number;
    }

    /**
     * Tests whether the given character is a digit or not.
     *
     * @param digit the character to be tested
     * @return <code>true</code> if character is a digit, else <code>false</code>
     */
    private static boolean isNumeric(char digit) {
        if('0' <= digit && digit <= '9') {
            return true;
        }

        return false;
    }
}
