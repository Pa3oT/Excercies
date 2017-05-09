package main;

import java.util.ArrayList;

public class IntegerPool {

    public static void main(String[] args) {
        IntHolder intHolder = new IntHolder(1);
        f(intHolder);
        System.out.println(intHolder);

        ArrayList<String> company = new ArrayList();
        company.add("eBay");
        company.add("Paypal");
        company.add("Google");

        for (String s : company) {
            System.out.println(s);
            company.remove("Google");
        }
    }

    private static void f(IntHolder intHolder) {
        intHolder = null;
    }

}

class IntHolder {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    int i;
    public IntHolder(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "IntHolder{" +
                "i=" + i +
                '}';
    }
}