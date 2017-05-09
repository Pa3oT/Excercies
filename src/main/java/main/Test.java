package main;

public class Test {

    public static void main(String[] args) {
        f(1);
    }

    public static void f(int i) {
        System.out.print("" + i);
        if (i < 7) {
            f1(2 * i);
        }
    }
    public static void f1(int i) {
        System.out.print("" + i);
        if (i < 7) {
            f2(2 * i);
        }
    }
    public static void f2(int i) {
        System.out.print("" + i);
        if (i < 7) {
            f3(2 * i);
        }
    }
    public static void f3(int i) {
        System.out.print("" + i);
        if (i < 7) {
            f(2 * i);
        }
    }
}
