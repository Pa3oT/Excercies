package main.oop.polimorphism;

public class PolimorfTest1 {
}

class A1 {
    void m1(A1 a) {
        System.out.print("A");
    }
}

class B1 extends A1 {
    void m1(B1 b) {
        System.out.print("B");
    }
}

class C extends B1 {
    void m1(B1 c) {
        System.out.print("C");
    }
}

class D {
    public static void main(String[] args) {
        A1 obj = new C();
        obj.m1(new B1());
    }

    public void go() {
        A1 param = new A1();
        Object obj = getObject(param);
    }

    public Object getObject(Object o) {
        return o;
    }
}
